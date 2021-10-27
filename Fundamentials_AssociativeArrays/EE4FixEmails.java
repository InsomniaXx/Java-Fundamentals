package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EE4FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> mailCollection = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String name = input;
            String email = scanner.nextLine();
            mailCollection.put(name, email);

            if (email.endsWith("us") || email.endsWith("uk")) {
                mailCollection.remove(name);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : mailCollection.entrySet()) {
            System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
        }
    }
}
