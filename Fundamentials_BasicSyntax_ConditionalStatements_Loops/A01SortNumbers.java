package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class A01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int max = Math.max(Math.max(firstNum, secondNum), thirdNum);
        int min = Math.min(Math.min(firstNum, secondNum), thirdNum);
        int mid = firstNum + secondNum + thirdNum - max - min;

        System.out.println(max);
        System.out.println(mid);
        System.out.println(min);
    }
}
