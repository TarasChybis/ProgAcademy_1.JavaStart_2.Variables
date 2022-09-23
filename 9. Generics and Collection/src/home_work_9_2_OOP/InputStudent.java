package home_work_9_2_OOP;

import java.util.Scanner;

public class InputStudent {

	public Student readStudentFromfKeyboard() {

		Scanner sc = new Scanner(System.in);

		Student newStudent = new Student(null, null, 0, null);

		System.out.println("Please input student name (String):");
		newStudent.setName(sc.nextLine());

		System.out.println("Please input student surname (String):");
		newStudent.setLastName(sc.nextLine());

		System.out.println("Please input student gender (male / female):");
		if (sc.nextLine().equals(Gender.male.getGender())) { 
			newStudent.setGender(Gender.male);
		} else {
			newStudent.setGender(Gender.female);
		}

		System.out.println("Please input student IdStudBook (int 1-999):");
		newStudent.setId(sc.nextInt());

		System.out.println("Please input student GroupName(String):");
		sc.nextLine();

//		2-й способ считывания линии после инта 
//		newStudent.setId(Integer.parseInt(sc.nextLine()));
//		System.out.println("Please input student GroupName(String):");

		newStudent.setGroupName(sc.nextLine());

		return newStudent;
	}

//	public boolean addStudentToGroup(Student newStudent, Group group) {
//	
//		try {
//			group.addStudent(newStudent);
//			return true;
//		} catch (GroupOverflowException e) {
//			System.out.println("Group " + group.getGroupName() + " over flow");
//			return false;
//		}
//	}

}
