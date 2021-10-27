package Fundamentals.Fundamentials_TextProcessing;

import java.util.Scanner;

public class L04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] forbiddenWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < forbiddenWords.length; i++) {
            String asteriskCensor = "";
            for (int j = 0; j < forbiddenWords[i].length(); j++) {
                asteriskCensor += "*";
            }
            text = text.replaceAll(forbiddenWords[i], asteriskCensor);
        }
        System.out.println(text);
    }
}
