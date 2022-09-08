package home_work_4_3_OOP;

public class Student extends Human implements CSVConverter {

	private int id;
	private String groupName;

	public Student(String name, String lastName, int id, String groupName) {
		super(name, lastName);
		this.id = id;
		this.groupName = groupName;
	}

	public Student(String name, String lastName, int id) {
		super(name, lastName);
		this.id = id;
	}

	public Student(String name, String lastName, Gender gender) {
		super(name, lastName);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", groupName=" + groupName + " " + super.toString() + "]";
	}
	
	@Override
	public String toCSVString() {
		return super.getName() + ";" + super.getLastName() + ";" + this.getId() + ";" + this.getGroupName() + ";";
	}

	@Override
	public Student fromCSVString(String str) {
		String[] st = str.split(";");
		String nameNew = st[0];
		String lastnameNew = st[1];
		int idNew = Integer.parseInt(st[3]);
		String groupNameNew = st[4];
		return new Student(nameNew, lastnameNew, idNew, groupNameNew);
	}
}
