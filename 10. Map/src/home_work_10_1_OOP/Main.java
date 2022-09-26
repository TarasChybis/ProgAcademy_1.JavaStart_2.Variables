//Написать программу - переводчик, которая будет переводить текст в файле English.in, написанный на английском языке, на украинский язык, согласно заранее составленному словарю. Результат сохранить в файл Ukrainian.out.

package home_work_10_1_OOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File fileEnglish = new File("English.in");
		String textEnglish = fromFile(fileEnglish);
		
		TranslateClass.translateWords("English.in", "Ukrainian.out");
	}
	
	public static String fromFile(File file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader bff = new BufferedReader(new FileReader(file))) {
			String text;
			for (; (text = bff.readLine()) != null;) {
				sb.append(text).append(System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
