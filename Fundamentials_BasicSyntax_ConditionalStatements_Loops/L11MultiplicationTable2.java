package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class L11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        if (times > 10) {
            System.out.printf("%d X %d = %d", i, times, i * times);
        } else {
            for (int j = times; j <= 10; j++) {
                System.out.printf("%d X %d = %d%n", i, j, i * j);
            }
        }
    }
}
