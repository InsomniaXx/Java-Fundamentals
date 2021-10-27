package Fundamentals.FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "U\\$(?<username>[A-Z][a-z]{2,})U\\$P@\\$(?<password>[A-Za-z]{5,}\\d{1,})P@\\$";
        Pattern pattern = Pattern.compile(regex);
        int count = 0;

        for (int i = 0; i < n; i++) {
            String registration = scanner.nextLine();
            Matcher matcher = pattern.matcher(registration);

            if (matcher.find()) {
                System.out.println("Registration was successful");
                String username = matcher.group("username");
                String password = matcher.group("password");
                count++;
                System.out.printf("Username: %s, Password: %s%n", username, password);
            } else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.printf("Successful registrations: %d%n", count);
    }
}
