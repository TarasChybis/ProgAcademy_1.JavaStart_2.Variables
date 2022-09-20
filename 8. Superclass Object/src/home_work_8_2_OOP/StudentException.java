package home_work_8_2_OOP;

public class StudentException extends Exception {

	@Override
	public String getMessage() {
		return "This enought students";
	}
}
