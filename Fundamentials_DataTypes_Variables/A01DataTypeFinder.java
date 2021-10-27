package Fundamentals.Fundamentials_DataTypes_Variables;

import java.util.Scanner;

public class A01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isInteger = true;
        boolean isDecimal = false;

        while (!input.equals("End")) {
            if (input.equals("true") || input.equals("false")) {
                System.out.printf("%s is boolean type%n", input);
            } else if (input.charAt(0) < 48 || input.charAt(0) > 58) {
                if (input.length() == 1) {
                    System.out.printf("%s is char type%n", input);
                } else {
                    System.out.printf("%s is string type%n", input);
                }
            }
            for (int i = 0; i < input.length(); i++) {
                if (input.length() == 1) {
                    if ((int) input.charAt(i) > 48 && (int) input.charAt(i) < 57) {
                        isInteger = true;

                    } else {
                        isInteger = false;
                    }

                    if ((int) input.charAt(i) > 48 && (int) input.charAt(i) < 57 || (int) input.charAt(i) == 46) {
                        isDecimal = true;

                    } else {
                        isDecimal = false;
                    }
                } else {

                        if ((int) input.charAt(i) > 48 || (int) input.charAt(i) < 57 || (int) input.charAt(i) == 45) {
                            isInteger = true;

                        } else {
                            isInteger = false;
                        }

                        if ((int) input.charAt(i) > 48 || (int) input.charAt(i) < 57 || (int) input.charAt(i) == 46) {
                            isDecimal = true;

                        } else {
                            isDecimal = false;
                        }

                }
            }
            if (isInteger) {
                System.out.printf("%s is integer type%n", input);
            }
            if (isDecimal) {
                System.out.printf("%s is double type%n", input);
            }
            input = scanner.nextLine();
        }

    }

}

