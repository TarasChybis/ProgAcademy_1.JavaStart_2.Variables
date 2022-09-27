//Мониторить сайт.
//Получить строку с содержимым. Создать метод, который вернет нам в виде строки содержимое html разметки, которую мы получим при запросе на произвольном ресурсе.
//Разобрать строку (спарсить) на части используя теги.

package lesson_11_1_OOP;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String spec = "https://rozetka.com.ua/";	//обявляем строку - спецификатор подключения (копируем URL)
		
		String htmlText = "";	//объявляем строку, которую будем считывать (пустая)
		try {
			htmlText = NetworkService.getStringFromURL(spec, "UTF-8");	//инициализируем строку, которую будем считывать
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println(htmlText);
	}

}
