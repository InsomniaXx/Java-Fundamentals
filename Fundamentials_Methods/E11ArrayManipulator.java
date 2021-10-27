package Fundamentals.Fundamentials_Methods;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        String input = scanner.nextLine();
        String finalArray = "";

        while (!input.equals("end")) {
            String command = input;

            if (command.contains("exchange")) {
                finalArray = getExchangedArray(command, array);
            }
            if (command.contains("max odd") || command.contains("max even")) {
                getMaxEvenOdd(command, array);
            }
            if (command.contains("min odd") || command.contains("min even")) {
                getMinEvenOdd(command, array);
            }
            if (command.contains("first") && (command.contains("even") || command.contains("odd"))) {
                getFirstEvenOdd(command, array);
            }
            if (command.contains("last") && (command.contains("even") || command.contains("odd"))) {
                getLastEvenOdd(command, array);
            }

            input = scanner.nextLine();
        }
        System.out.println(finalArray);
    }
    private static String getExchangedArray(String command, int[] array) {
        String stringToRemove = "exchange ";
        String getNumber = (command.replace(stringToRemove, ""));
        String finalArray = "";
        if (Integer.parseInt(getNumber) > array.length - 1) {
            System.out.println("Invalid index");
        }
        int countExchanges = Integer.parseInt(getNumber) + 1;

        for (int rotation = 1; rotation <= countExchanges; rotation++) {
            int firstElement = array[0];

            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];

            }
            array[array.length - 1] = firstElement;
        }
        String result = IntStream.of(array)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", "));

        finalArray = "[" + result + "]";

        return finalArray;
    }
    private static void getLastEvenOdd(String command, int[] array) {
        if (command.contains("even")) {

        } else if (command.contains("odd")) {

        }
    }

    private static void getFirstEvenOdd(String command, int[] array) {
        if (command.contains("even")) {

        } else if (command.contains("odd")) {

        }
    }

    private static void getMinEvenOdd(String command, int[] array) {
        int smallest = Integer.MAX_VALUE;
        int smallestIndex = 0;
        boolean hasSmallest = false;

        if (command.contains("even")) {
            for (int i = 0; i <= array.length - 1; i++) {
                if (i % 2 == 0) {
                    if (array[i] < smallest && array[i] <= smallest) {
                        smallest = array[i];
                        smallestIndex = i;
                        hasSmallest = true;
                    }
                }
            }

        } else if (command.contains("odd")) {
            for (int i = 0; i <= array.length - 1; i++) {
                if (i % 2 != 0) {
                    if (array[i] < smallest && array[i] <= smallest) {
                        smallest = array[i];
                        smallestIndex = i;
                        hasSmallest = true;
                    }
                }
            }
        }
        if (hasSmallest) {
            System.out.println(smallestIndex);
        } else {
            System.out.println("No matches");
        }
    }

    private static void getMaxEvenOdd(String command, int[] array) {
        int highest = Integer.MIN_VALUE;
        int highestIndex = 0;
        boolean hasHighest = false;

        if (command.contains("even")) {
            for (int i = 0; i <= array.length - 1; i++) {
                if (i % 2 == 0) {
                    if (array[i] > highest && array[i] >= highest) {
                        highest = array[i];
                        highestIndex = i;
                        hasHighest = true;
                    }
                }
            }

        } else if (command.contains("odd")) {
            for (int i = 0; i <= array.length - 1; i++) {
                if (i % 2 != 0) {
                    if (array[i] > highest && array[i] >= highest) {
                        highest = array[i];
                        highestIndex = i;
                        hasHighest = true;
                    }
                }
            }
        }
        if (hasHighest) {
            System.out.println(highestIndex);
        } else {
            System.out.println("No matches");
        }

    }
}
