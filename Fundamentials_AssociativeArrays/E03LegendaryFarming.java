package Fundamentals.Fundamentials_AssociativeArrays;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> legendary = new LinkedHashMap<>();
        legendary.put("shards", 0);
        legendary.put("fragments", 0);
        legendary.put("motes", 0);

        Map<String, Integer> junk = new TreeMap<>();

        boolean isFinished = false;

        while (!isFinished) {
            String[] nextInput = scanner.nextLine().split("\\s");

            for (int i = 0; i < nextInput.length; i = i + 2) {
                String material = nextInput[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {

                    legendary.put(material, legendary.get(material) + Integer.parseInt(nextInput[i]));

                    if (legendary.get(material) >= 250) {
                        isFinished = true;
                        String item = "";

                        for (Map.Entry<String, Integer> items : legendary.entrySet()) {
                            if (items.getKey().equals("shards")) {
                                item = "Shadowmourne";
                            } else if (items.getKey().equals("fragments")) {
                                item = "Valanyr";
                            } else if (items.getKey().equals("motes")) {
                                item = "Dragonwrath";
                            }
                            if (items.getValue() >= 250) {
                                System.out.printf("%s obtained!%n", item);
                            }
                        }
                        legendary.put(material, Math.abs(legendary.get(material) - 250));
                        break;
                    }

                } else {
                    if (junk.containsKey(material)) {
                        junk.put(material, junk.get(material) + Integer.parseInt(nextInput[i]));
                    } else {
                        junk.put(material, Integer.parseInt(nextInput[i]));
                    }
                }
            }
        }

        legendary.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int res = e2.getValue().compareTo(e1.getValue());
                    if (res == 0) {
                        res = e1.getKey().compareTo(e2.getKey());
                    }
                    return res;
                }).forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));

        for (Map.Entry<String, Integer> junkItems : junk.entrySet()) {
            System.out.printf("%s: %d%n", junkItems.getKey(), junkItems.getValue());
        }
    }
}
