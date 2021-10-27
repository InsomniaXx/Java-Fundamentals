package Fundamentals.Fundamentials_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> nextInput = Arrays
                    .stream(input.split(" "))
                    .collect(Collectors.toList());

            switch (nextInput.get(0)) {
                case "Contains":
                    containsElement(numbersList, nextInput);
                    break;
                case "Print":
                    if (nextInput.get(1).equals("even")) {
                        printEvenList(numbersList);
                    } else if (nextInput.get(1).equals("odd")) {
                        printOddList(numbersList);
                    }
                    break;
                case "Get":
                    if (nextInput.get(1).equals("sum")) {
                        getSum(numbersList);
                    }
                    break;
                case "Filter":
                    filteredList(numbersList, nextInput);
                    break;
            }
            input = scanner.nextLine();
        }
    }

    private static void filteredList(List<Integer> numbersList, List<String> nextInput) {
        List<Integer> printedList = new ArrayList<>();
        int number = Integer.parseInt(nextInput.get(2));
        for (int i = 0; i < numbersList.size(); i++) {
            if (nextInput.get(1).equals("<")) {
                if (numbersList.get(i) < number) {
                    printedList.add(numbersList.get(i));
                }
            } else if (nextInput.get(1).equals(">")) {
                if (numbersList.get(i) > number) {
                    printedList.add(numbersList.get(i));
                }
            } else if (nextInput.get(1).equals(">=")) {
                if (numbersList.get(i) >= number) {
                    printedList.add(numbersList.get(i));
                }

            } else if (nextInput.get(1).equals("<=")) {
                if (numbersList.get(i) <= number) {
                    printedList.add(numbersList.get(i));
                }
            }
        }
        for (Integer numbers : printedList) {
            System.out.print(numbers + " ");
        }
        System.out.println();
    }

    private static void getSum(List<Integer> numbersList) {
        int sum = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            sum += numbersList.get(i);
        }
        System.out.println(sum);
    }

    private static void printEvenList(List<Integer> numbersList) {
        List<Integer> printedList = new ArrayList<>();
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 == 0) {
                printedList.add(numbersList.get(i));
            }
        }
        for (int i = 0; i < printedList.size(); i++) {
            System.out.print(printedList.get(i) + " ");
        }
        System.out.println();
    }

    private static void printOddList(List<Integer> numbersList) {
        List<Integer> printedList = new ArrayList<>();
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 != 0) {
                printedList.add(numbersList.get(i));
            }
        }
        for (int i = 0; i < printedList.size(); i++) {
            System.out.print(printedList.get(i) + " ");
        }
        System.out.println();
    }

    private static void containsElement(List<Integer> numbersList, List<String> nextInput) {
        int number = Integer.parseInt(nextInput.get(1));
        boolean isFound = false;
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) == number) {
                isFound = true;
            }
        }
        if (isFound) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
}
