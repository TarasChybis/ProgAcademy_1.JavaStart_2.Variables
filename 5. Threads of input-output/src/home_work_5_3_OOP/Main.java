//Implement a service to compare files for identity. Files are considered identical if they are byte-by-byte equal. Files of different lengths, or files in which at least one byte is different, are considered different.

package home_work_5_3_OOP;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File file1 = new File("F:\\TARAS\\IT\\Development\\JAVA\\PROG.Academy\\2. Java OOP\\Repository\\ProgAcademy_2_JavaOOP\\5. Streams of input-output\\null.csv");
		File file2 = new File("F:\\\\TARAS\\\\IT\\\\Development\\\\JAVA\\\\PROG.Academy\\\\2. Java OOP\\\\Repository\\\\ProgAcademy_2_JavaOOP\\\\5. Streams of input-output\\\\null — копия.csv");
		try {
			FileComparator.compareFiles(file1, file2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
