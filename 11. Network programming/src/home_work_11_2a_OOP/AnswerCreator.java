package home_work_11_2a_OOP;

public class AnswerCreator {

	public static String createAnswer() {
        String answer = "";
        answer += "<html><head><title>Server info</title> <meta charset='utf-8'></head>";
        answer += "<body><p>Best Server ever!</p>";
        answer += "<p>Number of your order is " + (Client.getNum() - 1)/4;
        answer += "</p></body></html>";
        return answer;
    }
}
