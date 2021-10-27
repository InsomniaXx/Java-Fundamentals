package Fundamentals.Fundamentials_Lists;

import java.util.*;
import java.util.stream.Collectors;

public class L04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer :: parseInt)
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String nextInput = input;

            List<String> inputList = Arrays
                    .stream(nextInput.split(" "))
                    .collect(Collectors.toList());

            switch (inputList.get(0)) {
                case "Add":
                    addToList(numbersList, inputList);
                    break;
                case "Remove":
                    removeFromList(numbersList, inputList);
                    break;
                case "RemoveAt":
                    removeAtIndexFromList(numbersList, inputList);
                    break;
                case "Insert":
                    insertIndex(numbersList, inputList);
                    break;
                default:
                    break;
            }

            input = scanner.nextLine();
            inputList.clear();
        }
        for (Integer number : numbersList) {
            System.out.print(number + " ");
        }
    }

    private static void insertIndex(List<Integer> numbersList, List<String> inputList) {
        int index = Integer.parseInt(inputList.get(1));
        int itemToAdd = Integer.parseInt(inputList.get(2));
        numbersList.add(itemToAdd, index);
    }

    private static void removeAtIndexFromList(List<Integer> numbersList, List<String> inputList) {
        int index = Integer.parseInt(inputList.get(1));
        numbersList.remove(index);
    }

    private static void removeFromList(List<Integer> numbersList, List<String> inputList) {
        numbersList.remove(Integer.valueOf(inputList.get(1)));
    }

    private static void addToList(List<Integer> numbersList, List<String> inputList) {
        int element = Integer.parseInt(inputList.get(1));
        numbersList.add(element);
    }
}
