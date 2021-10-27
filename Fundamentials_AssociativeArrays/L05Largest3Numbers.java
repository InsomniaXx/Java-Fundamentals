package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class L05Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s");

        Arrays.stream(input)
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(number -> System.out.print(number + " "));
    }
}
