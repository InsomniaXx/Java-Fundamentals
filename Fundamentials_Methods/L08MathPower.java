package Fundamentals.Fundamentials_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double powerResult = getPowerNumber(firstNumber, secondNumber);
        System.out.println(new DecimalFormat("0.####").format(getPowerNumber(firstNumber, secondNumber)));
    }

    private static double getPowerNumber(double firstNumber, double secondNumber) {
        double result = 1;
        for (int i = 1; i <= secondNumber; i++) {
            result *= firstNumber;
        }
        return result;
    }
}
