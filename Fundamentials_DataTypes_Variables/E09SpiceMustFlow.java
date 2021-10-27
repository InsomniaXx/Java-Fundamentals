package Fundamentals.Fundamentials_DataTypes_Variables;

import java.util.Scanner;

public class E09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int countDays = 0;
        int countSpice = 0;
        int workersConsume = 26;

        while (startingYield >= 100) {
            countDays++;
            countSpice += startingYield - workersConsume;
            startingYield -= 10;
        }
        System.out.println(countDays);
        if (countSpice >= 26) {
            System.out.println(countSpice - workersConsume);
        } else {
            System.out.println(countSpice);
        }
    }
}
