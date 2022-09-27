package lesson_11_2_OOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkService {	//создаем класс для мониторинга сетей

	//напишем метод, который скопирует нам файл с удаленного ресурса
	public static void getFileFromURL(String spec, File folder) throws IOException {
		URL url = new URL(spec);	//подключаемся к удаленному ресурсу
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();	//получаем доступ к содержимому
		int n = spec.lastIndexOf("/");	//найти и скопировать имя файла. Ищем последний слеш
		String fileName = spec.substring(n+1);	//объявляем строку, и указываем, что она равна результату копирования из строки спецификатора подключения все после слеша без слеша
		File file = new File(folder, fileName); //создаем адресс файла и изменяем относительную адрессацию - указываем конкретный адресс
		//создаем 2 байтовых потока для записи файла
		try(InputStream is = connection.getInputStream(); OutputStream os = new FileOutputStream(file)) {
			is.transferTo(os);
		}
	}
}
