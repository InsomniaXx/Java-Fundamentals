package Fundamentals.FinalExam;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String nextInput = scanner.nextLine();

        while (!nextInput.equals("End")) {
            String command = nextInput;
            String[] nextCommand = command.split(" ");
            String action = nextCommand[0];

            switch (action) {
                case "Translate":
                    String oldText = nextCommand[1];
                    String newText = nextCommand[2];
                    text = translate(text, oldText, newText);
                    System.out.println(text);
                    break;
                case "Includes":
                    String subString = nextCommand[1];
                    includeString(text, subString);
                    break;
                case "Start":
                    String startString = nextCommand[1];
                    start(text, startString);
                    break;
                case "Lowercase":
                    text = lowercase(text);
                    System.out.println(text);
                    break;
                case "FindIndex":
                    String charToSearch = nextCommand[1];
                    findIndex(text, charToSearch);
                    break;
                case "Remove":
                    int startIndex = Integer.parseInt(nextCommand[1]);
                    int count = Integer.parseInt(nextCommand[2]);
                    text = remove(text, startIndex, count);
                    System.out.println(text);
                    break;
                default:
                    break;
            }
            nextInput = scanner.nextLine();
        }
    }

    private static String remove(String text, int startIndex, int count) {
        StringBuilder builder = new StringBuilder(text);
        builder.delete(startIndex, startIndex + count);

        return builder.toString();
    }

    private static void findIndex(String text, String charToSearch) {
        int currentIndex = 0;
        if (text.contains(charToSearch)) {
            currentIndex = text.lastIndexOf(charToSearch);
        } else {
            currentIndex = -1;
        }
        System.out.println(currentIndex);
    }

    private static String lowercase(String text) {
        text = text.toLowerCase();
        return text;
    }

    private static void start(String text, String startString) {
        if (text.startsWith(startString)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static void includeString(String text, String subString) {
        if (text.contains(subString)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static String translate(String text, String oldText, String newText) {
        text = text.replace(oldText, newText);
        return text;
    }
}
