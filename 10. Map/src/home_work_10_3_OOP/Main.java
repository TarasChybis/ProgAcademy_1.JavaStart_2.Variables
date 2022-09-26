//Решить задачу подсчета повторяющихся элементов в массиве с помощью HashMap.

package home_work_10_3_OOP;

public class Main {

	public static void main(String[] args) {

		Object[] array = new Object[] { "c", "c", 'd', 'd', 1, 1, 1, "a", 'd', 55, 55, 0, 0 };
		CountClass cc = new CountClass();
		System.out.println(cc.count(array));

	}
}
