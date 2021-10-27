package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class L05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        totalPrice(product, quantity);
    }

    private static void totalPrice(String product, int quantity) {
        double price = 0.0;
        switch (product) {
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
            default:
                break;
        }
        System.out.printf("%.2f", quantity * price);
    }
}
