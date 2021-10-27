package Fundamentals.Fundamentials_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listWagons = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String nextInput = input;

            if (nextInput.contains("Add")) {
                List<String> addList = Arrays.stream(nextInput.split(" "))
                        .collect(Collectors.toList());

                addWagons(listWagons, addList.get(1));
            } else {
                addPassengers(listWagons, Integer.parseInt(nextInput), maxCapacity);
            }
            input = scanner.nextLine();
        }
        for (int wagon: listWagons) {
            System.out.print(wagon + " ");
        }
    }

    private static void addWagons(List<Integer> outputList, String numberToAdd) {
        outputList.add(Integer.parseInt(numberToAdd));
    }

    private static void addPassengers(List<Integer> outputList, int nextInput, int capacity) {
        for (int i = 0; i < outputList.size(); i++) {
            int currentElement = outputList.get(i);
            int sum = currentElement + nextInput;
            int diff = Math.abs(currentElement - nextInput);
            if (sum <= capacity) {
                outputList.set(i, sum);
                break;
            }
        }
    }
}
