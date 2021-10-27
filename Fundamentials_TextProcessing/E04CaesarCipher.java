package Fundamentals.Fundamentials_TextProcessing;

import java.util.Scanner;

public class E04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < sb.length(); i++) {
            int newCharCode =  sb.charAt(i) + 3;
            sb.setCharAt(i, (char) newCharCode);
        }
        System.out.println(sb);
    }
}
