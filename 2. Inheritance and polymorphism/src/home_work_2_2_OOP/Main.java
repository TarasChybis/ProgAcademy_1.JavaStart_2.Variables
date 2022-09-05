//1) Create a TextTransformer class.
//Method:
//- String transform(String text) - Converts text to upper case. Example hello→ HELLO
//2) Create the class InverseTransformer as a subclass of TextTransformer. Override the String method
//transform(String text) - Reverses the text. Example hello → olleh
//3) Create the class UpDownTransformer as a subclass of TextTransformer. Override the String method
//transform(String text) - Every odd letter is large, even is small. Example hello → HeLlO
//4) Create a TextSaver class.
//Fields:
//- TextTransformer transformer
//- File file
//Methods:
//- void saveTextToFile(String text) - First, one of the transformers (transformer field) converts a string, then save it to a file (file field).

package home_work_2_2_OOP;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		String str ="Hello World!";
        TextTransformer tr = new TextTransformer();
        System.out.println(tr.transform(str));
        tr = new InverseTransformer();
        System.out.println(tr.transform(str));
        tr = new UpDownTransformer();
        System.out.println(tr.transform(str));

        String file = "text.txt";
        TextSaver textSaver = new TextSaver(new UpDownTransformer(), new File(file));
        textSaver.saveTextToFile(str);

    }
}
