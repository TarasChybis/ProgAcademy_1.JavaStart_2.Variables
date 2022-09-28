package home_work_11_3a_OOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLAddress {

	public static String getStringFromURL(String spec, String code) throws IOException {
		URL url = new URL(spec);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		String result = "";
		try (InputStream is = connection.getInputStream()) {

			BufferedReader br = new BufferedReader(new InputStreamReader(is, code));
			String temp = "";
			for (;;) {
				temp = br.readLine();
				if (temp == null) {
					break;
				}
				result += temp + System.lineSeparator();
			}

		} catch (IOException e) {
			throw e;
		}
		return result;
	}

	public static void saveURLFile(String spec, File file) {
		try (PrintWriter pr = new PrintWriter(file)){
			String html = getStringFromURL(spec, "UTF-8");
			String[] s = html.split("http");
			for (int i = 1; i < s.length; i++) {
				int index = 0;
				s[i] = "http" + s[i].replaceAll("\'", "\"");
				if (s[i].indexOf("\"") != -1) {
					index = s[i].indexOf("\"");
				}
				pr.print(s[i].substring(0, index) + System.lineSeparator());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
