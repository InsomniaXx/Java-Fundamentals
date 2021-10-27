package Fundamentals.Fundamentials_MidExams.Second;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String startText = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            String[] nextCommand = command.split("\\s*\\|");
            String action = nextCommand[0];

            switch (action) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(nextCommand[1]);
                    startText = moveText(startText, numberOfLetters);
                    break;
                case "Insert":
                    int index = Integer.parseInt(nextCommand[1]);
                    String addString = nextCommand[2];
                    startText = insertString(startText, index, addString);
                    break;
                case "ChangeAll":
                    String oldString = nextCommand[1];
                    String newString = nextCommand[2];
                    startText = changeAll(startText, oldString, newString);
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", startText);
    }

    private static String changeAll(String startText, String oldString, String newString) {
        if (startText.contains(oldString)) {
            startText = startText.replace(oldString, newString);
        }
        return startText;
    }

    private static String insertString(String startText, int index, String addString) {
        if (index >= 0 && index <= startText.length()) {
            StringBuilder builder = new StringBuilder(startText);
            builder.insert(index, addString);
            startText = builder.toString();
        }
        return startText;
    }

    private static String moveText(String startText, int numberOfLetters) {
        if (numberOfLetters > startText.length()) {
            numberOfLetters = startText.length();
        }
        String newString = startText.substring(0, numberOfLetters);
        StringBuilder builder = new StringBuilder(startText);

        builder.delete(0, numberOfLetters);
        builder.append(newString);
        startText = builder.toString();


        return startText;
    }
}
