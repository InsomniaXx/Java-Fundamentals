package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class E02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = Integer.parseInt(scanner.nextLine());

        if (i % 10 == 0) {
            System.out.println("The number is divisible by 10");
        } else if (i % 7 == 0) {
            System.out.println("The number is divisible by 7");
        } else if (i % 6 == 0) {
            System.out.println("The number is divisible by 6");
        } else if (i % 3 == 0) {
            System.out.println("The number is divisible by 3");
        } else if (i % 2 == 0) {
            System.out.println("The number is divisible by 2");
        } else {
            System.out.println("Not divisible");
        }
    }
}
