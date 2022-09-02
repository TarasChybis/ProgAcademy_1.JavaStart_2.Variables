//Create class Cat.
//Create methods that describe the look of the Cat class.
//Create methods that describe the behavior of the Cat class.
//Create 2 objects of class Cat.
//Display the parameters of objects of the Cat class.

package lesson_1_1_OOP;

public class Main {

	public static void main(String[] args) {

//Create an object.
//The first thing we do is declare a reference to the object.
//Link type - the class name is also the link type.
				
//		Cat cat1 = new Cat();
//		cat1.color = "White";
//		cat1.name = "Vaska";
//		cat1.weight = 6;
					
//		System.out.println(cat1.name);
//		cat1.jump();
//Description of this object as a string:
//		System.out.println(cat1.toString());
				
//		Cat cat2 = new Cat();
//		cat2.color = "Red";
//		cat2.name = "Luska";
//		cat2.weight = 4;
				
//Or using the constructor:
//		Cat cat2 = new Cat("Luska", 4, "Red");
				
//		System.out.println(cat2.name);
//		cat2.jump();
//Description of this object as a string:
//		System.out.println(cat2.toString());
				
		Cat cat1 = new Cat();
		cat1.setColor("White");
		cat1.setName("Vaska");
		cat1.setWeight(6);
				
		Cat cat2 = new Cat("Luska", 4, "Red");
				
		System.out.println(cat1.getName());
		System.out.println(cat1.getColor());
		System.out.println(cat1.getWeight());
				
//		System.out.println(cat1.toString());
//		System.out.println(cat2.toString());
		System.out.println(cat1);
		System.out.println(cat2);
	}
}