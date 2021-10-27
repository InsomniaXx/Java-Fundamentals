package Fundamentals.Fundamentials_DataTypes_Variables;

import java.util.Scanner;

public class L08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.next().charAt(0);
        int codeASCII = letter;

        if (codeASCII >= 97 && codeASCII <= 122) {
            //lowercase
            System.out.printf("lower-case");
        } else if (codeASCII >= 65 && codeASCII <= 90) {
            //uppercase
            System.out.printf("upper-case");
        }

    }
}
