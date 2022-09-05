//Implement enumerations 'Enums'.

package lesson_3_2_OOP;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input your role");
		
		UserRole role1 = UserRole.valueOf(sc.nextLine());
		switch (role1) {
		case ADMINISTRATOR:
			System.out.println("You can do everything");
			break;
		case EDITOR:
			System.out.println("You can edit records");
		 	break;
		case READER:
			System.out.println("You can read the record");
			break;
		}
	}
}
