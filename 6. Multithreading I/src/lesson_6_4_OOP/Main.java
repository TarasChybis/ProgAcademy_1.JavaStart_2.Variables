//Использование метода void interrupt() для прерывания выполнения потока метода run().

package lesson_6_4_OOP;

public class Main {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		
		System.out.println(mainThread.getName());
		System.out.println(mainThread.getId());
		System.out.println(mainThread.getName() + " Start");
		
//		Создаем объекты класса реализующего Runnable.
		FactorialTask task1 = new FactorialTask(10);
		FactorialTask task2 = new FactorialTask(10);
		FactorialTask task3 = new FactorialTask(10);
		
//		Создаем параллельные потоки (исполнители).
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		Thread thread3 = new Thread(task3);
		
//		Даем команду "Начни выполнять свою задачу".
		thread1.start();
		thread2.start();
		thread3.start();
		
		thread1.interrupt();
		thread2.interrupt();
		thread3.interrupt();
		
		System.out.println(mainThread.getName() + " Done!");

	}

}
