//1) Создать ссылку на объект любого типа данных c помощью поля типа Object.
//2) Извлеч данные по ссылке объекта можно, если использовать Downcasting для преобразования ссылки типа Object в ссылку типа Integer.
//3) При попытке записать в поле "а" (числа) строку, компилятор НЕ заметит несоответствия типов. Но на этапе выполнения мы получим ClassCastException.

package lesson_9_1_OOP;

public class Main {

	public static void main(String[] args) {
		
//		1) Создать ссылку на объект любого типа данных c помощью поля типа Object.		
		
		Container a = new Container(100);
		Container b = new Container("Hello World");
		
		System.out.println(a);
		System.out.println(b);
		
//		2) Извлеч данные по ссылке объекта можно, если использовать Downcasting для преобразования ссылки типа Object в ссылку типа Integer.
		
		int sum = 50 + (Integer)a.getElement();
		System.out.println("Sum = " + sum);
		
//		3) При попытке записать в поле "а" (числа) строку, компилятор НЕ заметит несоответствия типов. Но на этапе выполнения мы получим ClassCastException.
		
		a.setElement("Java");
		System.out.println(a);
		int sum2 = 50 + (Integer)a.getElement();
		System.out.println("Sum2 = " + sum2);
	}

}
