package Fundamentals.Fundamentials_TextProcessing;

import java.util.Scanner;


public class E07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        char explodeSign = '>';
        int count = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == explodeSign) {
                count += Character.getNumericValue(sb.charAt(i + 1));
            }
            if (sb.charAt(i) != explodeSign && count > 0) {
                sb.deleteCharAt(i);
                i--;
                count--;
            }
        }
        System.out.println(sb);
    }
}
