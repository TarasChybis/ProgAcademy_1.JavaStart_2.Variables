//Напишите программу, которая выведет в файл все ссылки, которые содержатся в html документе, который будет прислан в результате запроса на произвольный URL.

package home_work_11_3a_OOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String spec = "https://q.prog.kiev.ua/";
		File file = new File("AAA.txt");
		
		URLAddress.saveURLFile(spec, file);
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String text = "";
			for (; (text = br.readLine()) != null;) {
				System.out.println(text);
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
