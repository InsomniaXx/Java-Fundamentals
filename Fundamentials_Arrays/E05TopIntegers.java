package Fundamentals.Fundamentials_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        for (int index = 0; index < inputArray.length - 1; index++) {
            if (inputArray[index] > inputArray[index + 1]) {
                System.out.print(inputArray[index] + " ");
            }
        }
        System.out.println(inputArray[inputArray.length - 1]);
        System.out.println();

    }
}

