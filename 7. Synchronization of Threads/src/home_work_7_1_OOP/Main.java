//Существуют три корабля. На каждом из них 10 ящиков груза. Они одновременно прибыли в порт, в котором только два дока. Скорость разгрузки - 1 ящик в 0.5 сек. Напишите программу, которая, управляя кораблями, позволит им правильно разгрузить груз.

package home_work_7_1_OOP;

public class Main {

	public static void main(String[] args) {

		Port port = new Port();

		Ship ship1 = new Ship(true, 10, port, "Ship Black Pearl");
		Ship ship2 = new Ship(false, 10, port, "Ship Victoria");
		Ship ship3 = new Ship(true, 10, port, "Ship Santa-Maria");
		Ship ship4 = new Ship(false, 10, port, "Ship Titanik");
		Ship ship5 = new Ship(true, 10, port, "Ship Bismark");

		Thread th1 = new Thread(ship1);
		Thread th2 = new Thread(ship2);
		Thread th3 = new Thread(ship3);
		Thread th4 = new Thread(ship4);
		Thread th5 = new Thread(ship5);

		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
	}
}
