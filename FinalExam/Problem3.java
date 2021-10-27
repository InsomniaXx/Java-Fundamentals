package Fundamentals.FinalExam;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> animalFood = new TreeMap<>();
        Map<String, List<String>> animalArea = new TreeMap<>();

        while (!input.equals("EndDay")) {
            String[] nextInput = input.split(": |-");
            String action = nextInput[0];
            String animal = nextInput[1];
            int foodQuantity = Integer.parseInt(nextInput[2]);

            switch (action) {
                case "Add":
                    String area = nextInput[3];
                    if (animalFood.containsKey(animal)) {
                        animalFood.put(animal, animalFood.get(animal) + foodQuantity);
                    } else {
                        animalFood.put(animal, foodQuantity);
                    }
                    if (!animalArea.containsKey(area)) {
                        animalArea.put(area, new ArrayList<>());
                    }
                    if (!animalArea.get(area).contains(animal)) {
                        animalArea.get(area).add(animal);
                    }
                    break;
                case "Feed":
                    if (animalFood.containsKey(animal)) {
                        animalFood.put(animal, animalFood.get(animal) - foodQuantity);
                        if (animalFood.get(animal) <= 0) {
                            animalFood.remove(animal);
                            System.out.printf("%s was successfully fed%n", animal);
                            for (Map.Entry<String, List<String>> areas : animalArea.entrySet()) {
                                String key = areas.getKey();
                                if (areas.getValue().contains(animal)) {
                                    animalArea.get(key).remove(animal);
                                }
                            }
                        }
                    } else {
                        break;
                    }
                    break;
                default:
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Animals:");
        animalFood.entrySet()
                .stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .forEach(element -> System.out.printf(" %s -> %dg%n", element.getKey(), element.getValue()));

        System.out.println("Areas with hungry animals:");
        animalArea.entrySet()
                .stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {
                    if (entry.getValue().size() > 0) {
                        System.out.printf(" %s: %s%n", entry.getKey(), entry.getValue().size());
                    }
                });

    }
}
