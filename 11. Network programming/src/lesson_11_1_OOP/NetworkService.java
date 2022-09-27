package lesson_11_1_OOP;

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

	//создаем метод, который вернет нам в виде строки содержимое html разметки, которую мы получим при запросе на произвольном ресурсе.
	//поля в методе не нужны. Метод статический.
	public static String getStringFromURL(String spec, String code) throws IOException {
		URL url = new URL(spec);	//подключаемся. Получение объекта класса URL
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();	//считать данные. Получаем доступ к содержимому ответа к тому к чему мы подключились. 
		String result = "";		//данные, которые мы получим сохраним в виде строки.
		try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), code))) {	//создаем байтовый поток из которого будем вытягивать html разметку BufferedReader. Нам нужно символьный поток, а у нас байтовый. Конвертируем данные из байтового потока в символьный InputStreamReader.
			String temp = "";	//сохраем временную строку
			for(;;) {	//циклом проверяем строку
				temp = br.readLine();
				if (temp == null) {	//если строка null, то закончить
					break;	
				}
				result += temp + System.lineSeparator();	//если что-то есть, тогда к строке с результатом дописываем то что считали
			}
			return result;	//вернуть строку
		}
	}
}
