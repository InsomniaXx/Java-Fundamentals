package Fundamentals.Fundamentials_Regex;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputNames = scanner.nextLine();
        String text = scanner.nextLine();
        Map<String, Integer> participants = new LinkedHashMap<>();

        String regexName = "(?<personName>[A-Za-z]+)";
        String regexScore = "(?<personScore>\\d)";

        Pattern patternName = Pattern.compile(regexName);
        Pattern patternScore = Pattern.compile(regexScore);

        while (!text.equals("end of race")) {
            int sumScore = 0;
            StringBuilder builderName = new StringBuilder();

            Matcher matcherName = patternName.matcher(text);
            Matcher matcherScore = patternScore.matcher(text);

            while (matcherName.find()) {
                String currentName = matcherName.group("personName");
                builderName.append(currentName);
            }
            while (matcherScore.find()) {
                int currentScore = Integer.parseInt(matcherScore.group("personScore"));
                sumScore += currentScore;
            }
            if (inputNames.contains(builderName.toString())) {
                if (participants.containsKey(builderName.toString())) {
                    participants.put(builderName.toString(), sumScore + participants.get(builderName.toString()));
                } else {
                    participants.put(builderName.toString(), sumScore);
                }
            }
            text = scanner.nextLine();
        }
        AtomicInteger index = new AtomicInteger(0);
        AtomicReference<String> addToIndex = new AtomicReference<>("");
        participants.entrySet().stream()
                .limit(3)
                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .forEach(racer -> {
                    index.getAndIncrement();
                    if (index.get() == 1) {
                        addToIndex.set("st");
                    } else if (index.get() == 2) {
                        addToIndex.set("nd");
                    } else if (index.get() == 3) {
                        addToIndex.set("rd");
                    }
                    System.out.printf("%s%s place: %s%n", index, addToIndex, racer.getKey());

                });


    }
}
