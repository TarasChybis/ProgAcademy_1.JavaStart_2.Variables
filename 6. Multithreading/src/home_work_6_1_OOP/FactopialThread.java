package home_work_6_1_OOP;

import java.math.BigInteger;

public class FactopialThread implements Runnable {

	private int number;

	public FactopialThread(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	private BigInteger calculateFactorial(int numberI) {
		BigInteger bi = new BigInteger("1");
		for (int i = 2; i <= numberI; i += 1) {
			bi = bi.multiply(new BigInteger("" + i));
		}
		return bi;
	}

	@Override
	public void run() {
		Thread thr = Thread.currentThread();
		System.out.println("Number Thread is - " + this.number + "  factorial " + this.number + "! = "
				+ calculateFactorial(this.number));

	}

}
