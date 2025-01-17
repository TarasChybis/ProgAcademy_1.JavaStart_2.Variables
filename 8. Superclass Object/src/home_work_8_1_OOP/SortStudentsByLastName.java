package home_work_8_1_OOP;

import java.util.Comparator;

public class SortStudentsByLastName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub

		Student student1 = (Student) o1;
		Student student2 = (Student) o2;

		String lastName1 = student1.getLastName();
		String lastName2 = student2.getLastName();

		if (lastName1.compareTo(lastName2) > 0) {
			return 1;
		}
		if (lastName1.compareTo(lastName2) < 0) {
			return -1;
		}
		return 0;
	}
}
