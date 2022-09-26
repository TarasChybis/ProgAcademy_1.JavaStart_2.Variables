package home_work_10_4_OOP;

import java.util.ArrayList;
import java.util.List;

public class LetterW extends Letter{
    public LetterW() {
        super();
        List<String> l = new ArrayList<>();
        l.add("──────");
        l.add("──────");
        l.add("╔╗╔╗╔╗");
        l.add("║╚╝╚╝║");
        l.add("╚╗╔╗╔╝");
        l.add("─╚╝╚╝─");
        setLetter(l);
    }
}
