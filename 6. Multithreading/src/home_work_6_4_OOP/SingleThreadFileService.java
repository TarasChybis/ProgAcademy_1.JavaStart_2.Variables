package home_work_6_4_OOP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

public class SingleThreadFileService implements Runnable {

	private List<File> filesList;
	private int start;
	private int end;
	private File folderOut;
	
	private long bytes;
	
	Thread thr;

	public SingleThreadFileService(List<File> filesList2, int start, int end, File folderOut) {
		super();
		this.filesList = filesList2;
		this.start = start;
		this.end = end;
		this.folderOut = folderOut;
		thr = new Thread(this);
		thr.start();
	}
	
	public Thread getThr() {
		return thr;
	}

	public long getBytes() {
		return bytes;
	}

	private void copy(File fileIn, File fileOut) {
		try (InputStream is = new FileInputStream(fileIn); OutputStream os = new FileOutputStream(fileOut)) {
			bytes += is.transferTo(os);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		for (int i = start; i < end; i++) {
			File file = new File(folderOut, filesList.get(i).getName());
			copy(filesList.get(i), file);
		}
	}

}
