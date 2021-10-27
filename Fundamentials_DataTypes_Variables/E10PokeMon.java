package Fundamentals.Fundamentials_DataTypes_Variables;

import java.util.Scanner;

public class E10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int countPokes = 0;
        int originalValue = pokePowerN;
        double percentPower = originalValue - originalValue * 0.5;

        while (pokePowerN >= distanceM) {
            countPokes++;
            pokePowerN -= distanceM;

            if (pokePowerN == percentPower) {
                pokePowerN = pokePowerN / exhaustionFactorY;
            }
        }

        System.out.println(pokePowerN);
        System.out.println(countPokes);

    }
}
