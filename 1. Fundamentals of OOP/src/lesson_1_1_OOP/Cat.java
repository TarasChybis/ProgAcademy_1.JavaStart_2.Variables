package lesson_1_1_OOP;

public class Cat {
		
//Object characteristics
//FIELDS and field values
//	String name;
//	int weight;
//	String color;
	private String name;
	private int weight;
	private String color;
					
//Constructor:
//Keyboard Eclipse: Alt + Shift + S 
//Keyboard Idea: Alt + Int + Sirt
//Toolbar: Source/Generete constructor using Fields…
	public Cat(String name, int weight, String color) {
		super();
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
					
//Empty constructor:
	public Cat() {
		super();
	}
//Methods for Getting and Setting Getters and Setters:
//Written AFTER constructors
//Keyboard Eclipse: Alt + Shift + S
//Keyboard Idea: Alt + Int + Sirt
//Toolbar: Source/Generete Getters and Setters
					
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//Behavior related methods
	public String meow() {
		return "meow meow";
	}
						
//Behavior related methods
	public void jump() {
		System.out.println("hop");
	}
					
//Встроенный метод служебный - служит для вывода на экран информацию о состоянии объекта.
//Состояние объекта: название класса, и чему равны значения полей
	public String toString() {
		return "Cat [name=" + name + ", weight=" + weight + ", color=" + color + "]";
	}	
}