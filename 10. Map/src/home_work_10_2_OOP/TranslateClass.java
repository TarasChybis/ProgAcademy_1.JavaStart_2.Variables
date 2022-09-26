package home_work_10_2_OOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TranslateClass implements Serializable {

	private final long serialVersionUID = 1L;
	private Map<String, String> dict = new HashMap<>();

	public TranslateClass() {
		super();
	}

	public Map<String, String> getDict() {
		return dict;
	}

	public void setDict(Map<String, String> dict) {
		this.dict = dict;
	}

	public Map<String, String> engUkrWords() {
		HashMap<String, String> map = null;
		try {
			FileInputStream fis = new FileInputStream("hashmap.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			map = (HashMap) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("Class not found");
			c.printStackTrace();
			return null;
		}
		return map;
	}
	
	public void getEngUkrWords() {
		Set set = engUkrWords().entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			dict.put(mentry.getKey().toString(), mentry.getValue().toString());
		}
	}

	public void addEngUkrWords(String engWord, String ukrWord) {
		getEngUkrWords();
		dict.put(engWord, ukrWord);
		try {
			FileOutputStream fos = new FileOutputStream("hashmap.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dict);
			oos.close();
			fos.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public String getTextFromFileToString(String s) {
		try (BufferedReader f = new BufferedReader(new FileReader(s))) {
			String str = "";
			String res = "";
			for (; (str = f.readLine()) != null;)
				res += str + " ";
			return res;
		} catch (IOException e) {
			return "ERROR";
		}
	}

	public void translateWords(String fileIn, String fileOut) {
		char[] letters = getTextFromFileToString(fileIn).toCharArray();
		String resText = "";
		if (letters.length != 0) {
			String temp = "";
			for (char i : letters) {
				if (i == ' ' || i == '.' || i == '-' || i == ',') {
					if (engUkrWords().get(temp.toLowerCase()) != null) {
						resText += engUkrWords().get(temp.toLowerCase()) + i;
					}
					temp = "";
				} else {
					temp += i;
				}
			}
		}

		try (PrintWriter pw = new PrintWriter(new File(fileOut))) {
			pw.println(resText);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	@Override
	public String toString() {
		return "TranslateClass [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
