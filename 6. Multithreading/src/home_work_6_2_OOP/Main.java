//Написать код для многопоточного подсчета суммы элементов массива целых чисел. Сравнить скорость подсчета с простым алгоритмом.

package home_work_6_2_OOP;

public class Main {

	public static void main(String[] args) {

		int array[] = new int[200000000];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 18);
		}

		Multithreading one = new Multithreading(array, 0, 50000000);
		Multithreading two = new Multithreading(array, 50000000, 100000000);
		Multithreading three = new Multithreading(array, 100000000, 150000000);
		Multithreading four = new Multithreading(array, 150000000, 199999999);

		Thread th1 = new Thread(one);
		Thread th2 = new Thread(two);
		Thread th3 = new Thread(three);
		Thread th4 = new Thread(four);

		th1.start();
		th2.start();
		th3.start();
		th4.start();

		try {
			th1.join();
			th2.join();
			th3.join();
			th4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long res = one.getRes() + two.getRes() + three.getRes() + four.getRes();
		System.out.println("Total = " + res);
	}
}
