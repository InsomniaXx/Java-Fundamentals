package Fundamentals.Fundamentials_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String nextInput = input;
            List<String> inputList = Arrays
                    .stream(nextInput.split(" "))
                    .collect(Collectors.toList());

            switch (inputList.get(0)) {
                case "Add":
                    addElement(Integer.parseInt(inputList.get(1)), listNumbers);
                    break;
                case "Insert":
                    insertElement(Integer.parseInt(inputList.get(1)), Integer.parseInt(inputList.get(2)), listNumbers);
                    break;
                case "Remove":
                    removeElement(Integer.parseInt(inputList.get(1)), listNumbers);
                    break;
                case "Shift":
                    if (inputList.get(1).contains("left")) {
                        shiftLeft(Integer.parseInt(inputList.get(2)), listNumbers);
                    } else if (inputList.get(1).contains("right")) {
                        shiftRight(Integer.parseInt(inputList.get(2)), listNumbers);
                    }
                    break;
                default:
                    break;
            }
            input = scanner.nextLine();
        }
        for (Integer elements : listNumbers) {
            System.out.print(elements + " ");
        }
    }

    private static void shiftRight(int number, List<Integer> listNumbers) {
        for (int i = 0; i < number; i++) {
            int lastElement = listNumbers.get(listNumbers.size() - 1);
            listNumbers.add(0, lastElement);
            listNumbers.remove(listNumbers.size() - 1);
        }
    }

    private static void shiftLeft(int number, List<Integer> listNumbers) {
        for (int i = 0; i < number; i++) {
            int firstNumber = listNumbers.get(0);
            listNumbers.add(firstNumber);
            listNumbers.remove(0);
        }
    }

    private static void removeElement(int number, List<Integer> listNumbers) {
        if (number > listNumbers.size() || number < 0) {
            System.out.println("Invalid index");
        } else {
            listNumbers.remove(number);
        }
    }

    private static void insertElement(int number, int index, List<Integer> listNumbers) {
        if (index > listNumbers.size() || index < 0) {
            System.out.println("Invalid index");
        } else {
            listNumbers.add(index, number);
        }
    }

    private static void addElement(int number, List<Integer> listNumbers) {
        listNumbers.add(number);
    }

}
