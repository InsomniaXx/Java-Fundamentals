package Fundamentals.Fundamentials_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumFirstPlayer = 0;
        int sumSecondPlayer = 0;

        for (int i = 0; firstPlayer.size() > 0 && secondPlayer.size() > 0; ) {
            i = 0;
            if (firstPlayer.get(i) > secondPlayer.get(i)) {
                firstPlayer.add(firstPlayer.size(), secondPlayer.get(i));
                firstPlayer.add(firstPlayer.size() - 1, firstPlayer.get(i));
                firstPlayer.remove(i);
                secondPlayer.remove(i);
            } else if (secondPlayer.get(i) > firstPlayer.get(i)) {
                secondPlayer.add(secondPlayer.size(), firstPlayer.get(i));
                secondPlayer.add(secondPlayer.size() - 1, secondPlayer.get(i));
                firstPlayer.remove(i);
                secondPlayer.remove(i);
            } else {
                firstPlayer.remove(i);
                secondPlayer.remove(i);
            }
        }
        int maxSize = Math.max(firstPlayer.size(), secondPlayer.size());

        if (firstPlayer.size() == maxSize) {
            for (Integer integer : firstPlayer) {
                sumFirstPlayer += integer;
            }
        }
        if (maxSize == secondPlayer.size()) {
            for (Integer secondPlayerPoints : secondPlayer) {
                sumSecondPlayer += secondPlayerPoints;
            }
        }

        if (sumFirstPlayer > sumSecondPlayer) {
            System.out.println("First player wins! Sum: " + sumFirstPlayer);
        } else if (sumSecondPlayer > sumFirstPlayer) {
            System.out.println("Second player wins! Sum: " + sumSecondPlayer);
        }
    }
}
