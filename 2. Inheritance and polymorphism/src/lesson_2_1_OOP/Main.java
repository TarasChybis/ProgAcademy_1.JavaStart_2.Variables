//1) Create a Person class.
//It should have fields:
//- String name
//- String lastName
//Methods:
//- Standard (getters and setters, toString(), etc.)
//2) Create an Employee class as a subclass of Person. Add new fields int id and String department. Override method
//String toString().

package lesson_2_1_OOP;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Al", "Ts", 1, "dev");
		
		System.out.println(employee.getName());
		
		System.out.println(employee.hashCode());

		System.out.println(employee);
	}
}
