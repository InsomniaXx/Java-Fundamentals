package Fundamentals.Fundamentials_MidExams.Second;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([#|])(?<name>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]{1,5}+)\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int totalCalories = 0;
        List<String> items = new ArrayList<>();

        while (matcher.find()) {
            String productName = matcher.group("name");
            String productDate = matcher.group("date");
            int productCalories = Integer.parseInt(matcher.group("calories"));

            totalCalories += productCalories;
            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d", productName, productDate, productCalories));
        }

        System.out.printf("You have food to last you for: %d days!%n", totalCalories / 2000);

        if (totalCalories / 2000 > 0) {
            items.forEach(System.out::println);
        }

    }
}
