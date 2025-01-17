package lesson_7_2_OOP;

public class Printer {

	private Long threadId = null;
	
	public synchronized void printText(String text) {
		Thread thr = Thread.currentThread();
		long id = thr.getId();
		for (; threadId != null && threadId == id;) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print(text + " ");
		threadId = id;
		notifyAll();
	}
}
