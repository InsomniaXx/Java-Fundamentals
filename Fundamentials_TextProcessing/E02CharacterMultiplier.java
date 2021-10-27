package Fundamentals.Fundamentials_TextProcessing;

import java.util.Map;
import java.util.Scanner;

public class E02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s");
        String firstString = input[0];
        String secondString = input[1];

        int minLengthIndex = Integer.min(firstString.length(), secondString.length());
        int maxLengthIndex = Integer.max(firstString.length(), secondString.length());
        int multiplierSum = 0;

        for (int i = 0; i < minLengthIndex; i++) {
            multiplierSum += firstString.charAt(i) * secondString.charAt(i);
        }

        if (firstString.length() != secondString.length()) {
            getRestSum(minLengthIndex, maxLengthIndex, firstString, secondString);
            multiplierSum += getRestSum(minLengthIndex, maxLengthIndex, firstString, secondString);
        }
        System.out.println(multiplierSum);
    }

    private static int getRestSum(int minLengthIndex, int maxLengthIndex, String firstString, String secondString) {
        int restSum = 0;
        for (int i = minLengthIndex; i < maxLengthIndex; i++) {
            if (firstString.length() > secondString.length()) {
                restSum += firstString.charAt(i);
            } else if (firstString.length() < secondString.length()) {
                restSum += secondString.charAt(i);
            }
        }
        return restSum;
    }
}
