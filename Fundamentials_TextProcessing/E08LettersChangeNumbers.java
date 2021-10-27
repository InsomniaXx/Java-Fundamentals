package Fundamentals.Fundamentials_TextProcessing;

import java.math.BigDecimal;
import java.util.Scanner;

public class E08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double sum = 0.0;
        BigDecimal output = new BigDecimal(String.valueOf(sum));
        for (int i = 0; i < input.length; i++) {
            String text = input[i];
            StringBuilder number = new StringBuilder();
            StringBuilder letters = new StringBuilder();

            int letterPosition = 0;

            for (int j = 0; j < text.length(); j++) {
                if (Character.isDigit(text.charAt(j))) {
                    number.append(text.charAt(j));
                } else if (Character.isLetter(text.charAt(j))) {
                    letters.append(text.charAt(j));
                }
            }
            if (Character.isUpperCase(letters.charAt(0))) {
                letterPosition = letters.charAt(0) - 64;
                sum += Double.parseDouble(number.toString()) / letterPosition;

            } else if (Character.isLowerCase(letters.charAt(0))) {
                letterPosition = letters.charAt(0) - 96;
                sum += letterPosition * Integer.parseInt(number.toString());
            }

            if (Character.isUpperCase(letters.charAt(1))) {
                letterPosition = letters.charAt(1) - 64;
                sum -= letterPosition;

            } else if (Character.isLowerCase(letters.charAt(1))) {
                letterPosition = letters.charAt(1) - 96;
                sum += letterPosition;
            }
            output = output.add(BigDecimal.valueOf(sum));
        }

        //System.out.printf("%.2f", output);
        System.out.println(output);
    }
}
