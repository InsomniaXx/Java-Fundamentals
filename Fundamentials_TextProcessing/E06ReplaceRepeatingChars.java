package Fundamentals.Fundamentials_TextProcessing;

import java.util.Scanner;

public class E06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        int length = sb.length();

        for (int i = 0; i < length - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb.deleteCharAt(i + 1);
                length--;
                i--;
            }
        }
        System.out.println(sb);
    }
}
