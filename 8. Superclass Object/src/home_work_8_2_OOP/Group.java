package home_work_8_2_OOP;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Group {

	private String groupName;
	private Student[] students = new Student[10];

	public Group(String groupName, Student[] studens) {
		super();
		this.groupName = groupName;
		this.students = studens;
	}

	public Group() {
		super();
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudens() {
		return students;
	}

	public void setStudens(Student[] studens) {
		this.students = studens;
	}

	public void addStudent(Student j) throws GroupOverflowException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = j;
				j.setGroupName(groupName);
				break;
			} else if (i == students.length - 1 && students[i] != null) {
				throw new GroupOverflowException();
			} else {
				continue;
			}
		}
	}

	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		Student searchedStudent = new Student(lastName, lastName, null);
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getLastName().equals(lastName)) {
				searchedStudent = students[i];
				System.out.println("Student you are looking for: " + searchedStudent.toString());
				break;
			} else if (i == students.length - 1 && students[i] != null && !students[i].getLastName().equals(lastName)) {
				throw new StudentNotFoundException();
			} else {
				continue;
			}
		}
		return searchedStudent;
	}

	public boolean removeStudentByID(int id) {
		boolean isStudent = false;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getId() == id) {
				System.out.println("Student " + students[i].toString() + " succecfully removed");
				students[i] = null;
				isStudent = true;
				break;
			} else if (i == students.length - 1 && students[i] != null && students[i].getId() != id) {
				System.out.println("There are no such student");
			} else {
				continue;
			}
		}
		return isStudent;
	}
	
	public void sortStudentsByLastName() {
		Arrays.sort(students, Comparator.nullsLast(new SortStudentsByLastName()));
	}

	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", students=" + Arrays.toString(students) + "]";
	}

	public String getNameGroup() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addStudent1(int j) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean areEquivalentStudents() {
		for (int i = 0; i < students.length - 1; i++) {
			for (int j = i + 1; j < students.length; j++) {
				if (students[i] != null && students[i].equals(students[j])) {
					printIndexes(i+1, j+1);
					return true;
				}
			}
		}
		return false;
	}

	private void printIndexes(int first, int second) {
		System.out.println("Students " + first + " and " + second + " are equivalent");
	}
}
