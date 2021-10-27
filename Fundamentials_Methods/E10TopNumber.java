package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class E10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        getTopNumbers(number);
    }

    private static void getTopNumbers(String number) {
        for (int i = 1; i <= Integer.parseInt(number); i++) {
            String convertedNumber = String.valueOf(i);
            int countDigits = 0;
            int countOddDigits = 0;
            for (int j = 0; j < convertedNumber.length(); j++) {
                countDigits += convertedNumber.charAt(j);
                if (countDigits % 2 != 0) {
                    countOddDigits += 1;
                }
            }
            if (countDigits % 8 == 0 && countOddDigits != 0) {
                System.out.println(i);
            }
        }
    }
}
