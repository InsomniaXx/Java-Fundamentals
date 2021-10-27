package Fundamentals.Fundamentials_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class L05EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        // String[] -> int []
//        int[] numbers = new int[input.length];
//        for (int i = 0; i < input.length; i++) {
//            numbers[i] = Integer.parseInt(input[i]);
//        }

        int[] numbersArray = Arrays.stream(input).
                mapToInt(element -> Integer.parseInt(element))
                .toArray();
        int evenSum = 0;
        int oddSum = 0;

        for (int number: numbersArray) {
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
