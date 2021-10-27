package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class E10SoftuniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> userPoints = new HashMap<>();
        Map<String, Integer> languageCount = new HashMap<>();

        while (!input.equals("exam finished")) {
            String[] nextData = input.split("-");
            String username = nextData[0];
            String language = nextData[1];
            int points = Integer.parseInt(nextData[2]);

            input = scanner.nextLine();
        }

    }
}
