package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E05SoftUniParking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        Map<String, String> users = new LinkedHashMap<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] input = scanner.nextLine().split("\\s");

            switch (input[0]) {
                case "register":
                    if (!users.containsKey(input[1])) {
                        users.put(input[1], input[2]);
                        System.out.printf("%s registered %s successfully%n", input[1], input[2]);
                    } else {
                        System.out.println("ERROR: already registered with plate number " + input[2]);
                    }
                    break;
                case "unregister":
                    if (users.containsKey(input[1])) {
                        users.remove(input[1]);
                        System.out.println(input[1] + " unregistered successfully");
                    } else {
                        System.out.printf("ERROR: user %s not found%n", input[1]);
                    }
                    break;
                default:
                    break;
            }
        }
        for (Map.Entry<String, String> finalUsers : users.entrySet()) {
            System.out.printf("%s => %s%n", finalUsers.getKey(), finalUsers.getValue());
        }
    }
}
