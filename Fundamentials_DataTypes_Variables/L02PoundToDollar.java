package Fundamentals.Fundamentials_DataTypes_Variables;

import java.util.Scanner;

public class L02PoundToDollar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pound = Double.parseDouble(scanner.nextLine());
        double dollar = pound * 1.31;
        System.out.printf("%.3f", dollar);
    }
}
