package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class E05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int additionSum = getAddition(firstNumber, secondNumber);

        System.out.println(getSubtracted(additionSum, thirdNumber));
    }

    private static int getAddition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int getSubtracted(int additionSum, int thirdNumber) {
        int result = 0;
        result = additionSum - thirdNumber;
        return result;
    }
}
