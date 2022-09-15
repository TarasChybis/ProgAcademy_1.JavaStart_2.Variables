//Реализуйте программу многопоточного копирования файла блоками с выводом прогресса на экран.

package home_work_7_2_OOP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) {

		File file1 = new File("F:\\TARAS\\IT\\Development\\JAVA\\Books\\Java Code Conventions.pdf");
		File folderOut1 = new File("F:\\TARAS\\IT\\Development\\JAVA\\PROG.Academy\\2. Java OOP\\Repository\\ProgAcademy_2_JavaOOP\\7. Synchronization of Threads");

		long start = System.currentTimeMillis();
		try {
			MultiThreadFileService.copy(folderOut1, file1);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		long end = System.currentTimeMillis();

		System.out.println(end - start + " ms elapsed - multithread");

		System.out.println();

		File file2 = new File("/Users/vladyslav/Desktop/GMT20220809-160027_Recording_1920x1080.mp4");
		File folderOut2 = new File("/Users/vladyslav/Desktop/SampleFolder2");

		start = System.currentTimeMillis();
		try {
			copyFile(folderOut2, file2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		System.out.println(end - start + " ms elapsed - singlethread");
	}

	public static void copyFile(File folderOut, File fileIn) throws IOException {
		File fileOut = new File(folderOut, fileIn.getName());
		fileOut.createNewFile();
		try (InputStream is = new FileInputStream(fileIn); OutputStream os = new FileOutputStream(fileOut)) {
			is.transferTo(os);
		}
	}
}
