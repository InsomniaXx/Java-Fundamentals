package Fundamentals.Fundamentials_DataTypes_Variables;

import java.util.Scanner;

public class E07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tankCapacity = 255;
        int n = Integer.parseInt(scanner.nextLine());
        int sumLitres = 0;

        for (int i = 1; i <= n; i++) {
            int quantity = Integer.parseInt(scanner.nextLine());
            sumLitres += quantity;

            if (sumLitres > tankCapacity) {
                System.out.println("Insufficient capacity!");
                sumLitres -= quantity;
            }
        }
        System.out.println(sumLitres);
    }
}
