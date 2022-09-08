//Declare an interface
//	public interface CSVConverter{
//		public String toCSVString();
//		public Student fromCSVString(String str);
//	}
//The Student class must implement this interface. The implementation logic is as follows - based on the Student, create a line with its CSV representation, and vice versa, create a Student based on this line.

package home_work_4_3_OOP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws GroupOverflowException, StudentException {
		
		Student st1 = new Student("Vasyl", "Kozak", 566, "Group01");
		Student st2 = new Student("Ivan", "Petrenko", 567, "Group01");
		Student st3 = new Student("Sveta", "Guzeva", 568, "Group01");
		Student st4 = new Student("Oleksander", "Portnoy", 570, "Group01");

		Group Group01 = new Group();

Group01.addStudent(st1);
		Group01.addStudent(st2);
		Group01.addStudent(st3);
		Group01.addStudent(st4);

		Student[] stList = Group01.getStudens();

		for (Student student : stList) {
			System.out.println(student);
		}

		System.out.println();

//		Sort student
		Group01.sortStudentsByLastName();
		Student[] stList1 = Group01.getStudens();

		for (Student student : stList1) {
			System.out.println(student);
		}

//		Create and add student to group

		Student newStudent = StudentCreate.createStudent();

		Group01.addStudent(newStudent);

		Student[] stListNew = Group01.getStudens();

		for (Student student : stListNew) {
			System.out.println(student);
		}
		System.out.println();
		
//		Realize CSVConverter
		String stStr = st1.toCSVString();
		System.out.println(stStr);
		
		String newStudentStr = "Lolik;Orlov;211;Group01";
		Student newStudentFromStr = st1.fromCSVString(newStudentStr);
		System.out.println(newStudentFromStr);
	}

}
