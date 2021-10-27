package Fundamentals.Fundamentials_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();
        int inputNumber = Integer.parseInt(scanner.nextLine());
        if (inputArray.length == 1 && inputArray[0] == inputNumber) {
            System.out.println(inputArray[0]);
        }
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == inputNumber) {
                    System.out.println(inputArray[i] + " " + inputArray[j]);
                }
            }
        }
    }
}
