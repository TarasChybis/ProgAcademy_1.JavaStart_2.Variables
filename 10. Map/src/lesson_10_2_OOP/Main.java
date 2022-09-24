//Есть массив строк из 10 элементов. Предположим, мы не знаем каких.
//Есть список из этих строк.
//Рандомно добавляются еще 5 элементов при каждом выполнении кода.
//
//Соберите статистику на основании данных этого списка вида: элемент вида - сколько раз он использовался.
//(За линейное время. Без использования цикла в цикле).

package lesson_10_2_OOP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		String[] arr = new String[] { "Java", "Js", "Python", "C++", "Fortran", "Ruby", "Go", "C", "Assambler",
				"Rust" };

		List<String> list = new ArrayList<>();

		for (int i = 0; i < 15; i++) {
			list.add(arr[(int) (Math.random() * arr.length)]);
		}
		System.out.println(list);

//		Решение задачи.

//		Создаем карту, где ключи совпадают с типом данных списков, а значение - Integer:
//		(Ключ - это что за данные, а значение - это сколько раз он там встретился).
		Map<String, Integer> stat = new HashMap<>();
//		Создаем цикл для прохода по элементам этого списка:
		for (String element : list) {
			Integer n = stat.get(element);
			if (n == null) {
				stat.put(element, 1);
			} else {
				stat.put(element, n + 1);
			}
		}
		System.out.println(stat);
	}

}
