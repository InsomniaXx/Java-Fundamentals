package Fundamentals.Fundamentials_MidExams.First;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> neighbourhoodList = Arrays
                .stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int currentIndex = 0;

        while (!input.equals("Love!")) {
            String nextJump = input;
            String[] cupidJump = nextJump.split(" ");
            int index = Integer.parseInt(cupidJump[1]);
            currentIndex += index;

            if (currentIndex >= neighbourhoodList.size()) {
                currentIndex = 0;
            }

            if (neighbourhoodList.get(currentIndex) != 0) {
                neighbourhoodList.set(currentIndex, neighbourhoodList.get(currentIndex) - 2);

                if (neighbourhoodList.get(currentIndex) == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                }
            } else {
                System.out.printf("Place %d already had Valentine's day.%n", currentIndex);
            }

            input = scanner.nextLine();
        }

        int countFailedPlaces = 0;

        for (int i = 0; i < neighbourhoodList.size(); i++) {
            if (neighbourhoodList.get(i) != 0) {
                countFailedPlaces++;
            }
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        System.out.printf("Cupid has failed %d places.%n", countFailedPlaces);
    }
}
