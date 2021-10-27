package Fundamentals.Fundamentials_MidExams.First;

import java.util.*;
import java.util.stream.Collectors;

public class ExamProblem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputDeck = Arrays
                .stream(scanner.nextLine().split(":"))
                .collect(Collectors.toList());

        String operation = "";
        String command = scanner.nextLine();

        List<String> finalDeck = new ArrayList<>();

        while (!command.equals("Ready")) {
            String nextCommand = command;
            String[] commands = command.split(" ");
            operation = commands[0];

            switch (operation) {
                case "Add":
                    if (inputDeck.contains(commands[1])) {
                        finalDeck.add(commands[1]);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Insert":
                    if (Integer.parseInt(commands[2]) >= 0 && Integer.parseInt(commands[2]) < finalDeck.size()) {
                        if (inputDeck.contains(commands[1])) {
                            finalDeck.add(Integer.parseInt(commands[2]), commands[1]);
                        } else {
                            System.out.println("Error!");
                        }
                    } else {
                        System.out.println("Error!");
                    }
                    break;
                case "Remove":
                    if (finalDeck.contains(commands[1])) {
                        finalDeck.remove(commands[1]);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                case "Swap":
                    Collections.swap(finalDeck, finalDeck.indexOf(commands[1]), finalDeck.indexOf(commands[2]));
                    break;
                case "Shuffle":
                    if (commands[1].equals("deck")) {
                        Collections.reverse(finalDeck);
                    }
                    break;
                default:
                    break;
            }

            command = scanner.nextLine();
        }
        for (int i = 0; i < finalDeck.size(); i++) {
            System.out.printf("%s ", finalDeck.get(i));
        }
    }
}
