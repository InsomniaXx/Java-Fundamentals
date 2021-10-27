package Fundamentals.Fundamentials_TextProcessing;

import java.util.Scanner;

public class A02ASCIISumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstChar = scanner.nextLine().charAt(0);
        int secondChar = scanner.nextLine().charAt(0);

        String inputString = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < inputString.length(); i++) {
            int currentCharCode = inputString.charAt(i);

            if (currentCharCode > firstChar && currentCharCode < secondChar) {
                sum += currentCharCode;
            }
        }
        System.out.println(sum);
    }
}
