package home_work_7_2_OOP;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Receiver implements Runnable {

	private MultiThreadFileService service;
	private File file;

	public Receiver(MultiThreadFileService service, File folderOut, String fileName) throws IOException {
		super();
		this.service = service;
		file = new File(folderOut, fileName);

		file.createNewFile();

	}

	@Override
	public void run() {

		try (OutputStream os = new FileOutputStream(file)) {
			for (; !service.isStop();) {
				os.write(service.getBytesArray());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
