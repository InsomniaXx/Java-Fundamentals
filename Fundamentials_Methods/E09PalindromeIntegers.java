package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class E09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            //String number = scanner.nextLine();
            boolean isPalindrome = getPalindrome(input);

            if (isPalindrome) {
                System.out.println("true");
            } else
                System.out.println("false");

            input = scanner.nextLine();
        }
    }

    private static boolean getPalindrome(String input) {
        boolean result = false;
        int n = input.length();
        if (input.charAt(0) == input.charAt(n - 1)) {
            result = true;
        }
        return result;
    }
}
