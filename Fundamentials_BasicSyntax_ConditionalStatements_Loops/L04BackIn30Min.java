package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class L04BackIn30Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());

        int hh;
        int ss = seconds + 30;

        if (ss > 60) {
            hh = hour + 1;
            ss = (seconds + 30) - 60;
        } else {
            hh = hour;
        }

        if (hh > 23) {
            hh = 0;
        }
        System.out.printf("%d:%02d",hh,ss);
    }
}
