package lesson_11_4_OOP;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Client implements Runnable {
	
	
	public Client(Socket soc, String ansv) {
		super();
		this.soc = soc;
		this.ansv = ansv;
		t=new Thread(this);
		t.start();
	}

	private Socket soc;
	private String ansv;
	Thread t;

	public void run() {

		try (InputStream is = soc.getInputStream();
				OutputStream os = soc.getOutputStream();
				PrintWriter pw= new PrintWriter(os)) {
			byte[] rec1 = new byte[is.available()];
			is.read(rec1);
			for (byte b : rec1) {
				System.out.print((char)b);
			}
			
			
			String response = "HTTP/1.1 200 OK\r\n" + "Server: My_Server\r\n"
					+ "Content-Type: text/html\r\n" + "Content-Length: "
					 + "\r\n" + "Connection: close\r\n\r\n";
			pw.print(response+ansv);
			pw.flush();
			}
		catch(IOException e){
			System.out.println(e.toString());
		}
	}
}
