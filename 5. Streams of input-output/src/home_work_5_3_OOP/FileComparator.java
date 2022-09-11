package home_work_5_3_OOP;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileComparator {

	public static boolean compareFiles(File file1, File file2) throws IOException {
		long count = 0;
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file1))) {
			byte[] bytes1 = new byte[(int) file1.length()];
			bis.read(bytes1);
			try (InputStream is = new FileInputStream(file2)) {
				byte[] bytes2 = new byte[(int) file2.length()];
				is.read(bytes2);
				for (int i = 0; i < file1.length(); i++) {
					if (bytes1[i] != bytes2[i]) {
						break;
					} else {
						count++;
					}
				}
			}

		}

		if (count == file1.length()) {
			System.out.println("Files are identical");
			return true;
		} else {
			System.out.println("Files are different");
			return false;
		}
	}
}
