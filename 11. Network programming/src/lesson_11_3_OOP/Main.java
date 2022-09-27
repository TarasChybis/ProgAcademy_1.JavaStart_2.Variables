//Мониторить сайт.
//Вернуть заголовок ответа сервера.

package lesson_11_3_OOP;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

//		String spec = "https://rozetka.com.ua/";
		String spec = "https://content2.rozetka.com.ua/goods/images/big/231724078.jpg";
		
		try {
			Map<String, List<String>> headers = NetworkService.getHeadersFromURL(spec);
			for (String k : headers.keySet()) {
				System.out.println(k + " => " + headers.get(k));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
