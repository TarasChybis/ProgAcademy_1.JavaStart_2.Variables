//Написать метод, который создаст список, положит в него 10 элементов, затем удалит первые два и последний, а затем выведет результат на экран.

package home_work_9_1_OOP;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args) {

		dequeList();
	}

	public static void dequeList() {
		Deque<Integer> dq = new ArrayDeque<>();
		for (int i = 0; i < 10; i++) {
			dq.add((int) (Math.random() * 100));
		}
		System.out.println(dq);
		dq.pollFirst();
		dq.pollFirst();
		dq.pollLast();
		System.out.println(dq);
	}
}
