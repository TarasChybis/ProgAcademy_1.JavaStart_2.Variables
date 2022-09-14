package home_work_5_3_OOP;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileComparator {

	public static boolean compareFiles(File file1, File file2) throws IOException {
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file1))) {
			try (InputStream is = new FileInputStream(file2)) {
				for (;;) {
					if (bis.read() != is.read()) {
						System.out.println("Files are different");
						return false;
					} else if (bis.read() == -1 || is.read() == -1) {
						System.out.println("Files are identical");
						return true;
					}
				}
			}
		}
	}
}
