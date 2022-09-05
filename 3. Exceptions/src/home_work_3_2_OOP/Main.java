//Implement a method to sort an array of students by last name. Use it in the toString() method of the Group class to get a list of students in alphabetical order.

package home_work_3_2_OOP;

public class Main {

	public static void main(String[] args) {
		
		Group group1 = new Group();
		group1.setGroupName("Group01");
		Group group2 = new Group();
		group2.setGroupName("Group02");
		
		Student student1 = new Student("Vasyl", "Kozak", Gender.male, 566, "Group01");
		Student student2 = new Student("Ivan", "Petrenko", Gender.male, 567, "Group01");
		Student student3 = new Student("Sveta", "Guzeva", Gender.female, 568, "Group02");
		Student student4 = new Student("Vasyl", "Bortyk", Gender.male, 569, "Group02");
		Student student5 = new Student("Oleksander", "Portnoy", Gender.male, 570, "Group01");
		Student student6 = new Student("Olga", "Prylepa", Gender.female, 571, "Group02");
		Student student7 = new Student("Petro", "Ohtyrskyi", Gender.male, 572, "Group02");
		Student student8 = new Student("Nikita", "Luznyi", Gender.male, 573, "Group01");
		Student student9 = new Student("Oleksander", "Tochara", Gender.male, 574, "Group02");
		Student student10 = new Student("Tamara", "Viytyk", Gender.female, 575, "Group02");
		Student student11 = new Student("Sofia", "Gorovetska", Gender.female, 576, "Group02");
		Student student12 = new Student("Lida", "Gorovetska", Gender.female, 577, "Group02");
		
		System.out.println(student1);
		System.out.println(group1);
		
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
		
		try {
			group1.addStudent(student11);
		} catch (GroupOverflowException e) {
			System.out.println("The group is full, sorry");
		}
		
		try {
			group2.addStudent(student12);
		} catch (GroupOverflowException e) {
			System.out.println("The group is full, sorry");
		}
		
		try {
			group1.searchStudentByLastName("Boyko");
		} catch (StudentNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Student not found");
		}
				
		System.out.println(group1.toString());
		System.out.println(group2.toString());
		
		group1.removeStudentByID(570);
		
		System.out.println(group1.toString());
		System.out.println(group2.toString());
		
		try {
			group1.addStudent(student11);
		} catch (GroupOverflowException e) {
			System.out.println("The group is full, sorry");
		}
		
		System.out.println(group1.toString());
		System.out.println(group2.toString());
		
	}
}
