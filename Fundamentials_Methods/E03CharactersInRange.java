package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class E03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        String charsRange = getCharactersInRange(firstChar, secondChar);
        System.out.println(charsRange);
    }

    private static String getCharactersInRange(int firstChar, int secondChar) {
        String stringRange = "";
        if (firstChar < secondChar) {
            for (int i = firstChar + 1; i < secondChar; i++) {
                stringRange += (char) i + " ";
            }
        } else {
            for (int i = secondChar + 1; i < firstChar; i++) {
                stringRange += (char) i + " ";
            }
        }

        return stringRange;
    }
}
