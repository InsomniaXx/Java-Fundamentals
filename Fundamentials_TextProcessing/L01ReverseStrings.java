package Fundamentals.Fundamentials_TextProcessing;

import java.util.Scanner;

public class L01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String nextInput = input;
            String reversed = "";
            for (int i = nextInput.length() - 1; i >= 0; i--) {
                reversed += nextInput.charAt(i);
            }
            System.out.printf("%s = %s%n", input, reversed);
            input = scanner.nextLine();
        }
    }
}
