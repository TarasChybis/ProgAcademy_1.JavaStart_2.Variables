package home_work_8_1_OOP;

public class StudentException extends Exception {

	@Override
	public String getMessage() {
		return "This enought students";
	}
}
