package home_work_9_2_OOP;

public class StudentException extends Exception {

	@Override
	public String getMessage() {
		return "This enought students";
	}
}
