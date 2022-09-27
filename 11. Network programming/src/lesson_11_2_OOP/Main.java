//Мониторить сайт.
//Создать метод, который скачает нам файл с удаленного ресурса и где-то сохранит.

package lesson_11_2_OOP;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		//обявляем строку-спецификатор для подключения к файловому сервису (копируем URL)
		String spec = "https://content2.rozetka.com.ua/goods/images/big/231724078.jpg";
		//указываем адресс папки, где мы будем хранить файл
		File folder = new File("AAA");
		//создаем папку
		folder.mkdirs();
		try {
			NetworkService.getFileFromURL(spec, folder);
			System.out.println("Done!");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
