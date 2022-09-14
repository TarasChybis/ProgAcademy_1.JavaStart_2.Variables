package lesson_7_2_OOP;

public class PushPullTask implements Runnable {

	private Printer prt;
	private String text;

	public PushPullTask(Printer prt, String text) {
		super();
		this.prt = prt;
		this.text = text;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			prt.printText(text);
		}
	}

}
