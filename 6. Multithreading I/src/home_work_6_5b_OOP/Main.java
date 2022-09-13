//Реализуйте программу, которая с периодичностью 1 сек, будет проверять состояние заданного каталога. Если в этом каталоге появится новый файл или исчезнет существующий, то выведется сообщение об этом событии. Программа должна работать в параллельном потоке выполнения. (Вариант 2).

package home_work_6_5b_OOP;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File folder = new File("F:\\TARAS\\IT\\Development\\JAVA");

		FileMonitor fm = new FileMonitor(folder);

	}
}
