//Использование обобщенного метода для использования ссылок на объект любого типа.

package lesson_9_5_OOP;

public class Main {

	public static void main(String[] args) {

		Container<Integer> a = new Container(100);

//		a.setElement("Java");

		int sum = 50 + a.getElement();

		System.out.println("Sum = " + sum);

		Container<String> b = new Container("Hello World");

		System.out.println(a);
		System.out.println(b);

		Integer[] arr = new Integer[] { 5, 2, -3, 0 };
		
		Integer min1 = min(arr);
		
		System.out.println(min1);
	}

	public static <E extends Comparable<E>> E min(E[] array) {
		E min = array[0];
		for (int i = 0; i < array.length; i++) {
			if (min.compareTo(array[i]) > 0) {
				min = array[i];
			}
		}
		return min;
	}

}
