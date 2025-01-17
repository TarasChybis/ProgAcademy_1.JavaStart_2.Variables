package home_work_2_2_OOP;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextSaver {

	private TextTransformer transformer;
    private File file;

    public TextSaver() {
    }

    public TextSaver(TextTransformer transformer, File file) {
        this.transformer = transformer;
        this.file = file;
    }

    public void saveTextToFile(String text){
        text = transformer.transform(text);
        try (PrintWriter pw = new PrintWriter(file)){
            pw.println(text);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
