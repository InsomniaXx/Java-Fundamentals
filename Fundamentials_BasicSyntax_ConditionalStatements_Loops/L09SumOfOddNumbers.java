package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class L09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int j = 1;
        int count = 0;

        while (count < n) {
            if (j % 2 != 0) {
                System.out.println(j);
                sum += j;
                count++;
            }
            j++;
        }
        System.out.printf("Sum: %d", sum);
    }
}
