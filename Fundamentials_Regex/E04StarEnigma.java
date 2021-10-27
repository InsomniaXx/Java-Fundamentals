package Fundamentals.Fundamentials_Regex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class E04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMessages = Integer.parseInt(scanner.nextLine());

        String regex = "@(?<planet>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attack>[AD])![^@!:>-]*->(?<soldiersCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        int countAttackedPlanets = 0;
        int countAttackedDestructed = 0;
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destructedPlanets = new ArrayList<>();

        for (int i = 0; i < numberOfMessages; i++) {
            StringBuilder message = new StringBuilder(scanner.nextLine());
            int countSTAR = 0;

            for (int j = 0; j < message.length(); j++) {
                if (message.charAt(j) == 'S'
                        || message.charAt(j) == 's'
                        || message.charAt(j) == 'T'
                        || message.charAt(j) == 't'
                        || message.charAt(j) == 'A'
                        || message.charAt(j) == 'a'
                        || message.charAt(j) == 'R'
                        || message.charAt(j) == 'r') {
                    countSTAR++;
                }
            }
            for (int j = 0; j < message.length(); j++) {
                char newChar = (char) (message.charAt(j) - countSTAR);
                message.setCharAt(j, newChar);
            }
            Matcher matcher = pattern.matcher(message);

            while (matcher.find()) {
                String attackType = (matcher.group("attack"));
                if (attackType.contains("A")) {
                    countAttackedPlanets++;
                    attackedPlanets.add(matcher.group("planet"));
                } else if (attackType.contains("D")) {
                    countAttackedDestructed++;
                    destructedPlanets.add(matcher.group("planet"));
                }
            }

        }
        Collections.sort(attackedPlanets);
        Collections.sort(destructedPlanets);

        System.out.printf("Attacked planets: %d%n", countAttackedPlanets);
        if (countAttackedPlanets > 0) {
            for (String planet : attackedPlanets) {
                System.out.printf("-> %s%n", planet);
            }
        }

        System.out.printf("Destroyed planets: %d%n", countAttackedDestructed);
        if (countAttackedDestructed > 0) {
            for (String planet : destructedPlanets) {
                System.out.printf("-> %s%n", planet);
            }
        }

    }
}
