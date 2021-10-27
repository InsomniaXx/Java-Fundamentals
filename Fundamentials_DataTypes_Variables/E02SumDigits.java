package Fundamentals.Fundamentials_DataTypes_Variables;

import java.util.Scanner;

public class E02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (number > 0) {
            int currentDigit = number % 10;
            sum = sum + currentDigit;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
