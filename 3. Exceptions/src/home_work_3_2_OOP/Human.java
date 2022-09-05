package home_work_3_2_OOP;

public abstract class Human {

	private String name;
	private String lastName;
	private Gender gender;

	public Human(String name, String lastName, home_work_3_2_OOP.Gender male) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.gender = male;
	}

	public Human() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", lastName=" + lastName + ", gender=" + gender + "]";
	}
}
