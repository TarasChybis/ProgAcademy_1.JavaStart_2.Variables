//Extend the implementation of the Students group with the ability to sort the array of students by last name. To do this, add the sortStudentsByLastName() method to the Group class.

package home_work_4_1_OOP;

public class Main {

	public static void main(String[] args) {
		
		Group group1 = new Group();
		group1.setGroupName("Group01");
		Group group2 = new Group();
		group2.setGroupName("Group02");
		
		Student student1 = new Student("Vasyl", "Kozak", Gender.male, 566);
		Student student2 = new Student("Ivan", "Petrenko", Gender.male, 567);
		Student student3 = new Student("Sveta", "Guzeva", Gender.female, 568);
		Student student4 = new Student("Vasyl", "Bortyk", Gender.male, 569);
		Student student5 = new Student("Oleksander", "Portnoy", Gender.male, 570);
		Student student6 = new Student("Olga", "Prylepa", Gender.female, 571);
		Student student7 = new Student("Petro", "Ohtyrskyi", Gender.male, 572);
		Student student8 = new Student("Nikita", "Luznyi", Gender.male, 573);
		Student student9 = new Student("Oleksander", "Tochara", Gender.male, 574);
		Student student10 = new Student("Tamara", "Viytyk", Gender.female, 575);
		Student student11 = new Student("Sofia", "Gorovetska", Gender.female, 576);
		Student student12 = new Student("Lida", "Gorovetska", Gender.female, 577);
		
//		System.out.println(student1);
//		System.out.println(group1);
		
		try {
			group1.addStudent(student1);
		} catch (GroupOverflowException e) {
			System.out.println("The group is full, sorry");
		}
		
		try {
			group1.addStudent(student2);
		} catch (GroupOverflowException e) {
			System.out.println("The group is full, sorry");
		}
		
		try {
			group1.addStudent(student3);
		} catch (GroupOverflowException e) {
			System.out.println("The group is full, sorry");
		}
		
		try {
			group1.addStudent(student4);
		} catch (GroupOverflowException e) {
			System.out.println("The group is full, sorry");
		}
		
		try {
			group1.addStudent(student5);
		} catch (GroupOverflowException e) {
			System.out.println("The group is full, sorry");
		}
		
		try {
			group1.addStudent(student6);
		} catch (GroupOverflowException e) {
			System.out.println("The group is full, sorry");
		}
		
		try {
			group1.addStudent(student7);
		} catch (GroupOverflowException e) {
			System.out.println("The group is full, sorry");
		}
		
		try {
			group1.addStudent(student8);
		} catch (GroupOverflowException e) {
			System.out.println("The group is full, sorry");
		}
		
		try {
			group1.addStudent(student9);
		} catch (GroupOverflowException e) {
			System.out.println("The group is full, sorry");
		}
		
		try {
			group1.addStudent(student10);
		} catch (GroupOverflowException e) {
			System.out.println("The group is full, sorry");
		}
		
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
		
		group1.sortStudentsByLastName();
		System.out.println(group1.toString());
	}
		
}
