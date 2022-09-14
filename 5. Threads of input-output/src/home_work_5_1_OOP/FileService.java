package home_work_5_1_OOP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileService {

	public static void copyFile(File in, File out) throws IOException {
		try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {

			is.transferTo(os);

		} catch (IOException e) {
			// you code
			throw e;
		}
	}

	public static void copyFolderFileExtension1(File in, File out, String str) throws IOException {
		File[] files = in.listFiles();
		int count = files.length;
		for (int i = 0; i < files.length; i++) {
			if (files[i].isFile() && files[i].getName().endsWith(str)) {
				File fileOut = new File(out, files[i].getName());
				copyFile(files[i], fileOut);
				System.out.println("File " + files[i].getName() + " was copied");
			} else
				count -= 1;
		}
		if (count == 0) {
			System.out.println("Files *." + str + " weren't found in parent folder");
		}
	}

	public static void copyFolderFileExtension2(File in, File out, String str) throws IOException {
		File[] files = in.listFiles();
		int count = files.length;
		for (int i = 0; i < files.length; i++) {
			String[] t = files[i].getName().split("[.]");
			String fe = t[t.length - 1];
			if (files[i].isFile() && fe.equals(str)) {
				File fileOut = new File(out, files[i].getName());
				copyFile(files[i], fileOut);
				System.out.println("File " + files[i].getName() + " was copied");
			} else
				count -= 1;
		}
		if (count == 0) {
			System.out.println("Files *." + str + " weren't found in parent folder");
		}
	}
}
