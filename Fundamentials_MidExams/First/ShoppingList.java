package Fundamentals.Fundamentials_MidExams.First;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialList = Arrays
                .stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String command = input;
            String[] commandItems = command.split(" ");

            switch (commandItems[0]) {
                case "Urgent":
                    if (!initialList.contains(commandItems[1])) {
                        initialList.add(0, commandItems[1]);
                    }
                    break;
                case "Unnecessary":
                    if (initialList.contains(commandItems[1])) {
                        initialList.remove(commandItems[1]);
                    }
                    break;
                case "Correct":
                    for (int i = 0; i < initialList.size(); i++) {
                        if (initialList.get(i).equals(commandItems[1])) {
                            initialList.remove(i);
                            initialList.add(i, commandItems[2]);
                        }
                    }
                    break;
                case "Rearrange":
                    for (int i = 0; i < initialList.size(); i++) {
                        if (initialList.get(i).equals(commandItems[1])) {
                            initialList.remove(i);
                            initialList.add(initialList.size(), commandItems[1]);
                        }
                    }
                    break;
                default:
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.println(initialList.toString().replace("[", "")
                .replace("]", "")
                .trim()
                .replaceAll("\\s+", " "));
    }
}
