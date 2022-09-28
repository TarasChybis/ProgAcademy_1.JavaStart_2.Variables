//Написать сервер, который будет отправлять пользователю информацию о системе и номер запроса.

package home_work_11_2a_OOP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public static void main(String[] args) {

		try (ServerSocket soc = new ServerSocket(8080)) {
            for (;;) {
                Socket clientSoc = soc.accept();
                new Client(clientSoc, AnswerCreator.createAnswer());
            }
        } catch (IOException e) {
            System.out.println("Error to server Socket Open!!!");
        }
    }
}
