//Наложить ограничение на параметр типа для обобщенного класса используя механизм наследования для интерфейсов.

package lesson_9_4_OOP;

public class Main {

	public static void main(String[] args) {

		Container<Integer> a = new Container(100);	//Integer компилируется, потому что интерфейс Comparable реализует Comparable<Integer>.

//		a.setElement("Java");

		int sum = 50 + a.getElement();		

		System.out.println("Sum = " + sum);
		
		Container<String> b = new Container("Hello World");	//String компилируется, потому что интерфейс Comparable реализует Comparable<String>.
		System.out.println(a);
		System.out.println(b);
	}

}
