package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class L12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());

        boolean isEven = false;

        if (i % 2 == 0) {
            isEven = true;
            System.out.printf("The number is: %d", Math.abs(i));
        }

        while (!isEven) {
            System.out.println("Please write an even number.");
            int newNumber = Integer.parseInt(scanner.nextLine());

            if (newNumber % 2 == 0) {
                isEven = true;
                System.out.printf("The number is: %d", Math.abs(newNumber));
            }
            newNumber = i;
        }

    }
}
