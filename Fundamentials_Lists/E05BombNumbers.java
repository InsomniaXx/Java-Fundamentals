package Fundamentals.Fundamentials_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> bombAndPower = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int specialNumber = bombAndPower.get(0);
        int power = bombAndPower.get(1);
        int sum = 0;

        for (int i = 1; i <= power; i++) {
            for (int j = 0; j < listNumbers.size(); j++) {
                if (specialNumber == listNumbers.get(j)) {
                    if (j - 1 >= 0) {
                        listNumbers.remove(j - 1);
                    }
                }
            }
            for (int j = 0; j < listNumbers.size(); j++) {
                if (specialNumber == listNumbers.get(j)) {
                    if (j + 1 < listNumbers.size()) {
                        listNumbers.remove(j + 1);
                    }
                }
            }
        }

        for (int i = 0; i < listNumbers.size(); i++) {
            if (specialNumber == listNumbers.get(i)) {
                sum -= specialNumber;
            }
            sum += listNumbers.get(i);
        }

        System.out.println(sum);
    }
}
