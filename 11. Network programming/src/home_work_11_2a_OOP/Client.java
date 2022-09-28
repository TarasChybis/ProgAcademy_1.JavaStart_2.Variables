package home_work_11_2a_OOP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {

	private static int num = 0;
	private Socket soc;
	private String ans;
	private Thread t;

	public Client(Socket soc, String ans) {
		super();
		this.soc = soc;
		this.ans = ans;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		try (InputStream is = soc.getInputStream();
			OutputStream os = soc.getOutputStream();
			PrintWriter pw = new PrintWriter(os)) {
			byte[] rec1 = new byte[is.available()];
			is.read(rec1);
			String response = "HTTP/1.1 200 OK\r\n" + "Server: My_Server\r\n" + "Content-Type: text/html\r\n"
					+ "Content-Length: " + "\r\n" + "Connection: close\r\n\r\n";
			pw.print(response + ans);
			pw.flush();
		} catch (IOException e) {
			System.out.println("Wrong names");
		}
	}

	public static int getNum() {
		num++;
		return num;
	}
	
}
