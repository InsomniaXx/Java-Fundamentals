package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class L07TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;
        boolean isMissing = false;
        switch (dayType) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    price = 12;
                } else if (age > 18 && age <= 64) {
                    price = 18;
                } else if (age > 64 && age <= 122) {
                    price = 12;
                } else {
                    isMissing = true;
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    price = 15;
                } else if (age > 18 && age <= 64) {
                    price = 20;
                } else if (age > 64 && age <= 122) {
                    price = 15;
                } else {
                    isMissing = true;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    price = 5;
                } else if (age > 18 && age <= 64) {
                    price = 12;
                } else if (age > 64 && age <= 122) {
                    price = 10;
                } else {
                    isMissing = true;
                }
                break;
            default:
                isMissing = true;
                break;
        }

        if (isMissing) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", price);
        }
    }
}
