//Write a program that will copy all files with a predetermined extension (for example, only doc) from one directory to another.

package home_work_5_1_OOP;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		File folderIn = new File("F:\\TARAS\\ОСББ\\Електроживлення");

		File folderOut = new File("F:\\TARAS\\IT\\Development\\JAVA\\PROG.Academy\\2. Java OOP\\Repository\\ProgAcademy_2_JavaOOP\\5. Streams of input-output\\src");

		try {
			FileService.copyFolderFileExtension1(folderIn, folderOut, "docx");
			System.out.println("Done!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			FileService.copyFolderFileExtension2(folderIn, folderOut, "reg");
			System.out.println("Done!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
