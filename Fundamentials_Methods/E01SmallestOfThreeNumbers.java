package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class E01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallestNumber(firstNumber, secondNumber, thirdNumber));
    }

    public static int getSmallestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int smallestNumber = Integer.MAX_VALUE;

        if (firstNumber < smallestNumber) {
            smallestNumber = firstNumber;
        }

        if (secondNumber < smallestNumber) {
            smallestNumber = secondNumber;
        }

        if (thirdNumber < smallestNumber) {
            smallestNumber = thirdNumber;
        }
        return smallestNumber;
    }
}
