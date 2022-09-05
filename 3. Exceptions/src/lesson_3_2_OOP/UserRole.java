package lesson_3_2_OOP;

public enum UserRole {

	ADMINISTRATOR("rwd"), EDITOR("rw"), READER;
	
	private String filePermissions = "r";   //Enumeration field
		
	private UserRole(String filePermissions) {   //Enumeration constructor
		this.filePermissions = filePermissions;
	}
	
	private UserRole() {
	}
	
	public String getFilePermissions() {   //Enumeration method
		return filePermissions;
	}
}
