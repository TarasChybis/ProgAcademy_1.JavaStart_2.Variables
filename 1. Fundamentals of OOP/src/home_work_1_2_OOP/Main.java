//Describe the Triangle class.
//As properties, take the lengths of the sides of the triangle.
//Implement a method that will return the area of this triangle.
//Create some objects of this class and test them.

package home_work_1_2_OOP;

public class Main {

	public static void main(String[] args) {

		Triangle triangle_1 = new Triangle();
		triangle_1.setSideA(5.5);
		triangle_1.setSideB(6.2);
		triangle_1.setSideC(4.7);

		Triangle triangle_2 = new Triangle(3.3, 3.0, 3.9);

		System.out.println("Side A = " + triangle_1.getSideA() + " mm;");
		System.out.println("Side B = " + triangle_1.getSideB() + " mm;");
		System.out.println("Side C = " + triangle_1.getSideC() + " mm;");

		System.out.println(triangle_1);
		System.out.println(triangle_2);

		System.out.println("Area of triangle 1 = " + triangle_1.area() + " mm2;");
		System.out.println("Area of triangle 2 = " + triangle_2.area() + " mm2;");
	}
}