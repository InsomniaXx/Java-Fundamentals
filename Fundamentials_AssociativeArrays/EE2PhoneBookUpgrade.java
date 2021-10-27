package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class EE2PhoneBookUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> phoneBook = new TreeMap<>();

        while (!input.equals("END")) {
            String[] nextInput = input.split(" ");
            String command = nextInput[0];
            String name = "";

            if (command.equals("ListAll")) {
                for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                    System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
                }
            } else {
                name = nextInput[1];
            }
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
