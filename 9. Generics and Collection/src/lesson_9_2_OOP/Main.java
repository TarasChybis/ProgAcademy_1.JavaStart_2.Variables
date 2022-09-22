//Использование обобщенного класса для использования ссылок на объект любого типа.

package lesson_9_2_OOP;

public class Main {

	public static void main(String[] args) {

		Container<Integer> a = new Container(100);

//		a.setElement("Java");

//		int sum = 50 + (Integer) a.getElement();		//Было
		int sum = 50 + a.getElement();		//Стало. Downcasting уже не нужен.

		System.out.println("Sum = " + sum);
		
		Container<String> b = new Container("Hello World");
		System.out.println(a);
		System.out.println(b);
	}

}
