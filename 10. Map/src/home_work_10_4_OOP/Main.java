//Реализуйте программу, которая сопоставит каждой букве ее представление в виде ASCII - art, например:
//          *
//         * *
//        *   * 
//А      *******
//      *       *
//     *         *
//Ваша программа должна дать возможность вывода произвольного текста на экран в виде его ASCII-art представления.


package home_work_10_4_OOP;

public class Main {

	public static void main(String[] args) {

		Alphabet alphabet = new Alphabet();
        System.out.println(alphabet.print("JAVA"));
    }
}
