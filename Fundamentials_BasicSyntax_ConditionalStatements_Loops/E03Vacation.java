package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayType = scanner.nextLine();
        double price = 0;
        double totalPrice = 0;

        switch (groupType) {
            case "Students":
                switch (dayType) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                    default:
                        break;
                }
                totalPrice = count * price;
                if (count >= 30) {
                    totalPrice -= totalPrice * 0.15;
                }
                break;
            case "Business":
                switch (dayType) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                    default:
                        break;
                }
                totalPrice = count * price;
                if (count >= 100) {
                    totalPrice -= 10 * price;
                }
                break;
            case "Regular":
                switch (dayType) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                    default:
                        break;
                }
                totalPrice = count * price;
                if (count >= 10 && count <= 20) {
                    totalPrice -= totalPrice * 0.05;
                }
                break;
            default:
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
