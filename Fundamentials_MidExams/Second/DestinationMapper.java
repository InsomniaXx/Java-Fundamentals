package Fundamentals.Fundamentials_MidExams.Second;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String regex = "(=|\\/)(?<destination>[A-Z]{1}[A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int countPoints = 0;
        List<String> destinations = new ArrayList<>();
        while (matcher.find()) {
            destinations.add(matcher.group("destination"));
            countPoints += matcher.group("destination").length();
        }
        StringJoiner joiner = new StringJoiner(", ");

        for (String destination: destinations) {
            joiner.add(destination);
        }
        System.out.printf("Destinations: %s%n", joiner.toString());
        System.out.printf("Travel Points: %d%n", countPoints);

    }
}
