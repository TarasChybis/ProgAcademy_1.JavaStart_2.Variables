package home_work_7_2_OOP;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Provider implements Runnable {

	private MultiThreadFileService service;
	private File file;
	private int buffer = 1_000_000;
	private long length;
	private long available;
	private ProgressPrinter pp = new ProgressPrinter();

	public Provider(MultiThreadFileService service, File file) {
		super();
		this.service = service;
		this.file = file;
		length = file.length();
		available = length;
	}

	private class ProgressPrinter implements Runnable {

		@Override
		public void run() {
			for (; available > 0;) {
				System.out.println((int) ((length - available) / (length / 100)) + "% copied");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(100 + "% copied");
		}

	}

	@Override
	public void run() {
		Thread thr = new Thread(pp);
		thr.start();
		try (InputStream is = new FileInputStream(file)) {

			byte[] bytesArray = new byte[(int) (length % buffer)];
			readAndSend(is, bytesArray);

			for (; available > 0;) {
				bytesArray = new byte[buffer];
				readAndSend(is, bytesArray);
			}

			service.setStop(true);
			thr.join();
		} catch (InterruptedException | IOException e) {
			e.printStackTrace();
		}
	}

	private void readAndSend(InputStream is, byte[] bytesArray) throws IOException {
		is.read(bytesArray);
		service.setBytesArray(bytesArray);
		available -= bytesArray.length;
	}

}
