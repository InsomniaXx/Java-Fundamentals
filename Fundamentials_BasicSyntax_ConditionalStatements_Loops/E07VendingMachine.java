package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class E07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputCoins = Double.parseDouble(scanner.nextLine());
        double sumCoins = inputCoins;
        double price = 0;
        String input = scanner.nextLine();

        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);

            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1 && coin != 2) {
                System.out.printf("Cannot accept %.2f%n", coin);
            } else {
                sumCoins += coin;
            }

            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            String product = input;

            if (product.equals("Nuts")) {
                price = 2;
                if (sumCoins >= price) {
                    System.out.println("Purchased Nuts");
                    sumCoins -= price;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Water")) {
                price = 0.7;
                if (sumCoins >= price) {
                    System.out.println("Purchased Water");
                    sumCoins -= price;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Crisps")) {
                price = 1.5;
                if (sumCoins >= price) {
                    System.out.println("Purchased Crisps");
                    sumCoins -= price;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Soda")) {
                price = 0.8;
                if (sumCoins >= price) {
                    System.out.println("Purchased Soda");
                    sumCoins -= price;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else if (product.equals("Coke")) {
                price = 1;
                if (sumCoins >= price) {
                    System.out.println("Purchased Coke");
                    sumCoins -= price;
                } else {
                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }
           input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sumCoins);
    }
}

