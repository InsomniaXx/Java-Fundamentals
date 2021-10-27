package Fundamentals.Fundamentials_Lists;

import java.util.*;
import java.util.stream.Collectors;

public class L07RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
                i--;
            }
        }

        Collections.reverse(numbers);

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
//            for (int i = 0; i < numbers.size(); i++) {
//                System.out.print(numbers.get(i) + " ");
//            }
            System.out.print(numbers.toString().replaceAll("[\\[\\],]", " "));
        }
    }
}
