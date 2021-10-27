package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EE1Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> phoneBook = new LinkedHashMap<>();

        while (!input.equals("END")) {
            String[] nextInput = input.split(" ");
            String command = nextInput[0];
            String name = nextInput[1];

            switch (command) {
                case "A":
                    String phone = nextInput[2];
                    phoneBook.put(name, phone);
                    break;
                case "S":
                    if (phoneBook.containsKey(name)) {
                        System.out.printf("%s -> %s%n", name, phoneBook.get(name));
                    } else {
                        System.out.printf("Contact %s does not exist.%n", name);
                    }
                    break;
                default:
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
