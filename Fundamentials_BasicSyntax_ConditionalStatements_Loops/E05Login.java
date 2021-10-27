package Fundamentals.Fundamentials_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class E05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int attempt = 1;
        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        String inputPass = scanner.nextLine();
        boolean isCorrect = false;
        if (inputPass.equals(password)) {
            isCorrect = true;
        }

        while (!isCorrect) {
            attempt ++;
            System.out.println("Incorrect password. Try again.");
            String newPass = scanner.nextLine();
            if (newPass.equals(password)) {
                isCorrect = true;
            }

            if (attempt == 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            newPass = inputPass;
        }

        if (isCorrect) {
            System.out.printf("User %s logged in.", username);
        }
    }
}
