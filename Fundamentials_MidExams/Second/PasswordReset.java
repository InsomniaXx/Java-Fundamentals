package Fundamentals.Fundamentials_MidExams.Second;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder startText = new StringBuilder(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] nextCommand = command.split("\\s+");

            switch (nextCommand[0]) {
                case "TakeOdd":
                    takeOddUpdate(startText);
                    break;
                case "Cut":
                    int index = Integer.parseInt(nextCommand[1]);
                    int length = Integer.parseInt(nextCommand[2]);
                    cutText(startText, index, length);
                    break;
                case "Substitute":
                    String oldString = nextCommand[1];
                    String newString = nextCommand[2];
                    substituteText(startText, oldString, newString);
                    break;

            }
            command = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", startText);
    }

    private static void substituteText(StringBuilder startText, String oldString, String newString) {
        if (startText.toString().contains(oldString)) {
            String updatedText = startText.toString().replace(oldString, newString);
            startText.setLength(0);
            startText.append(updatedText);
            System.out.println(startText);
        } else {
            System.out.println("Nothing to replace!");
        }
    }

    private static void cutText(StringBuilder startText, int index, int length) {
        for (int i = 1; i <= length; i++) {
            startText.deleteCharAt(index);
        }
        System.out.println(startText);
    }

    private static void takeOddUpdate(StringBuilder startText) {
        StringBuilder updatedBuilder = new StringBuilder();
        for (int i = 0; i < startText.length(); i++) {
            if (i % 2 != 0) {
                updatedBuilder.append(startText.charAt(i));
            }
        }
        startText.setLength(0);
        startText.append(updatedBuilder);
        System.out.println(startText);
    }


}
