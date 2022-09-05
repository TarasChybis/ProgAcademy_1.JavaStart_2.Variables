package home_work_2_1_OOP;

public class Cat extends Animal {

	private String name;

	public Cat(String ration, String color, int weight, String name) {
		super(ration, color, weight);
		this.name = name;
	}

	public Cat(String ration, String color, int weight) {
		super(ration, color, weight);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getVoice() {
		return "meow meow";
	}
	
	@Override
	public void eat() {
		System.out.println("eats fish");
	}

	public void sleep() {
		System.out.println("sleep");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + " " + super.toString() +"]";
	}	
}
