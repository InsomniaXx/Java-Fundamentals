package Fundamentals.Fundamentials_DataTypes_Variables;

import java.util.Scanner;

public class E01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int forthNumber = Integer.parseInt(scanner.nextLine());

        System.out.println (((firstNumber + secondNumber) /  thirdNumber) * forthNumber);
    }
}
