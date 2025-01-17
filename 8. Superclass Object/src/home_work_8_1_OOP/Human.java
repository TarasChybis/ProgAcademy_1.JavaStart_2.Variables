package home_work_8_1_OOP;

import java.util.Objects;

public abstract class Human {

	private String name;
	private String lastName;
	private Gender gender;

	public Human(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
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
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass()!=o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(getName(), human.getName()) &&
               Objects.equals(getLastName(), human.getLastName()) &&
               getGender() == human.getGender();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastName(), getGender());
    }
}
