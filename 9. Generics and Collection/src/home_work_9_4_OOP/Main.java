//Шелдон, Леонард, Воловиц, Кутрапалли и Пенни стоят в очереди за «двойной колой». Как только человек выпьет такой колы, он раздваивается и оба становятся в конец очереди, чтобы выпить еще стаканчик. Напишите программу, которая выведет на экран состояние очереди в зависимости от того, сколько стаканов колы выдал аппарат с чудесным напитком. Например, если было выдано только два стакана, то очередь выглядит как:
//[Volovitc, Kutrapalli, Penny, Sheldon, Sheldon, Leonard, Leonard]

package home_work_9_4_OOP;

import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {
		
		ArrayDeque<String> dq = new ArrayDeque<>();

		dq.addLast("Sheldon");
		dq.addLast("Leonard");
		dq.addLast("Volovitc");
		dq.addLast("Kutrapalli");
		dq.addLast("Penny");
		System.out.println(dq);
		addClone(dq, 2);

	}

	public static void addClone(ArrayDeque<String> dq, int gl) {

		for (int i = 0; i < gl; i++) {
			dq.addLast(dq.getFirst());
			dq.addLast(dq.getFirst());
			dq.removeFirst();

		}
		System.out.println(dq);
	}

}
