//Реализуйте программу, которая с периодичностью 1 сек, будет проверять состояние заданного каталога. Если в этом каталоге появится новый файл или исчезнет существующий, то выведется сообщение об этом событии. Программа должна работать в параллельном потоке выполнения. (Вариант 1).

package home_work_6_5a_OOP;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		File foldreLog = new File("LOGS");
        if(!foldreLog.exists()) foldreLog.mkdir();
        Logger logger = new Logger(new File("LOGS", "log.txt"));
        try {
            logger.init();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Runnable monitor = new MonitorRunnable(new File("folder1"), logger, 1000);
        Thread thread = new Thread(monitor);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
