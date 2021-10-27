package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class E04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = Integer.parseInt(scanner.nextLine());
        int j = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int k = i; k <= j; k++) {
            System.out.printf("%d ", k);
            sum += k;
        }
        System.out.printf("%nSum: %d", sum);
    }
}
