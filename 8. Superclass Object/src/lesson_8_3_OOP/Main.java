//Реализация методов и их переопределение
//- getClass();

package lesson_8_3_OOP;

import java.text.DateFormat.Field;

public class Main {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Barsik", 4);
		Cat cat2 = new Cat("Barsik", 4);

		Cat cat3 = null;

		try {
			cat3 = cat1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(cat3);
		System.out.println();

//		Метод позволяющий узнать список полей.
		Class catClass = Cat.class;
		java.lang.reflect.Field[] fields = catClass.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
		System.out.println();
		
//		Метод позволяющий узнать список реализованых интерфейсов.
		Class[] interfaces = catClass.getInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			System.out.println(interfaces[i]);
		}
		System.out.println();
		
//		Изменить поле int age в классе Cat.
		try {
			java.lang.reflect.Field catAge = catClass.getDeclaredField("age");
			catAge.setAccessible(true);
			catAge.setInt(cat1, 100500);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cat1);
	}

}
