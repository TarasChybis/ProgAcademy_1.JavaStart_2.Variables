//Работа с классом ArrayList реализующим интерфейс List реализующим список.

package lesson_9_6_OOP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<>();

		lst.add("World");
		lst.add("Java");
		lst.add("Hello");
		System.out.println(lst);

		String temp = lst.get(0);
		System.out.println(temp);

		lst.add(1, "JS");
		System.out.println(lst);

		lst.remove(2);
		System.out.println(lst);

		Collections.sort(lst);
		System.out.println(lst);

		for (String element : lst) {
			System.out.println(element);
		}
		System.out.println();
		
		Iterator<String> itr = lst.iterator();
		for(;itr.hasNext();) {
			String element = itr.next();
			System.out.println(element);
		}
	}

}
