package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E01CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> lettersCount = new LinkedHashMap<>();

        for (int index = 0; index < text.length(); index++) {
            char currentSymbol = text.charAt(index);
            if (currentSymbol == ' ') {
                continue;
            }
           if (lettersCount.containsKey(currentSymbol)) {
               lettersCount.put(currentSymbol, lettersCount.get(currentSymbol) + 1);
           } else {
               lettersCount.put(currentSymbol, 1);
           }
        }
        for (Map.Entry<Character, Integer> entry: lettersCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
