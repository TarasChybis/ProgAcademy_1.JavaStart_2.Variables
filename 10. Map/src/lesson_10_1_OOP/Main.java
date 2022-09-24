//Конспект лекции "10. Map".

package lesson_10_1_OOP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Создаем объект класса HashMap<>();
		Map<Integer, String> map = new HashMap<>();
		
//		Добавить элементы в карту:
		map.put(5, "five");
		map.put(1, "one");
		map.put(10, "ten");
		System.out.println(map);
		
//		Извлеч элемент из карты по его ключу:
		String temp = map.get(10);
		System.out.println(temp);
		
//		Заменить значение по ключу:
		map.put(10, "TEN");
		System.out.println(map);
		
//		Удалить элемент в карте:
		map.remove(10);
		System.out.println(map);
		
//		Пройтись по карте, получить клуч и значение по ключу:
//		1) Объявить множество, тип которых совпадает с ключами:
		Set<Integer> keys = map.keySet();
//		2) Пройтись циклом for-each:
		for(Integer k : keys) {
			System.out.println(k + " => " + map.get(k));
		}
	}

}
