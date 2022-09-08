package home_work_4_3_OOP;

public class StudentException extends Exception {

	@Override
	public String getMessage() {
		return "This enought students";
	}
}
