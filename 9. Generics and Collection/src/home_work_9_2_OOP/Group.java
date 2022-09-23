package home_work_9_2_OOP;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Group implements Serializable {

	private String groupName;
//	private Student[] students = new Student[10];
	private List<Student> list = new ArrayList<>();

	public Group(String groupName, List<Student> list) {
		super();
		this.groupName = groupName;
		this.list = list;
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

	public List<Student> getList() {
		return list;
	}

	public void addStudent(Student st) {
		list.add(st);
	}

	public void deleteStudent(Student st) {
		list.remove(st);
	}

	public Student searchStudent(String lastName) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getLastName().equals(lastName)) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", list=" + list + "]";
	}

//	public Student[] getStudens() {
//		return students;
//	}
//
//	public void setStudens(Student[] studens) {
//		this.students = studens;
//	}
//
//	public void addStudent(Student j) throws GroupOverflowException {
//		for (int i = 0; i < students.length; i++) {
//			if (students[i] == null) {
//				students[i] = j;
//				j.setGroupName(groupName);
//				break;
//			} else if (i == students.length - 1 && students[i] != null) {
//				throw new GroupOverflowException();
//			} else {
//				continue;
//			}
//		}
//	}
//
//	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
//		Student searchedStudent = new Student(lastName, lastName, null);
//		for (int i = 0; i < students.length; i++) {
//			if (students[i] != null && students[i].getLastName().equals(lastName)) {
//				searchedStudent = students[i];
//				System.out.println("Student you are looking for: " + searchedStudent.toString());
//				break;
//			} else if (i == students.length - 1 && students[i] != null && !students[i].getLastName().equals(lastName)) {
//				throw new StudentNotFoundException();
//			} else {
//				continue;
//			}
//		}
//		return searchedStudent;
//	}
//
//	public boolean removeStudentByID(int id) {
//		boolean isStudent = false;
//		for (int i = 0; i < students.length; i++) {
//			if (students[i] != null && students[i].getId() == id) {
//				System.out.println("Student " + students[i].toString() + " succecfully removed");
//				students[i] = null;
//				isStudent = true;
//				break;
//			} else if (i == students.length - 1 && students[i] != null && students[i].getId() != id) {
//				System.out.println("There are no such student");
//			} else {
//				continue;
//			}
//		}
//		return isStudent;
//	}
//	
//	public void sortStudentsByLastName() {
//		Arrays.sort(students, Comparator.nullsLast(new SortStudentsByLastName()));
//	}
//
//	@Override
//	public String toString() {
//		return "Group [groupName=" + groupName + ", students=" + Arrays.toString(students) + "]";
//	}
//	
//	public String getNameGroup() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void addStudent1(int j) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	@Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null) return false;
//        if (getClass()!=o.getClass()) return false;
//        Group group = (Group) o;
//        return Objects.equals(getGroupName(), group.getGroupName()) &&
//               Objects.equals(getStudens(), group.getStudens());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getGroupName(), getStudens());
//    }
}
