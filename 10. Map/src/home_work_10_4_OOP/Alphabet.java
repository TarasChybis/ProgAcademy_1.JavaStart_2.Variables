package home_work_10_4_OOP;

import java.util.HashMap;
import java.util.Map;

public class Alphabet {

	private Map<Character, Letter> alphabet = new HashMap<>();

    public Alphabet() {
        this.alphabet.put('A', new LetterA());
        this.alphabet.put('B', new LetterB());
        this.alphabet.put('C', new LetterC());
        this.alphabet.put('D', new LetterD());
        this.alphabet.put('E', new LetterE());
        this.alphabet.put('F', new LetterF());
        this.alphabet.put('G', new LetterG());
        this.alphabet.put('H', new LetterH());
        this.alphabet.put('I', new LetterI());
        this.alphabet.put('J', new LetterJ());
        this.alphabet.put('K', new LetterK());
        this.alphabet.put('L', new LetterL());
        this.alphabet.put('M', new LetterM());
        this.alphabet.put('N', new LetterN());
        this.alphabet.put('O', new LetterO());
        this.alphabet.put('P', new LetterP());
        this.alphabet.put('Q', new LetterQ());
        this.alphabet.put('R', new LetterR());
        this.alphabet.put('S', new LetterS());
        this.alphabet.put('T', new LetterT());
        this.alphabet.put('U', new LetterU());
        this.alphabet.put('V', new LetterV());
        this.alphabet.put('W', new LetterW());
        this.alphabet.put('X', new LetterX());
        this.alphabet.put('Y', new LetterY());
        this.alphabet.put('Z', new LetterZ());
    }

    public String print(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < text.length(); j++) {
                sb.append(alphabet.get(text.toUpperCase().charAt(j)).printLine(i));
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
