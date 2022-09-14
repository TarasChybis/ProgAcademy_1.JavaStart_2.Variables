//Complete the resulting service with the ability to transfer file addresses in key mode when the application is launched from the command line.

package home_work_5_4_OOP;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File file1;
		File file2;

		if (args.length == 2) {
			file1 = new File(args[0]);
			file2 = new File(args[1]);
		} else {
			file1 = new File("F:\\TARAS\\IT\\Development\\JAVA\\PROG.Academy\\2. Java OOP\\Repository\\ProgAcademy_2_JavaOOP\\5. Streams of input-output\\null.csv");
			file2 = new File("F:\\TARAS\\IT\\Development\\JAVA\\PROG.Academy\\2. Java OOP\\Repository\\ProgAcademy_2_JavaOOP\\5. Streams of input-output\\null — копия.csv");
		}

		try {
			FileComparator.compareFiles(file1, file2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
