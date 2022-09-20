//Реализация методов и их переопределение
//- toString();
//- equals();

package lesson_8_1_OOP;

public class Main {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Barsik", 4);
		Cat cat2 = new Cat("Barsik", 4);
		
		System.out.println(cat1 == cat2);
		System.out.println(cat1.equals(cat2));

	}

}
