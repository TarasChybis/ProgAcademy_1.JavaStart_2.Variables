package lesson_2_1_OOP;

public class Employee extends Person {

	private int id;              //New field
	private String department;   //New field
	
	public Employee(String name, String lastName, int id, String department) {
		super(name, lastName);
		this.id = id;
		this.department = department;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", department=" + department + " " + super.toString() + "]";
	}	
}
