package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class E02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int vowelsCount = getVowelsCount(input);
        System.out.println(vowelsCount);
    }

    public static int getVowelsCount(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 65 ||
                    input.charAt(i) == 97 ||
                    input.charAt(i) == 69 ||
                    input.charAt(i) == 101 ||
                    input.charAt(i) == 73 ||
                    input.charAt(i) == 105 ||
                    input.charAt(i) == 79 ||
                    input.charAt(i) == 111 ||
                    input.charAt(i) == 85 ||
                    input.charAt(i) == 117 ||
                    input.charAt(i) == 89 ||
                    input.charAt(i) == 121) {
                count++;
            }
        }
        return count;
    }
}
