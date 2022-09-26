package home_work_10_1_OOP;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class TranslateClass {
	
	private static Map<String, String> dict = new HashMap<>();

	public TranslateClass() {
		super();
	}

	public static Map<String, String> getDict() {
		return dict;
	}

	public static void setDict(Map<String, String> dict) {
		TranslateClass.dict = dict;
	}

	public static Map<String, String> engUkrWords() {
		dict.put("family", "родина");
		dict.put("my", "моя");
		dict.put("there", "там");
		dict.put("are", "є");
		dict.put("five", "п'ять");
		dict.put("of", "з");
		dict.put("us", "нас");
		dict.put("parents", "батьків");
		dict.put("elder", "старший");
		dict.put("brother", "брат");
		dict.put("baby", "дитина");
		dict.put("sister", "сестра");
		dict.put("and", "і");
		dict.put("me", "мене");
		dict.put("first", "спочатку");
		dict.put("meet", "зустрітися");
		dict.put("mum", "мама");
		dict.put("dad", "папа");
		dict.put("jane", "Джейн");
		dict.put("michael", "Майкл");
		dict.put("enjoys", "насолоджується");
		dict.put("reading", "читання");
		dict.put("playing", "граючи");
		dict.put("chess", "шахи");
		dict.put("with", "з");
		dict.put("ken", "Кен");
		dict.put("is", "є");
		dict.put("slim", "стрункий");
		dict.put("rather", "скоріше");
		dict.put("tall", "високий");
		dict.put("she", "вона");
		dict.put("has", "має");
		dict.put("long", "довго");
		dict.put("red", "червоний");
		dict.put("big", "великий");
		dict.put("brown", "коричневий");
		dict.put("eyes", "очі");
		dict.put("very", "дуже");
		dict.put("pleasant", "приємний");
		dict.put("smile", "посміхатися");
		dict.put("soft", "м'який");
		dict.put("voice", "голос");
		dict.put("mother", "мати");
		dict.put("kind", "вид");
		dict.put("understanding", "розуміння");
		dict.put("we", "ми");
		dict.put("real", "справжній");
		dict.put("friends", "друзі");
		dict.put("housewife", "домогосподарка");
		dict.put("as", "як");
		dict.put("three", "три");
		dict.put("children", "дітей");
		dict.put("busy", "зайняте");
		dict.put("around", "навколо");
		dict.put("house", "будинок");
		dict.put("takes", "бере");
		dict.put("care", "догляд");
		dict.put("meg", "Мег");
		dict.put("who", "хто");
		dict.put("only", "тільки");
		dict.put("months", "місяців");
		dict.put("old", "старий");
		dict.put("small", "малий");
		dict.put("funny", "смішно");
		dict.put("sleeps", "спить");
		dict.put("eats", "їсть");
		dict.put("sometimes", "іноді");
		dict.put("cries", "плаче");
		dict.put("help", "допомогти");
		dict.put("our", "наш");
		dict.put("let", "дозволяє");
		dict.put("her", "її");
		dict.put("have", "мають");
		dict.put("rest", "відпочинок");
		dict.put("in", "в");
		dict.put("evening", "вечірній");
		dict.put("then", "тоді");
		dict.put("usually", "зазвичай");
		dict.put("reads", "читає");
		dict.put("book", "книга");
		dict.put("or", "або");
		dict.put("just", "просто");
		dict.put("watches", "годинники");
		dict.put("TV", "телевізор");
		dict.put("doctor", "лікар");
		dict.put("he", "він");
		dict.put("handsome", "красивий");
		dict.put("short", "короткий");
		dict.put("dark", "темний");
		dict.put("hair", "волосся");
		dict.put("gray", "сірий");
		dict.put("hardworking", "працьовитий");
		dict.put("man", "чоловік");
		dict.put("strict", "суворий");
		dict.put("but", "але");
		dict.put("always", "завжди");
		dict.put("fair", "справедливий");
		dict.put("thirteen", "тринадцять");
		dict.put("clever", "розумний");
		dict.put("good", "добре");
		dict.put("at", "на");
		dict.put("maths", "математика");
		dict.put("helps", "допомагає");
		dict.put("it", "це");
		dict.put("because", "тому що");
		dict.put("i", "я");
		dict.put("can", "може");
		dict.put("hardly", "навряд чи");
		dict.put("understand", "зрозуміти");
		dict.put("all", "всі");
		dict.put("these", "ці");
		dict.put("sums", "суми");
		dict.put("problems", "проблеми");
		return dict;
	}

	public static String getTextFromFileToString(String s) {
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

	public static void translateWords(String fileIn, String fileOut) {
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
