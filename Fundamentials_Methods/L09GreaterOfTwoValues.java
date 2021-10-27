package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class L09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String firstValue = scanner.nextLine();
        String secondValue = scanner.nextLine();

        System.out.println(getMax(type, firstValue, secondValue));
    }

    private static String getMax(String type, String firstValue, String secondValue) {
        String result = "";
        switch (type) {
            case "int":
                int firstNum = Integer.parseInt(firstValue);
                int secondNum = Integer.parseInt(secondValue);

                if (firstNum > secondNum) {
                    result = String.valueOf(firstNum);
                } else {
                    result = String.valueOf(secondNum);
                }
                break;
            case "char":
                int firstCharValue = firstValue.charAt(0);
                int secondCharValue = secondValue.charAt(0);

                if (firstCharValue > secondCharValue) {
                    result = firstValue;
                } else {
                    result = secondValue;
                }
                break;
            case "string":
                if (firstValue.compareTo(secondValue) >= 0) {
                    result = firstValue;
                } else {
                    result = secondValue;
                }
            default:
                break;
        }
       return result;
    }
}
