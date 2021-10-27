package Fundamentals.Fundamentials_DataTypes_Variables;

import java.util.Scanner;

public class E11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double highestBall = Double.MIN_VALUE;

        int highestSnowballSnow = Integer.MIN_VALUE;
        int highestSnowballTime = Integer.MIN_VALUE;
        double highestSnowballValue = Double.MIN_VALUE;
        int highestSnowballQuality = Integer.MIN_VALUE;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (highestBall < snowballValue) {
                highestSnowballSnow = snowballSnow;
                highestSnowballTime = snowballTime;
                highestSnowballValue = snowballValue;
                highestSnowballQuality = snowballQuality;
                highestBall = snowballValue;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)", highestSnowballSnow, highestSnowballTime, highestSnowballValue, highestSnowballQuality);

    }
}
