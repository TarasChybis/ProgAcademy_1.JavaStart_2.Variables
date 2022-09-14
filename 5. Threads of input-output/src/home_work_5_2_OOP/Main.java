//Implement a separate GroupFileStorage class that will have the following methods:
//- void saveGroupToCSV(Group gr) - write group to CSV file
//- Group loadGroupFromCSV(File file) - read and return a group from a file
//- File findFileByGroupName(String groupName, File workFolder) - search for a file in the working directory (workFolder). The name of the file is determined by the name of the group saved in it.

package home_work_5_2_OOP;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws GroupOverflowException, StudentException {
		
		Student st1 = new Student("Vasyl", "Kozak", 566, "Group01");
		Student st2 = new Student("Ivan", "Petrenko", 567, "Group01");
		Student st3 = new Student("Sveta", "Guzeva", 568, "Group01");
		Student st4 = new Student("Oleksander", "Portnoy", 570, "Group01");

		Student[] students = new Student[] {st1, st2,st3,st4};
		Group group1= new Group("OPP", students);
		
		GroupFileStorage gfs = new GroupFileStorage();
		
		group1.addStudent1(855);
		gfs.saveGroupToCSV(group1);
		
		Group y = new Group("start", students);
		File file = new File("C:\\123\\oop2.1\\OPP");
		try {
			y = gfs.loadGroupFromCSV(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(y);
		
		File search = new File("C:\\123\\oop2.1");
		File searchTotal = gfs.findFileByGroupName("OPP", search);
		if(searchTotal!=null) {
		System.out.println(searchTotal.getName());
		} else {
			System.out.println("Файл не существует");
		}
		
	}
}
