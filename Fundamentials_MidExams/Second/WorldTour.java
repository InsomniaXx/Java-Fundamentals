package Fundamentals.Fundamentials_MidExams.Second;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String initialText = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Travel")) {
            String[] nextCommand = command.split(":");
            String action = nextCommand[0];

            switch (action) {
                case "Add Stop":
                    int index = Integer.parseInt(nextCommand[1]);
                    String newString = nextCommand[2];
                    initialText = addString(initialText, index, newString);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(nextCommand[1]);
                    int endIndex = Integer.parseInt(nextCommand[2]);
                    initialText = removeString(initialText, startIndex, endIndex);
                    break;
                case "Switch":
                    String oldString = nextCommand[1];
                    String nextString = nextCommand[2];
                    initialText = switchString(initialText, oldString, nextString);
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", initialText);
    }

    private static String switchString(String initialText, String oldString, String nextString) {
        if (initialText.contains(oldString)) {
            initialText = initialText.replace(oldString, nextString);
        }
        System.out.println(initialText);
        return initialText;
    }

    private static String removeString(String initialText, int startIndex, int endIndex) {
        if ((startIndex >= 0 && startIndex < initialText.length()) && (endIndex >= 0 && endIndex < initialText.length())) {
            StringBuilder builder = new StringBuilder(initialText);
            builder.delete(startIndex, endIndex + 1);
            initialText = builder.toString();
        }
        System.out.println(initialText);
        return initialText;
    }

    private static String addString(String initialText, int index, String newString) {
        if (index >= 0 && index < initialText.length()) {
            StringBuilder builder = new StringBuilder(initialText);
            builder.insert(index, newString);
            initialText = builder.toString();
        }
        System.out.println(initialText);
        return initialText;
    }
}
