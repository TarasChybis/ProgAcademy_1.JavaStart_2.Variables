package home_work_9_3_OOP;

public class ClassChar {

	private char ch;
	private long rNumber;

	public ClassChar(char ch, long rNumber) {
		super();
		this.ch = ch;
		this.rNumber = rNumber;
	}

	public ClassChar() {
		super();
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public long getrNumber() {
		return rNumber;
	}

	public void setrNumber(long rNumber) {
		this.rNumber = rNumber;
	}

	@Override
	public String toString() {
		return "ClassChar [ch=" + ch + ", rNumber=" + rNumber + "]";
	}

}
