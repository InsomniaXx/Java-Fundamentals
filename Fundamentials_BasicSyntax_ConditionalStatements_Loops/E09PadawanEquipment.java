package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class E09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyGeorge = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double costLightsabers = Math.ceil(countStudents + countStudents * 0.10) * priceLightsabers;
        double costRobes = countStudents * priceRobes;
        double costBelts = (countStudents - countStudents / 6) *priceBelts;

        double finalCost = costLightsabers + costRobes + costBelts;

        if (finalCost <= moneyGeorge) {
            System.out.printf("The money is enough - it would cost %.2flv.", finalCost);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(finalCost - moneyGeorge));
        }
    }
}
