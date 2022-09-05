//Sorting an array of references of Type Cat.

package lesson_4_1_OOP;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Cat cat1 = new Cat("Vaska", 6);
		Cat cat2 = new Cat("Luska", 2);
		Cat cat3 = new Cat("Umka", 4);
		Cat cat4 = new Cat("Barsik", 2);
		Cat cat5 = new Cat("Kuzia", 5);

		Cat[] cats = new Cat[] { cat1, cat2, null, cat3, cat4, null, cat5 };

		for (int i = 0; i < cats.length; i++) {
			System.out.println(cats[i]);
		}
		System.out.println();

		System.out.println("Sort by name");
		Arrays.sort(cats, Comparator.nullsLast(new CatNameComparator()));
		for (int i = 0; i < cats.length; i++) {
			System.out.println(cats[i]);
		}
		System.out.println();

		System.out.println("Sort by ascending age");
		Arrays.sort(cats, Comparator.nullsLast(new CatAgeComparator()));
		for (int i = 0; i < cats.length; i++) {
			System.out.println(cats[i]);
		}
		System.out.println();

		System.out.println("Sort by descending age");
		Arrays.sort(cats, Comparator.nullsLast(new CatAgeComparator().reversed()));
		for (int i = 0; i < cats.length; i++) {
			System.out.println(cats[i]);
		}
		System.out.println();
		
		System.out.println("Sort by two sort keys: 1 by age, 2 by name");
		Arrays.sort(cats, Comparator.nullsLast(new CatAgeComparator().thenComparing(new CatNameComparator())));
		for (int i = 0; i < cats.length; i++) {
			System.out.println(cats[i]);
		}
	}
}
