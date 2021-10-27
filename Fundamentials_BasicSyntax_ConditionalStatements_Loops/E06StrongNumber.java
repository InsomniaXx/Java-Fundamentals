package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class E06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumFact = 0;
        int startNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            int factorial = 1;
            for (int i = 1; i <= lastDigit; i++) {
                factorial *= i;
            }
            sumFact += factorial;
            number /= 10;
        }

        if (sumFact == startNumber) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
