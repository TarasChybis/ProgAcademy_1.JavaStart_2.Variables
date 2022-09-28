//Сервер подсчитывающий кол-во клиентских запросов.

package home_work_11_5_OOP;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		ServerApp serverApp = new ServerApp();
        try {
            serverApp.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
