//Создайте сто потоков, которые будут вычислять факториал числа, равного номеру этого потока, и выводить результат на экран.

package home_work_6_1_OOP;

public class Main {

	public static void main(String[] args) {

		Thread[] arrayThread = new Thread[100];
		
		for (int i = 0; i < arrayThread.length; i++) {
			arrayThread[i] = new Thread(new FactopialThread(i));
			arrayThread[i].start();
			try {
				arrayThread[i].sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("The END");
	}
}
