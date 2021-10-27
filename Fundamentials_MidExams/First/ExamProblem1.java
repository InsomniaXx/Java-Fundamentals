package Fundamentals.Fundamentials_MidExams.First;

import java.util.Scanner;

public class ExamProblem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double coffePrice = 0;
        double totalPrice = 0;

        for (int i = 1; i <= n; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            coffePrice = (days * capsulesCount) * price;
            System.out.printf("The price for the coffee is: $%.2f%n", coffePrice);
            totalPrice += coffePrice;
        }

        System.out.printf("Total: $%.2f", totalPrice);
    }
}
