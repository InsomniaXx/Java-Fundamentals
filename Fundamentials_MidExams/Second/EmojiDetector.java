package Fundamentals.Fundamentials_MidExams.Second;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regexEmoji = "(?<emoji>\\*\\*[A-Z][a-z]{2,}\\*\\*|\\:\\:[A-Z][a-z]{2,}\\:\\:)";
        String regexNumber = "(?<number>\\d)";

        Pattern patternEmoji = Pattern.compile(regexEmoji);
        Pattern patternNumber = Pattern.compile(regexNumber);

        Matcher matcherEmoji = patternEmoji.matcher(input);
        Matcher matcherNumber = patternNumber.matcher(input);

        BigInteger treasureSum = new BigInteger("1");
        List<String> emojiList = new ArrayList<>();

        while (matcherEmoji.find()) {
            String findEmoji = matcherEmoji.group("emoji");
            emojiList.add(findEmoji);
        }

        while (matcherNumber.find()) {
            int findNumber = Integer.parseInt(matcherNumber.group("number"));
            treasureSum = treasureSum.multiply(BigInteger.valueOf(findNumber));
        }
        System.out.println("Cool threshold: " + treasureSum);
        List<String> finalEmoji = new ArrayList<>();

        for (String emojis : emojiList) {
            int asciiSum = 0;

            for (int i = 0; i < emojis.length(); i++) {
               if (emojis.charAt(i) != ':' && emojis.charAt(i) != '*') {
                    asciiSum += emojis.charAt(i);
               }
            }
            if (BigInteger.valueOf(asciiSum).compareTo(treasureSum) > 0) {
                finalEmoji.add(emojis);
            }
        }

        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojiList.size());

        if (finalEmoji.size() > 0) {

            for (String emojis : finalEmoji) {
                System.out.println(emojis);
            }
        }

    }
}
