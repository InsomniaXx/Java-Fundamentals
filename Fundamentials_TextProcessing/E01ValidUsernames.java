package Fundamentals.Fundamentials_TextProcessing;

import java.util.Scanner;

public class E01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        boolean isValid = false;

        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i];

            if (currentWord.length() < 3 || currentWord.length() > 16) {
                continue;
            }
            for (int j = 0; j < currentWord.length(); j++) {
                char currentChar = currentWord.charAt(j);
                if (Character.isLetterOrDigit(currentChar) || currentChar == '_' || currentChar == '-') {
                    isValid = true;
                } else {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.println(currentWord);
            }
        }
    }
}
