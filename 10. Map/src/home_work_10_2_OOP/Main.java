//Сделать ф-ю ручного наполнения словаря и возможность его сохранения на диск.

package home_work_10_2_OOP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map<String, String> hmap = new HashMap<String, String>();
		
		TranslateClass tr = new TranslateClass();
		
//		TranslateClass.addEngUkrWords("one","один");
//		TranslateClass.addEngUkrWords("two","два");
//		TranslateClass.addEngUkrWords("three","три");
//		TranslateClass.addEngUkrWords("four","чотири");
//		TranslateClass.addEngUkrWords("five","п'ять");
		tr.addEngUkrWords("seven","сім");
		tr.addEngUkrWords("eleven","одинадцять");
		tr.addEngUkrWords("twenty","двадцять");
		
		
		hmap = tr.engUkrWords();	
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print(mentry.getKey() + "\t\t");
			System.out.println(mentry.getValue());
		}
		
//		TranslateClass.translateWords("English.in","Ukrainian.out");


	}

}
