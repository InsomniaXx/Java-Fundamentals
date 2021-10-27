package Fundamentals.Fundamentials_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listIntegers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String nextInput = input;

            List<String> listInput = Arrays
                    .stream(nextInput.split(" "))
                    .collect(Collectors.toList());

            String action = listInput.get(0);

            if (action.equals("Delete")) {
                deleteElementFromList(listInput, listIntegers);

            } else if (action.equals("Insert")) {
                insertElementToList(listInput, listIntegers);
            }
            input = scanner.nextLine();
        }
        for (Integer items : listIntegers) {
            System.out.print(items + " ");
        }
    }

    private static void insertElementToList(List<String> listInput, List<Integer> listIntegers) {
        listIntegers.add(Integer.parseInt(listInput.get(2)), Integer.parseInt(listInput.get(1)));
    }

    private static void deleteElementFromList(List<String> listInput, List<Integer> listIntegers) {
        for (int i = 0; i < listIntegers.size(); i++) {
            listIntegers.remove(Integer.valueOf(listInput.get(1)));
        }
    }
}
