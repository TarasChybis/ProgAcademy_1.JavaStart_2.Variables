package home_work_10_4_OOP;

import java.util.ArrayList;
import java.util.List;

public class LetterB extends Letter {

	public LetterB() {
        super();
        List <String> l = new ArrayList<>();
        l.add("╔══╗─");
        l.add("║╔╗║─");
        l.add("║╚╝╚╗");
        l.add("║╔═╗║");
        l.add("║╚═╝║");
        l.add("╚═══╝");
        setLetter(l);
    }
}
