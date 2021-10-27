package Fundamentals.Fundamentials_Arrays;

import java.util.Scanner;

public class E02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

        String[] firstArray = firstInput.split(" ");
        String[] secondArray = secondInput.split(" ");

        for (String secondWord : secondArray) {
            for (String firstWord : firstArray) {
                if (secondWord.equals(firstWord)) {
                    System.out.print(firstWord + " ");
                }
            }
        }
    }
}
