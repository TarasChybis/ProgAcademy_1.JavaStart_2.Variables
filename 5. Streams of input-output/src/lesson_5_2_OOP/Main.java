//Copy folder

package lesson_5_2_OOP;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File folderIn = new File("F:\\TARAS\\English\\Grammar");
		
		File folderOut = new File("F:\\TARAS\\IT\\Development\\JAVA\\PROG.Academy\\2. Java OOP\\Repository\\ProgAcademy_2_JavaOOP\\5. Streams of input-output");
		
		try {
			FileService.copyFolder(folderIn, folderOut);
			System.out.println("Done!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
