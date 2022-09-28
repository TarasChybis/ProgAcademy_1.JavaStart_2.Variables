//Проверить доступность сайтов указанных в отдельном файле.

package home_work_11_1_OOP;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		File file = new File("F:\\TARAS\\IT\\Development\\JAVA\\PROG.Academy\\2. Java OOP\\Repository\\ProgAcademy_2_JavaOOP\\11. Network programming\\URL_adresses.txt");

		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				String str = sc.nextLine();
				try {
					URL url = new URL(str);
					HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
					if (urlc.getResponseCode() == 200) {
						System.out.println(str + " IS AVAILABLE");
					} else {
						System.out.println(str + " IS NOT AVAILABLE");
					}
				} catch (IOException e) {
					System.out.println(e.toString() + " ADRESS IS NOT AVAILABLE OR DOES NOT EXIST");
				}
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}
