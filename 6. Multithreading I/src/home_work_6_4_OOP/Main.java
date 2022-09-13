//Реализуйте многопоточное копирование каталога, содержащего несколько файлов.

package home_work_6_4_OOP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {

		File folderIn = new File("F:\\TARAS\\IT\\Development\\JAVA\\Books");

		File folderOut1 = new File("F:\\TARAS\\IT\\Development\\JAVA");
		File folderOut2 = new File("F:\\TARAS\\IT\\Development\\JAVA\\PROG.Academy\\2. Java OOP\\Repository\\ProgAcademy_2_JavaOOP\\6. Multithreading I\\New folder");
		folderOut1.mkdirs();
		folderOut2.mkdirs();

		long start = System.currentTimeMillis();
		long totalBytes = MultiThreadFileService.copyFolder(folderIn, folderOut1, 8);
		long end = System.currentTimeMillis();

		System.out.println(totalBytes + " bytes copied");
		System.out.print(folderOut1.list().length + " files copied, ");
		System.out.println((end - start) + " ms elapsed - multi-thread");

		System.out.println();

		start = System.currentTimeMillis();
		try {
			totalBytes = copyFolder(folderIn, folderOut2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();

		System.out.println(totalBytes + " bytes copied");
		System.out.print(folderOut2.list().length + " files copied, ");
		System.out.println((end - start) + " ms elapsed - single-thread");
	}

	public static long copyFolder(File folderIn, File folderOut) throws IOException {
		File[] files = folderIn.listFiles();
		long totalBytes = 0;
		for (int i = 0; i < files.length; i++) {
			if (files[i].isFile()) {
				File file = new File(folderOut, files[i].getName());
				totalBytes += copyFile(files[i], file);
			}
		}
		return totalBytes;
	}

	public static long copyFile(File fileIn, File outFile) throws IOException {
		try (InputStream is = new FileInputStream(fileIn); OutputStream os = new FileOutputStream(outFile)) {
			long bytes = is.transferTo(os);
			return bytes;
		}
	}

}
