package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class L04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (operation) {
            case "add":
                addition(firstNumber, secondNumber);
                break;
            case "multiply":
                multiplication(firstNumber, secondNumber);
                break;
            case "subtract":
                subtraction(firstNumber, secondNumber);
                break;
            case "divide":
                division(firstNumber, secondNumber);
                break;
            default:
                break;
        }
    }

    private static void addition(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }

    private static void multiplication(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    private static void subtraction(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    private static void division(int firstNumber, int secondNumber) {
        System.out.println( firstNumber / secondNumber);
    }
}
