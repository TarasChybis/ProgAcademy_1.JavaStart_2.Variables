package home_work_10_4_OOP;

import java.util.ArrayList;
import java.util.List;

public class LetterC extends Letter {

	public LetterC() {
        super();
        List<String> l = new ArrayList<>();
        l.add("╔═══╗");
        l.add("║╔═╗║");
        l.add("║║─╚╝");
        l.add("║║─╔╗");
        l.add("║╚═╝║");
        l.add("╚═══╝");
        setLetter(l);
    }
}
