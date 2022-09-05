package home_work_2_2_OOP;

public class InverseTransformer extends TextTransformer {

	@Override
    public String transform(String text){
        StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
    }
}
