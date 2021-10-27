package Fundamentals.Fundamentials_MidExams.First;

import java.util.*;
import java.util.stream.Collectors;


public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();

        List<Character> inputChars = inputString.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());

        String nextInput = scanner.nextLine();
        String compareString = "";

        while (!nextInput.equals("Generate")) {
            String command = nextInput;
            String[] commandList = command.split(">>>");
            String subString = commandList[1];

            int startIndex = 0;
            int endIndex = 0;

            if (commandList[0].equals("Slice")) {
                startIndex = Integer.parseInt(commandList[1]);
                endIndex = Integer.parseInt(commandList[2]);
            } else if (commandList[0].equals("Flip")) {
                startIndex = Integer.parseInt(commandList[2]);
                endIndex = Integer.parseInt(commandList[3]);
            }

            switch (commandList[0]) {
                case "Contains":
                    for (Character characters : inputChars) {
                        compareString += characters;
                    }
                    if (compareString.contains(subString)) {
                        System.out.printf("%s contains %s.%n", compareString, subString);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    for (int i = startIndex; i < endIndex; i++) {
                        char currentChar = inputChars.get(i);
                        if (commandList[1].equals("Upper")) {
                            inputChars.set(i, Character.toUpperCase(currentChar));
                        } else if (commandList[1].equals("Lower")) {
                            inputChars.set(i, Character.toLowerCase(currentChar));
                        }
                    }
                    printFlipSlice(inputChars);

                    break;
                case "Slice":
                    for (int i = startIndex; i < endIndex; endIndex--) {
                        inputChars.remove(i);
                    }
                    printFlipSlice(inputChars);
                    break;
                default:
                    break;
            }

            nextInput = scanner.nextLine();
        }
        System.out.print("Your activation key is: ");
        printFlipSlice(inputChars);
    }

    private static void printFlipSlice(List<Character> inputChars) {
        for (int i = 0; i < inputChars.size(); i++) {
            System.out.printf("%s", inputChars.get(i));
        }
        System.out.println();
    }
}
