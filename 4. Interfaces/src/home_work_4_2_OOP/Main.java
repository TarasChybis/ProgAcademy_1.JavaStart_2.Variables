//1) Create a Human class.
//Fields:
//- String name (name).
//- String lastName (last name).
//- Gender gender (gender. Implement using Enum).
//Methods:
//- Standard (getters and setters, toString(), etc.).
//2) Create a class Student as a subclass of Human.
//Fields:
//- int id (study number).
//- String groupName (the name of the group where he studies).
//Methods:
//- Standard (getters and setters, toString(), etc.).
//3) Create classes GroupOverflowException, StudentNotFoundException (successors of Exception) as custom exceptions.
//4) Create a class Group.
//Fields:
//- String groupName (name).
//- Student[] students = new Student[10]; (an array of 10 students).
//Methods:
//- Standard (getters and setters, toString(), etc.).
//- public void addStudent(Student student) throws GroupOverflowException (method of adding a student to a group. If 11 students are added, a custom exception should be thrown).
//- public Student searchStudentByLastName(String lastName) throws StudentNotFoundException (method to search for a student in a group.
//If the student is not found, a custom exception should be thrown).
//- public boolean removeStudentByID(int id) (method of removing a student by grade number, return true if there was such a student and he was removed and false otherwise).
//5) Extend the implementation of the Students group with the ability to sort the array of students by last name. To do this, add the sortStudentsByLastName() method to the Group class.
//6) Create a separate class that implements reading student characteristics from the keyboard (first name, last name, etc.). Create and return a student based on the read data. Use the methods of this class to read and add a student to a group.

package home_work_4_2_OOP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Group group = new Group();
		
		InputStudent studentOOP = new InputStudent();
		
		System.out.println("Input group name");
		String inputGroupName = sc.nextLine();
		group.setGroupName(inputGroupName);

		System.out.println("How many students do you want to input?");
		int studentWantToInput = sc.nextInt();

		for (int i = 1; i <= studentWantToInput; i++) {
			Student student = studentOOP.readStudentFromfKeyboard();
			boolean studentAdded = studentOOP.addStudentToGroup(student, group);
			if (studentAdded == false) {
				break;
			}
		}
		group.sortStudentsByLastName();
		for (Student student1 : group.getStudens()) {
			if (student1 != null) {
				System.out.println(student1.toString());
			}
		}
	}

//2-й способ менее универсальный
//	public static void main(String[] args) {
//		InputStudent studentOOP = new InputStudent();
//		Group group = new Group();
//
//		Student stud1 = studentOOP.readStudentFromfKeyboard();
//		Student stud2 = studentOOP.readStudentFromfKeyboard();
//
//		group.setGroupName("oop");
//		studentOOP.addStudentToGroup(stud1, group);
//		studentOOP.addStudentToGroup(stud2, group);
//		
//		group.sortStudentsByLastName();
//		for (Student student : group.getStudens()) {
//			if (student != null) {
//				System.out.println(student.toString());
//			}
//		}
//	}
//}
		
//		Group group1 = new Group();
//		group1.setGroupName("Group01");
//		Group group2 = new Group();
//		group2.setGroupName("Group02");
//		
//		Student student1 = new Student("Vasyl", "Kozak", Gender.male, 566);
//		Student student2 = new Student("Ivan", "Petrenko", Gender.male, 567);
//		Student student3 = new Student("Sveta", "Guzeva", Gender.female, 568);
//		Student student4 = new Student("Vasyl", "Bortyk", Gender.male, 569);
//		Student student5 = new Student("Oleksander", "Portnoy", Gender.male, 570);
//		Student student6 = new Student("Olga", "Prylepa", Gender.female, 571);
//		Student student7 = new Student("Petro", "Ohtyrskyi", Gender.male, 572);
//		Student student8 = new Student("Nikita", "Luznyi", Gender.male, 573);
//		Student student9 = new Student("Oleksander", "Tochara", Gender.male, 574);
//		Student student10 = new Student("Tamara", "Viytyk", Gender.female, 575);
//		Student student11 = new Student("Sofia", "Gorovetska", Gender.female, 576);
//		Student student12 = new Student("Lida", "Gorovetska", Gender.female, 577);
//		
////		System.out.println(student1);
////		System.out.println(group1);
//		
//		try {
//			group1.addStudent(student1);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		try {
//			group1.addStudent(student2);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		try {
//			group1.addStudent(student3);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		try {
//			group1.addStudent(student4);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		try {
//			group1.addStudent(student5);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		try {
//			group1.addStudent(student6);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		try {
//			group1.addStudent(student7);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		try {
//			group1.addStudent(student8);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		try {
//			group1.addStudent(student9);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		try {
//			group1.addStudent(student10);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		try {
//			group1.addStudent(student11);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		try {
//			group2.addStudent(student11);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		try {
//			group2.addStudent(student12);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		try {
//			group1.searchStudentByLastName("Boyko");
//		} catch (StudentNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Student not found");
//		}
//				
//		System.out.println(group1.toString());
//		System.out.println(group2.toString());
//		
//		group1.removeStudentByID(570);
//		
//		System.out.println(group1.toString());
//		System.out.println(group2.toString());
//		
//		try {
//			group1.addStudent(student11);
//		} catch (GroupOverflowException e) {
//			System.out.println("The group is full, sorry");
//		}
//		
//		group1.sortStudentsByLastName();
//		System.out.println(group1.toString());
//	}
		
}
