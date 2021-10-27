package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class E10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gameLoses = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double micePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadsets = gameLoses / 2;
        int countMice = gameLoses / 3;
        int countKeyboard = gameLoses / 6;
        int countDisplay = countKeyboard / 2;

        double totalRage = headsetPrice * countHeadsets +
                micePrice * countMice +
                keyboardPrice * countKeyboard +
                displayPrice * countDisplay;
        System.out.printf("Rage expenses: %.2f lv.", totalRage);
    }
}
