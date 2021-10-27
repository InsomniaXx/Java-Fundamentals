package Fundamentals.Fundamentials_TextProcessing;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class L02RepeatedStringsWithStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s");

        Arrays.stream(words)
                .map(word -> repeatWord(word, word.length()))
                .forEach(System.out::print);
    }
    private static String repeatWord(String word, int numberOfRepetitions) {
        String result = "";
        for (int i = 0; i < numberOfRepetitions; i++) {
            result += word;
        }

        return result;
    }
}
