package home_work_6_4_OOP;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MultiThreadFileService {

	public static long copyFolder(File folderIn, File folderOut, int threadNumber) {

		List<File> fl = getFilesList(folderIn);
		int flSize = fl.size();

		if (threadNumber > flSize) {
			threadNumber = flSize;
		}

		SingleThreadFileService[] threads = new SingleThreadFileService[threadNumber];
		int size = flSize / threadNumber;

		for (int i = 0; i < threads.length; i++) {
			int start = size * i;
			int end = size * (i + 1);

			if (flSize - (end + flSize % threadNumber) < size) {
				end = flSize;
			}
			threads[i] = new SingleThreadFileService(fl, start, end, folderOut);
		}

		joinThreads(threads);

		return getTotalBytes(threads);
	}

	private static ArrayList<File> getFilesList(File folderIn) {
		ArrayList<File> filesList = new ArrayList<>();
		for (File file : folderIn.listFiles()) {
			if (file.isFile()) {
				filesList.add(file);
			}
		}
		return filesList;
	}

	private static void joinThreads(SingleThreadFileService[] threads) {
		for (SingleThreadFileService stfs : threads) {
			try {
				stfs.getThr().join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static long getTotalBytes(SingleThreadFileService[] threads) {
		long totalBytes = 0;
		for (SingleThreadFileService stfs : threads) {
			totalBytes += stfs.getBytes();
		}
		return totalBytes;
	}

}
