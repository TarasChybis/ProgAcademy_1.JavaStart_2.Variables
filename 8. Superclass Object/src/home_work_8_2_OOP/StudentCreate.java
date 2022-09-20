package home_work_8_2_OOP;

import java.util.Scanner;

public class StudentCreate {

	public static Student createStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		String name = sc.nextLine();
		System.out.println("Enter student lastname");
		String lastName = sc.nextLine();
		System.out.println("Enter student id");
		int id = sc.nextInt();
		System.out.println("Enter student group name");
		String groupName = sc.nextLine();
		
		Student sd = new Student(name, lastName, id, groupName);
		
		return sd;
	}
}