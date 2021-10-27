package Fundamentals.Fundamentials_MidExams.First;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<String> inputList = Arrays.stream(input.split("\\s+|(?=[,.])"))
                .collect(Collectors.toList());

        List<String> emojiFinalList = new ArrayList<>();
        long thresholdSum = 1L;

        int currentNum = 0;
        int countUpper = 0;
        boolean emojiELigable = false;
        boolean isNumber = false;
        int countSumEmoji = 0;
        int countEmojis = 0;

        for (int i = 0; i < inputList.size(); i++) {
            countUpper = 0;
            countSumEmoji = 0;
            emojiELigable = false;



            if (inputList.get(i).charAt(2) > 65 && inputList.get(i).charAt(2) < 90) {
                emojiELigable = true;
            }

            if (inputList.get(i).length() >= 7) {
                if ((inputList.get(i).charAt(0) == 58
                        && inputList.get(i).charAt(1) == 58
                        && inputList.get(i).charAt(inputList.get(i).length() - 2) == 58
                        && inputList.get(i).charAt(inputList.get(i).length() - 1) == 58)) {
                    emojiELigable = true;

                }

                if ((inputList.get(i).charAt(0) == 42
                        && inputList.get(i).charAt(1) == 42
                        && inputList.get(i).charAt(inputList.get(i).length() - 2) == 42
                        && inputList.get(i).charAt(inputList.get(i).length() - 1) == 42)) {
                    emojiELigable = true;

                }
            }

            for (int j = 0; j < inputList.get(i).length(); j++) {
                if (inputList.get(i).charAt(j) > 48 && inputList.get(i).charAt(j) <= 57) {
                    currentNum = Character.getNumericValue(inputList.get(i).charAt(j));
                    thresholdSum = (thresholdSum * currentNum);

                    emojiELigable = false;


                }
                countSumEmoji += inputList.get(i).charAt(j);

                if (inputList.get(i).charAt(j) >= 65 && inputList.get(i).charAt(j) <= 90) {
                    countUpper += 1;
                }
            }


            if (inputList.get(i).length() >= 7) {
                for (int k = 2; k < inputList.get(i).length() - 2; k++) {
                    if (inputList.get(i).charAt(k) < 97 || inputList.get(i).charAt(k) > 122) {
                        emojiELigable = false;
                    }
                }
            }

            if (emojiELigable && countUpper == 1 && (countSumEmoji > thresholdSum)) {
                emojiFinalList.add(inputList.get(i));
            }

            if (emojiELigable && countUpper == 1) {
                countEmojis++;
            }
        }


        System.out.printf("Cool threshold: %d%n", thresholdSum);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", countEmojis);
        for (int i = 0; i < emojiFinalList.size(); i++) {
            System.out.println(emojiFinalList.get(i));
        }


    }
}
