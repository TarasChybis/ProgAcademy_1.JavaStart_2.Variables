//Наложить ограничение на параметр типа для обобщенного класса используя механизм наследования для классов.

package lesson_9_3_OOP;

public class Main {

	public static void main(String[] args) {

		Container<Integer> a = new Container(100);	//Integer компилируется, потому что он наследник Number.

//		a.setElement("Java");

		int sum = 50 + a.getElement();		

		System.out.println("Sum = " + sum);
		
//		Container<String> b = new Container("Hello World");	//String НЕ компилируется, потому что он не наследник Number.
		System.out.println(a);
//		System.out.println(b);
	}

}
