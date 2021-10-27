package Fundamentals.Fundamentials_DataTypes_Variables;

import java.util.Scanner;

public class E08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.NEGATIVE_INFINITY;
        String maxModel = "";

        for (int i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = 3.14 * radius * radius * height;
            if (volume > maxVolume) {
                maxVolume = volume;
                maxModel = model;
            }
        }
        System.out.println(maxModel);
    }
}
