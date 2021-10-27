package Fundamentals.Fundamentials_Arrays;

import java.util.Scanner;

public class E03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int row = 0; row < n; row++) {
            String input = scanner.nextLine();
            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);

            if ((row + 1) % 2 == 0) {
                firstArray[row] = secondNumber;
                secondArray[row] = firstNumber;
            } else {
                firstArray[row] = firstNumber;
                secondArray[row] = secondNumber;
            }
        }
        for (int number : firstArray) {
            System.out.print(number + " ");
        }
        System.out.println();
        for (int number : secondArray) {
            System.out.print(number + " ");
        }
    }
}
