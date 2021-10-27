package Fundamentals.Fundamentials_MidExams.Second;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(@|#)(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        boolean hasMirror = false;

        Map<String, String> mirrorWords = new LinkedHashMap<>();

        while (matcher.find()) {
            count++;
            String first = matcher.group("firstWord");
            String second = matcher.group("secondWord");

            if (first.length() == second.length()) {
                for (int i = 0; i < matcher.group("firstWord").length(); i++) {
                    if (first.charAt(first.length() - 1 - i) == second.charAt(i)) {
                        hasMirror = true;
                    } else {
                        hasMirror = false;
                        break;
                    }
                }
            }
            if (hasMirror) {
                mirrorWords.put(matcher.group("firstWord"), matcher.group("secondWord"));
            }
            hasMirror = false;
        }

        if (count == 0) {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        } else {
            System.out.printf("%d word pairs found!%n", count);
            if (mirrorWords.size() > 0) {
                System.out.println("The mirror words are:");
                StringJoiner joiner = new StringJoiner(", ");

                for (Map.Entry<String, String> words : mirrorWords.entrySet()) {
                    String output = words.getKey() + " <=> " + words.getValue();
                    joiner.add(output);
                }
                System.out.print(joiner);
            }
            else {
                System.out.println("No mirror words!");
            }
        }
    }
}
