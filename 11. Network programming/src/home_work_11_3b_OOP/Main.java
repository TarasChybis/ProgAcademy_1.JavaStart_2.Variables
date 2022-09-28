//Напишите программу, которая выведет в файл все ссылки, которые содержатся в html документе, который будет прислан в результате запроса на произвольный URL.

package home_work_11_3b_OOP;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
            LinkParser.getLinksFromWebsite("https://ukrmarket.net/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
