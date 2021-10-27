package Fundamentals.Fundamentials_TextProcessing;

import java.util.Scanner;

public class A03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] keySequence = scanner.nextLine().split(" ");
        String input = scanner.nextLine();

        int startIndexDestination = 0;
        int endIndexDestination = 0;
        int startIndexType = 0;
        int endIndexType = 0;

        while (!input.equals("find")) {
            String nextInput = input;
            StringBuilder textToUpdate = new StringBuilder(nextInput);
            int j = 0;

            for (int i = 0; i < textToUpdate.length(); i++) {
                int currentASCII = nextInput.charAt(i) - Integer.parseInt(keySequence[j]);
                char newChar = (char) currentASCII;

                textToUpdate.setCharAt(i, newChar);
                j++;
                if (keySequence.length == j) {
                    j = 0;
                }
            }

            startIndexDestination = textToUpdate.indexOf("<") + 1;
            endIndexDestination = textToUpdate.indexOf(">");

            startIndexType = textToUpdate.indexOf("&") + 1;
            endIndexType = textToUpdate.lastIndexOf("&");

            System.out.printf("Found %s at %s%n",
                    textToUpdate.toString().substring(startIndexType, endIndexType),
                    textToUpdate.toString().substring(startIndexDestination, endIndexDestination));

            input = scanner.nextLine();
        }
    }
}
