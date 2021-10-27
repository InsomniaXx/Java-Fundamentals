package Fundamentals.Fundamentials_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class L07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - 1; j++) {
                inputArray[j] = inputArray[j] + inputArray[j + 1];
            }
        }
        System.out.println(inputArray[0]);
    }
}
