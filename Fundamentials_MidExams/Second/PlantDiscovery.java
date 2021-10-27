package Fundamentals.Fundamentials_MidExams.Second;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantRarity = new LinkedHashMap<>();
        Map<String, Double> plantRating = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] plantsInput = scanner.nextLine().split("<->");
            String plantName = plantsInput[0];
            int plantRare = Integer.parseInt(plantsInput[1]);

            plantRarity.put(plantName, plantRare);
            plantRating.put(plantName, 0.0);
        }

        String command = scanner.nextLine();

        while (!command.equals("Exhibition")) {
            String[] nextCommand = command.split(":\\s|\\s-\\s");
            String action = nextCommand[0];
            String name = nextCommand[1];

            switch (action) {
                case "Rate":
                    double rating = Double.parseDouble(nextCommand[2]);
                    addRating(plantRating, name, rating);
                    break;
                case "Update":
                    int rarity = Integer.parseInt(nextCommand[2]);
                    updateRarity(plantRarity, name, rarity);
                    break;
                case "Reset":
                    resetRating(plantRating, name);
                    break;
                default:
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");

        plantRarity
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .thenComparingDouble(x -> plantRating.get(x.getKey())).reversed())
                .forEach(entry ->
                        System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue(), plantRating.get(entry.getKey()))
                );
    }

    private static void updateRarity(Map<String, Integer> plantRarity, String name, int rarity) {
        if (plantRarity.containsKey(name)) {
            plantRarity.put(name, rarity);
        } else {
            System.out.println("error");
        }
    }

    private static void resetRating(Map<String, Double> plantRating, String name) {
        if (plantRating.containsKey(name)) {
            plantRating.put(name, 0.0);
        } else {
            System.out.println("error");
        }
    }

    private static void addRating(Map<String, Double> plantRating, String name, double rating) {
        if (plantRating.containsKey(name)) {
            if (plantRating.get(name) == 0) {
                plantRating.put(name, rating);
            } else {
                double updatedRating = (plantRating.get(name) + rating) / 2;
                plantRating.put(name, updatedRating);
            }
        } else {
            System.out.println("error");
        }

    }
}
