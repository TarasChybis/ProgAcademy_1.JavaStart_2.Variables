//1) Create an Animal class.
//It should have fields:
//- String ration (what the animal eats)
//- String color (what color it is)
//- int weight (weight)
//Methods:
//- Standard (getters and setters, toString(), etc.)
//- String getVoice() (vote)
//- void eat() (eat)
//- void sleep() (sleep)
//2) Create classes Cat, Dog as subclasses of Animal. Add a new String name field. Redefine getVoice(), eat(), sleep() methods.
//3) Create a Veterinarian class.
//Fields:
//- String name
//Methods:
//- Standard
//- void treatment (Animal animal). (Treatment of an animal. Cats and dogs can be treated).

package home_work_2_1_OOP;

public class Main {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat("fish", "black and white", 5, "Kuza");
		Cat cat2 = new Cat("fish", "gray", 4, "Murchik");
		Cat cat3 = new Cat("fish", "red", 3, "Barsik");
		
		Dog dog1 = new Dog("meat", "brown", 8, "Malysh");
		Dog dog2 = new Dog("meat", "black", 10, "Bella");
		Dog dog3 = new Dog("meat", "gold", 7, "Mila");
		
		System.out.println(cat1);
		System.out.println(cat1.getVoice());
		cat1.eat();
		
		System.out.println(cat2);
		System.out.println(cat2.getVoice());
		cat2.eat();
		
		System.out.println(dog1);
		System.out.println(dog1.getVoice());
		dog1.eat();
		
		System.out.println(dog2);
		System.out.println(dog2.getVoice());
		dog2.eat();
		
		Veterinarian vet1 = new Veterinarian("Leopold Cat");
		System.out.println(vet1);
		vet1.treatment(cat1);
		vet1.treatment(dog1);
		vet1.treatment(cat3);

	}
	
}
