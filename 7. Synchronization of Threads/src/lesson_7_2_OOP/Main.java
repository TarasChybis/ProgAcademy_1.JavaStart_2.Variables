//Задача "Тяни-толкай".
//Задача по реализации синхронизации работы двух потоков в коде.
//Синхронизировать работу двух потоков так, что бы они работали строго последовательно.
//Вывести на экран: push pull push pull push pull push pull push pull.

package lesson_7_2_OOP;

public class Main {

	public static void main(String[] args) {
		
		Printer prt = new Printer();
		PushPullTask pushTask = new PushPullTask(prt, "Push");
		PushPullTask pullTask = new PushPullTask(prt, "Pull");

		Thread thread1 = new Thread(pullTask);
		Thread thread2 = new Thread(pushTask);
		
		thread1.start();
		thread2.start();
	}

}
