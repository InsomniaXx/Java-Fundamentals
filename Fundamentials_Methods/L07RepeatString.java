package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class L07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String output = getRepeatedString(input, n);
        System.out.println(output);
    }

    private static String getRepeatedString(String input, int n) {
        String repeatedString = "";
        for (int i = 1; i <= n; i++) {
            repeatedString += input;
        }
        return repeatedString;
    }
}
