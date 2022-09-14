package home_work_5_2_OOP;

public class StudentException extends Exception {

	@Override
	public String getMessage() {
		return "This enought students";
	}
}
