package home_work_7_2_OOP;

import java.io.File;
import java.io.IOException;

public class MultiThreadFileService {

	private byte[] bytesArray;

	private boolean turn;
	private boolean stop;

	public static void copy(File folderOut, File fileIn) throws IOException {
		new MultiThreadFileService(folderOut, fileIn);
	}
	
	private MultiThreadFileService(File folderOut, File file) throws IOException {
		Thread thr1 = new Thread(new Provider(this, file));
		Thread thr2 = new Thread(new Receiver(this, folderOut, file.getName()));

		thr1.start();
		thr2.start();

		try {
			thr1.join();
			thr2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public synchronized byte[] getBytesArray() {

		for (; !turn;) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		turn = false;
		notifyAll();
		return bytesArray;
	}

	public synchronized void setBytesArray(byte[] bytesArray) {
		for (; turn;) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.bytesArray = bytesArray;
		turn = true;
		notifyAll();
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
