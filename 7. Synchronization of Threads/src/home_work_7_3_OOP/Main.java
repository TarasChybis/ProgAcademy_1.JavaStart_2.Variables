//Реализуйте процесс многопоточного поиска файла в файловой системе. Т.е. вы вводите название файла и в какой части файловой системы его искать. Программа должна вывести на экран все адреса файлов с таким названием.

package home_work_7_3_OOP;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File soughtDir = new File("F:\\TARAS\\IT\\Development\\JAVA");
		String soughtName = "Java Code Conventions.pdf";

		MultiFileSearcher mfs = new MultiFileSearcher();
		SearchTask st = new SearchTask(mfs, soughtDir, soughtName);

	}

}
