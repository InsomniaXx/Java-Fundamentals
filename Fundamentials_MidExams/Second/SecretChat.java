package Fundamentals.Fundamentials_MidExams.Second;

import java.io.CharArrayReader;
import java.lang.reflect.Array;
import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String instruction = scanner.nextLine();

        while (!instruction.equals("Reveal")) {
            //instruction = instruction.replaceAll(":\\|:", " ");
            String[] currentInstruction = instruction.split(":\\|:");
            switch (currentInstruction[0]) {
                case "ChangeAll":
                    String oldLetter = currentInstruction[1];
                    String newLetter = currentInstruction[2];
                    if (message.contains(oldLetter)) {
                        message = changeText(message, oldLetter, newLetter);
                        System.out.println(message);
                    }
                    break;
                case "Reverse":
                    String stringReverse = currentInstruction[1];
                    if (message.contains(stringReverse)) {
                        message = reverseText(message, stringReverse);
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "InsertSpace":
                    int charIndex = Integer.parseInt(currentInstruction[1]);
                    message = insertSpace(message, charIndex);
                    System.out.println(message);
                    break;
                default:
                    break;
            }
            instruction = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s%n", message);
    }

    private static String insertSpace(String message, int charIndex) {
        StringBuilder sb = new StringBuilder(message);
        sb.insert(charIndex, " ");
        message = sb.toString();
        return message;
    }

    private static String reverseText(String message, String stringReverse) {
        int startIndex = message.indexOf(stringReverse);
        int endIndex = startIndex + stringReverse.length();

        StringBuilder messageBuilder = new StringBuilder(message);
        messageBuilder.delete(startIndex, endIndex);

        StringBuilder updatedWord = new StringBuilder(stringReverse);
        updatedWord.reverse();

        messageBuilder.append(updatedWord);
        message = messageBuilder.toString();

        return message;
    }

    private static String changeText(String message, String oldLetter, String newLetter) {
        message = message.replace(oldLetter, newLetter);
        return message;
    }
}
