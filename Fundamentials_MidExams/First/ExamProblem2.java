package Fundamentals.Fundamentials_MidExams.First;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamProblem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays
                .stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        String operation = "";

        while (!command.equals("Done")) {
            String nextCommand = command;

            String[] commands = command.split("[\\s-]+");

            operation = commands[0];

            switch (operation) {
                case "Add":
                    if (Integer.parseInt(commands[2]) >= 0 && Integer.parseInt(commands[2]) < inputList.size()) {
                        inputList.add(Integer.parseInt(commands[2]), commands[1]);
                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(commands[1]) >= 0 && Integer.parseInt(commands[1]) < inputList.size()) {
                        inputList.remove(Integer.parseInt(commands[1]));
                    }
                    break;
                case "Check":
                    if (commands[1].equals("Even")) {
                        for (int i = 0; i < inputList.size(); i++) {
                            if (i % 2 == 0) {
                                System.out.printf("%s ",inputList.get(i));
                            }
                        }
                    } else if (commands[1].equals("Odd")) {
                        for (int i = 0; i < inputList.size(); i++) {
                            if (i % 2 != 0) {
                                System.out.printf("%s ",inputList.get(i));
                            }
                        }
                    }
                    System.out.println();
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("You crafted ");
        for (int i = 0; i < inputList.size(); i++) {
            System.out.printf("%s", inputList.get(i));
        }
        System.out.printf("!");
    }
}
