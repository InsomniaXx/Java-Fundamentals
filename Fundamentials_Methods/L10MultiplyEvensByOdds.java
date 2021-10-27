package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class L10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multipliedAnswer = getMultipliedSum(Math.abs(number));
        System.out.println(multipliedAnswer);
    }

    private static int getMultipliedSum(int number) {
        int evenSum = getSumOfEvenDigits(number);
        int oddSum = getSumOfOddDigits(number);
        return evenSum * oddSum;
    }

    private static int getSumOfEvenDigits(int number) {
        int evenSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            number = number / 10;
        }
        return evenSum;
    }

    private static int getSumOfOddDigits(int number) {
        int oddSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                oddSum += digit;
            }
            number = number / 10;
        }
        return oddSum;
    }
}
