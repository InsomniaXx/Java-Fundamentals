package Fundamentals.Fundamentials_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long firstNumber = Long.parseLong(scanner.nextLine());
        long secondNumber = Long.parseLong(scanner.nextLine());

        long firstFactorial = getFirstFactorial(firstNumber);
        long secondFactorial = getSecondFactorial(secondNumber);
        double result = 1.0 * firstFactorial / secondFactorial;

        System.out.printf("%.2f", result);
    }

    private static long getFirstFactorial(long firstNumber) {
        long firstFactorial = 1;

        for (long i = 1; i <= firstNumber; i++) {
            firstFactorial = firstFactorial * i;
        }
        return firstFactorial;
    }

    private static long getSecondFactorial(long secondNumber) {
        long secondFactorial = 1;

        for (long i = 1; i <= secondNumber; i++) {
            secondFactorial = secondFactorial * i;
        }
        return secondFactorial;
    }

    private static double getFactorialDivision(long firstFactorial, long secondFactorial) {
        return 1.0 * firstFactorial / secondFactorial;
    }
}
