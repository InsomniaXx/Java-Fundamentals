package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class E06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        System.out.println(getMiddleChars(input));
    }

    private static String getMiddleChars(String input) {
        String result = "";
        if (input.length() % 2 == 0) {
            result += (char) input.charAt(input.length() / 2 - 1);
            result += (char) input.charAt(input.length() / 2);
        } else {
            result += (char) input.charAt(input.length() / 2);
        }
        return result;
    }
}
