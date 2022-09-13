//1) Создать класс FactorialTask.
//2) Создать 3 потока (3 исполнителя).
//3) Передать ссылку на объект класса FactorialTask, реализующего интерфейс Runnable. 
//4) Запустить их методами start().
//5) Основной поток Main поставить на паузу с помощью метода join(), пока задачи выполняются в параллельных потоках.
//6) Собрать данные из параллельных потоков в основной поток Main.

package lesson_6_3_OOP;

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
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("sum1 = " + task1.getSum());
		System.out.println("sum2 = " + task2.getSum());
		System.out.println("sum3 = " + task3.getSum());
		
		System.out.println(mainThread.getName() + " Done!");

	}

}
