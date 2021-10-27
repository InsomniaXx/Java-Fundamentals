package Fundamentals.Fundamentials_DataTypes_Variables;

import java.util.Scanner;

public class E05PrintPartASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= secondNumber; i++) {
            char actualChar = (char) i;
            System.out.printf("%s ", actualChar);
        }
    }
}
