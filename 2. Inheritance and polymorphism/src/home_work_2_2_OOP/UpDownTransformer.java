package home_work_2_2_OOP;

public class UpDownTransformer extends TextTransformer {

	@Override
    public String transform(String text){
        char[] chars = text.toCharArray();
        text = "";
        for (int i = 0; i < chars.length; i++) {
            if (i%2 == 0){
                chars[i] = Character.toUpperCase(chars[i]);
            }else {
                chars[i] = Character.toLowerCase(chars[i]);
            }
            text += chars[i];
        }
        return text;
    }
}
