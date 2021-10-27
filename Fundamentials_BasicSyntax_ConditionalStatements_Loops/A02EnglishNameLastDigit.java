package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class A02EnglishNameLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int index = input % 10;
        String name = "";
        switch (index) {
            case 0:
                name = "zero";
                break;
            case 1:
                name = "one";
                break;
            case 2:
                name = "two";
                break;
            case 3:
                name = "three";
                break;
            case 4:
                name = "four";
                break;
            case 5:
                name = "five";
                break;
            case 6:
                name = "six";
                break;
            case 7:
                name = "seven";
                break;
            case 8:
                name = "eight";
                break;
            case 9:
                name = "nine";
                break;
            default:
                break;
        }

        System.out.println(name);
    }
}
