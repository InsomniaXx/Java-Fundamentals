package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.*;
import java.util.function.DoubleFunction;

public class L02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> synonymDictionary = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if(!synonymDictionary.containsKey(word)) {
                List<String> synonymsList = new ArrayList<>();
                synonymsList.add(synonym);
                synonymDictionary.put(word, synonymsList);
            } else {
                List<String> synonymsList = synonymDictionary.get(word);
                synonymsList.add(synonym);
                synonymDictionary.put(word, synonymsList);
            }
        }
        for (Map.Entry<String, List<String>> wordEntry : synonymDictionary.entrySet()) {
            String currentWord = wordEntry.getKey();
            List<String> synonymsForCurrentWord = wordEntry.getValue();
            System.out.printf("%s - %s%n", currentWord, String.join(", ", synonymsForCurrentWord));
        }

    }
}
