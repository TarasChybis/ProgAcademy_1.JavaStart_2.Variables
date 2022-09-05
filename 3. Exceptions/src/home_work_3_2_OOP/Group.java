package home_work_3_2_OOP;

import java.util.Arrays;

public class Group {

	private static final Gender Gender = null;
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

	public void addStudent(Student student) throws GroupOverflowException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				student.setGroupName(groupName);
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
		Student temp = new Student(groupName, groupName, Gender);
		for (int j = 0; j < students.length; j++) {
			for (int i = 0; i < students.length - 1; i++) {
				if (students[i] != null && students[i + 1] != null
					&& students[i].getLastName().compareTo(students[i + 1].getLastName()) > 0) {
					temp = students[i + 1];
					students[i + 1] = students[i];
					students[i] = temp;
				}
			}
		}
	}
	
	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", students=" + Arrays.toString(students) + "]";
	}
}
