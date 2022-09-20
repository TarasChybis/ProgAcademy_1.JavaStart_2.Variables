//Реализация методов и их переопределение
//- clone();

package lesson_8_2_OOP;

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

	}

}
