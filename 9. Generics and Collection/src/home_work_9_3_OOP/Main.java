//Считайте из файла текст на английском языке, вычислите относительную частоту повторения каждой буквы и выведите на  экран результат в порядке убывания относительной частоты повторения.

package home_work_9_3_OOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		File fileAtxt = new File("a.txt");
		String text = fromFile(fileAtxt);
		System.out.println(text);

		ArrayList<ClassChar> lcs = new ArrayList<ClassChar>();
		lcs.add(new ClassChar('A', classCharFromText(text, 'a')));
		lcs.add(new ClassChar('B', classCharFromText(text, 'b')));
		lcs.add(new ClassChar('C', classCharFromText(text, 'c')));
		lcs.add(new ClassChar('D', classCharFromText(text, 'd')));
		lcs.add(new ClassChar('E', classCharFromText(text, 'e')));
		lcs.add(new ClassChar('F', classCharFromText(text, 'f')));
		lcs.add(new ClassChar('G', classCharFromText(text, 'g')));
		lcs.add(new ClassChar('H', classCharFromText(text, 'h')));
		lcs.add(new ClassChar('I', classCharFromText(text, 'i')));
		lcs.add(new ClassChar('J', classCharFromText(text, 'j')));
		lcs.add(new ClassChar('K', classCharFromText(text, 'k')));
		lcs.add(new ClassChar('L', classCharFromText(text, 'l')));
		lcs.add(new ClassChar('M', classCharFromText(text, 'm')));
		lcs.add(new ClassChar('N', classCharFromText(text, 'n')));
		lcs.add(new ClassChar('O', classCharFromText(text, 'o')));
		lcs.add(new ClassChar('P', classCharFromText(text, 'p')));
		lcs.add(new ClassChar('Q', classCharFromText(text, 'q')));
		lcs.add(new ClassChar('R', classCharFromText(text, 'r')));
		lcs.add(new ClassChar('S', classCharFromText(text, 's')));
		lcs.add(new ClassChar('T', classCharFromText(text, 't')));
		lcs.add(new ClassChar('U', classCharFromText(text, 'u')));
		lcs.add(new ClassChar('V', classCharFromText(text, 'v')));
		lcs.add(new ClassChar('W', classCharFromText(text, 'w')));
		lcs.add(new ClassChar('X', classCharFromText(text, 'x')));
		lcs.add(new ClassChar('Y', classCharFromText(text, 'y')));
		lcs.add(new ClassChar('Z', classCharFromText(text, 'z')));
		
		Collections.sort(lcs, new CharComparator());
		
		for (ClassChar cChar : lcs) {
			System.out.println(cChar);
		}
	}

	public static String fromFile(File file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader bff = new BufferedReader(new FileReader(file))) {
			String text;
			for (; (text = bff.readLine()) != null;) {
				sb.append(text).append(System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	public static long classCharFromText(String text, char ch) {
		long number = 0;
		char[] arr = text.toLowerCase().toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				number = number + 1;
			}
		}
		return number;
	}

}