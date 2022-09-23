package home_work_9_3_OOP;

import java.util.Comparator;

public class CharComparator implements Comparator<ClassChar> {

	@Override
	public int compare(ClassChar o1, ClassChar o2) {
		if (o1.getrNumber() > o2.getrNumber()) {
			return -1;
		}
		if (o1.getrNumber() < o2.getrNumber()) {
			return 1;
		}
		return 0;
	}

}
