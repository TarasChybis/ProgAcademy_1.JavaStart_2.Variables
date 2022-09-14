package lesson_6_4_OOP;

import java.math.BigInteger;

public class FactorialTask implements Runnable {
	
	private int number;
	private BigInteger sum = BigInteger.ZERO;
	
	public FactorialTask(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public BigInteger getSum() {
		return sum;
	}

	public BigInteger calculateFactorial(int n) {
		BigInteger fact = BigInteger.ONE;
		for(int i = 1; i <= n; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

	@Override
	public void run() {

		Thread thr = Thread.currentThread();	//Что бы убедиться, что исполнитель этого метода run() это не главный поток, а какой-то другой, который мы создадим. Поэтому получаем ссылку на исполгителя этого потока.
		for(int i = 1; i <= number; i++) {
			
			if(thr.interrupted()) {
				System.out.println(thr.getName() + " interrupted");
				return;
			}
			
			BigInteger fact = calculateFactorial(i);
			sum = sum.add(fact);
			System.out.println(thr.getName() + " " + i + " ! = " + fact);
		}
	}
	
}
