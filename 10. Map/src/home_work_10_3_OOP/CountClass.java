package home_work_10_3_OOP;

import java.util.HashMap;
import java.util.Map;

public class CountClass {

	private Map<Object, Integer> map = new HashMap<>();

	public Map<Object, Integer> count(Object[] array) {
		Map<Object, Integer> number = new HashMap<>();
		for (Object i : array) {
			Integer element = number.get(i);
			if (element != null) {
				number.put(i, element + 1);
			} else {
				number.put(i, 1);
			}
		}
		return number;
	}

	@Override
	public String toString() {
		return "countClass [map=" + map + "]";
	}

}
