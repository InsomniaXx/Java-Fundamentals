package Fundamentals.Fundamentials_TextProcessing;

import java.util.Scanner;

public class L02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s");

        for (String word : words) {
            String repeatedString = repeatWord(word, word.length());
            System.out.print(repeatedString);
        }
    }

    private static String repeatWord(String word, int numberOfRepetitions) {
        String result = "";
        for (int i = 0; i < numberOfRepetitions; i++) {
            result += word;
        }

        return result;
    }
}
