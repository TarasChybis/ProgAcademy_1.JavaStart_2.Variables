//Написать сервер, который будет отправлять пользователю информацию о системе и номер запроса.

package home_work_11_2b_OOP;

import java.io.*;
import java.net.*;

public class Main {

	public static void main(String[] args) {

		int count = 0;

		String ansver = "System info: " + System.getProperty("os.name")+"; " 
										+ System.getProperty("os.version")+"; "
										+ System.getProperty("os.arch")+". ";

		try (ServerSocket soc = new ServerSocket(8080)) {
			
			ansver += "<p>Reqwest number: ";
			for (;;) {
				Socket clisoc = soc.accept();
				Client cli = new Client(clisoc, ansver + (++count)+"</p>");
				System.out.println(cli);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error to server Socket Open!!!");
		}
	}

}
