package lesson_11_3_OOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class NetworkService {	//создаем класс для мониторинга сетей
	
	public static Map<String, List<String>> getHeadersFromURL(String spec) throws IOException {
		URL url = new URL(spec);	//подключаемся к удаленному ресурсу	
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();	//получаем доступ к содержимому
		return connection.getHeaderFields();
	}
}
