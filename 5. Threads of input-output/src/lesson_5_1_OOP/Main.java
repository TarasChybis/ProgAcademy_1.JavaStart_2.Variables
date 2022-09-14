// Copy File

package lesson_5_1_OOP;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File in = new File("F:\\TARAS\\IT\\Development\\JAVA\\PROG.Academy\\2. Java OOP\\5.1 Потоки ввода вывода.pdf");
		File out = new File(in.getName());
		
		try {
			FileService.copyFile(in, out);
			System.out.println("Done!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
