package Fundamentals.Fundamentials_Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNum = Double.parseDouble(scanner.nextLine());

        double result = calculate(firstNum, operator, secondNum);
        System.out.println(new DecimalFormat("0.##").format(result));
    }

    private static double calculate(double firstNum, String operator, double secondNum) {
        double result = 0.0;

        switch (operator) {
            case "/":
                result = firstNum / secondNum;
                break;
            case  "*":
                result = firstNum * secondNum;
                break;
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            default:
                break;
        }
        return result;
    }
}
