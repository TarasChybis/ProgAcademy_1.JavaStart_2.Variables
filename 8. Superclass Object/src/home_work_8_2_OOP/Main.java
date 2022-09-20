//Реализуйте вспомогательный метод для проверки факта отсутствия эквивалентных студентов в группе.

package home_work_8_2_OOP;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws GroupOverflowException, StudentException {
		
		Group group1 = new Group();
		
		Student st1 = new Student("Vasyl", "Kozak", 566, "Group01");
		Student st2 = new Student("Ivan", "Petrenko", 567, "Group01");
		Student st3 = new Student("Sveta", "Guzeva", 568, "Group01");
		Student st4 = new Student("Oleksander", "Portnoy", 570, "Group01");
		Student st5 = new Student("Oleksander", "Portnoy", 570, "Group01");

//		System.out.println(st1.equals(st1));
//        System.out.println(st2.equals(st1));
//        System.out.println(st2.equals(st3));
//        System.out.println();
//        System.out.println(st1.hashCode());
//        System.out.println(st2.hashCode());
//        System.out.println(st3.hashCode());
    	
		Student[] students = new Student[10]; 
		
		group1.addStudent(st1);
		group1.addStudent(st2);
		group1.addStudent(st3);
		group1.addStudent(st4);
		group1.addStudent(st5);
		
		group1.areEquivalentStudents();
		
//		Group group1 = new Group("OPP", students);
		
//		GroupFileStorage gfs = new GroupFileStorage();
//		
//		group1.addStudent1(855);
//		gfs.saveGroupToCSV(group1);
		
//		Group y = new Group("start", students);
//		File file = new File("C:\\123\\oop2.1\\OPP");
//		try {
//			y = gfs.loadGroupFromCSV(file);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(y);
		
//		File search = new File("C:\\123\\oop2.1");
//		File searchTotal = gfs.findFileByGroupName("OPP", search);
//		if(searchTotal!=null) {
//		System.out.println(searchTotal.getName());
//		} else {
//			System.out.println("Файл не существует");
//		}
		
	}
	
}
