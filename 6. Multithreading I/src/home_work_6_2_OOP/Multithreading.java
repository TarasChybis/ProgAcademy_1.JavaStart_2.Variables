package home_work_6_2_OOP;

import java.util.Arrays;

public class Multithreading implements Runnable {

	private long res;
	private int[] array;
	private int start;
	private int finish;

	public Multithreading(int[] array, int start, int finish) {
		super();
		this.array = array;
		this.start = start;
		this.finish = finish;
	}

	public Multithreading() {
		super();
	}
	
	public long getRes() {
		return res;
		}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getFinish() {
		return finish;
	}

	public void setFinish(int finish) {
		this.finish = finish;
	}

	public long count(int[] array) {
		for (int i = start; i <= finish; i++) {
			res +=array[i];
		}
		return res;
	}
	
	@Override
	public void run() {
		Thread th = Thread.currentThread();
		System.out.println("1/4 of array = " + count(array));
		
	}

	@Override
	public String toString() {
		return "Multithreading [res=" + res + ", array=" + Arrays.toString(array) + ", start=" + start + ", finish="
				+ finish + "]";
	}
}
