//Implement exceptions for entering prices from a file.

package lesson_3_1_OOP;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		File file = new File("price.txt");
		Integer price = null;
		try {
			Scanner sc = new Scanner(file);
			price = sc.nextInt();

			if (price < 0) {
				price = null;
				throw new NegativeValueException();
			}
		} catch (IOException e) {
			System.out.println("File not found");
		} catch (InputMismatchException e) {
			System.out.println("Error file format");
		} catch (NegativeValueException e) {
			System.out.println("Price must be positive");
		} finally {
			System.out.println("Thank you for using our servise :)");
		}
		System.out.println("price = " + price);
	}
}
