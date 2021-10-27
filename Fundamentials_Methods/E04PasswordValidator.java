package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class E04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        System.out.println(getValidatorResult(password));
    }

    public static String getValidatorResult(String password) {
        String result = "";

        boolean hasValidLength = getAllowedLength(password);
        boolean hasValidSymbols = getAllowedSigns(password);
        boolean hasValidDigits = getAllowedDigits(password);

        if (!hasValidLength) {
            result += "Password must be between 6 and 10 characters" + "\n";

        }
        if (!hasValidSymbols) {
            result += "Password must consist only of letters and digits" + "\n";
        }
        if (!hasValidDigits) {
            result += "Password must have at least 2 digits";
        }
        if (hasValidLength && hasValidSymbols && hasValidDigits) {
            result = "Password is valid";
        }

        return result;
    }

    public static boolean getAllowedDigits(String password) {
        boolean result = true;
        int countDigits = 0;

        for (int i = 0; i < password.length(); i++) {
            if ((int) password.charAt(i) >= 48 && (int) password.charAt(i) <= 57) {
                countDigits++;
            }
        }
        if (countDigits < 2) {
            result = false;
        }
        return result;
    }

    public static boolean getAllowedSigns(String password) {
        boolean result = true;
        int countUnallowedSymbols = 0;

        for (int i = 0; i < password.length(); i++) {
            if ((int) password.charAt(i) < 47 ||
                    ((int) password.charAt(i) > 57 && (int) password.charAt(i) < 65) ||
                    ((int) password.charAt(i) > 90 && (int) password.charAt(i) < 97) ||
                    (int) password.charAt(i) > 122
            )
            {
                countUnallowedSymbols++;
            }
        }
        if (countUnallowedSymbols > 0) {
            result = false;
        }
        return result;
    }

    public static boolean getAllowedLength(String password) {
        boolean result = true;
        if (password.length() < 6 || password.length() > 10) {
            result = false;
        }
        return result;
    }
}
