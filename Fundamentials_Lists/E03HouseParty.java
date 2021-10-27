package Fundamentals.Fundamentials_Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class E03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        List<String> listGuests = new ArrayList<>();

        for (int i = 0; i < people; i++) {
            List<String> commandList = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());

            if (commandList.get(1).contains("is") && commandList.get(2).contains("going")) {
                if (listGuests.contains(commandList.get(0))) {
                    System.out.println(commandList.get(0) + " is already in the list!");
                } else {
                    listGuests.add(commandList.get(0));
                }
            } else if (commandList.get(2).contains("not") && commandList.get(3).contains("going")) {
                if (!listGuests.contains(commandList.get(0))) {
                    System.out.println(commandList.get(0) + " is not in the list!");
                } else {
                    listGuests.remove(commandList.get(0));
                }
            }
            commandList.clear();
        }

        for (String guest: listGuests) {
            System.out.println(guest);
        }
    }
}
