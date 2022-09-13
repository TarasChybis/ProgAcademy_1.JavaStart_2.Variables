package home_work_6_5b_OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;

public class FileMonitor implements Runnable {

	private File folder;
	private File[] files1;
	private File[] files2;
	private File log;

	SimpleDateFormat sdf = new SimpleDateFormat("y:MM:dd:HH:mm:ss");

	public FileMonitor(File folder) {

		if (!folder.isDirectory()) {
			System.out.println("ADRESS IS NOT A DIRECTORY");
			System.exit(0);
		}
		this.folder = folder;

		createLog();

		Thread thr = new Thread(this);
		thr.start();
	}

	private void createLog() {
		log = new File(folder, "log.txt");
		try {
			log.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		initializeLog(log);
	}

	private void initializeLog(File log) {
		files1 = folder.listFiles();
		try (PrintWriter pw = new PrintWriter(log)) {
			pw.println("MONITORED DIRECTORY: " + folder);
			pw.println("FILE MONITOR LAUNCHED: " + sdf.format(System.currentTimeMillis()));
			pw.println("INITIAL STATE: ");
			for (File file : files1) {
				pw.println(file.getName());
			}
			pw.println();
			pw.println("============================================");
			pw.println();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		for (;;) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			compareFilesNumber();
		}
	}

	private void compareFilesNumber() {
		files2 = folder.listFiles();
		if (files1.length > files2.length) {
			compareFilesName(files1, files2, " REMOVED: ");
		}
		if (files1.length < files2.length) {
			compareFilesName(files2, files1, " CREATED: ");
		}
		files1 = files2;
	}

	private void compareFilesName(File[] biggerList, File[] smallerList, String result) {
		for (int i = 0; i < biggerList.length; i++) {
			boolean match = false;
			for (int j = 0; j < smallerList.length; j++) {
				if (biggerList[i].getName().compareTo((smallerList[j].getName())) == 0) {
					match = true;
				}
			}
			if (!match) {
				appendLog(result + biggerList[i].getName());
			}
		}
	}

	private void appendLog(String result) {
		try (FileWriter fw = new FileWriter(log, true); PrintWriter pw = new PrintWriter(fw)) {
			pw.println(sdf.format(System.currentTimeMillis()) + " OBJECT WAS" + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public File getLog() {
		return log;
	}

}
