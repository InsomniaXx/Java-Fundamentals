package Fundamentals.Fundamentials_MidExams.Second;

import java.util.*;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> cityPopulation = new TreeMap<>();
        Map<String, Integer> cityGold = new TreeMap<>();

        while (!input.equals("Sail")) {
            String[] cities = input.split("\\|\\|");
            String city = cities[0];
            int population = Integer.parseInt(cities[1]);
            int gold = Integer.parseInt(cities[2]);

            if (cityPopulation.containsKey(city)) {
                cityPopulation.put(city, cityPopulation.get(city) + population);
                cityGold.put(city, cityGold.get(city) + gold);
            } else {
                cityPopulation.put(city, population);
                cityGold.put(city, gold);
            }

            input = scanner.nextLine();
        }

        String nextInput = scanner.nextLine();

        while (!nextInput.equals("End")) {
            String[] events = nextInput.split("=>");

            String currentEvent = events[0];
            String currentTown = events[1];
            int plunderedPeople = 0;
            int plunderedGold = 0;

            if (currentEvent.equals("Plunder")) {
                plunderedPeople = Integer.parseInt(events[2]);
                plunderedGold = Integer.parseInt(events[3]);

                cityPopulation.put(currentTown, cityPopulation.get(currentTown) - plunderedPeople);
                cityGold.put(currentTown, cityGold.get(currentTown) - plunderedGold);

                System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", currentTown, plunderedGold, plunderedPeople);

                if (cityPopulation.get(currentTown) <= 0 || cityGold.get(currentTown) <= 0) {
                    System.out.printf("%s has been wiped off the map!%n", currentTown);
                    cityPopulation.remove(currentTown);
                    cityGold.remove(currentTown);
                }

            } else if (currentEvent.equals("Prosper")) {
                plunderedGold = Integer.parseInt(events[2]);

                if (plunderedGold <= 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    cityGold.put(currentTown, cityGold.get(currentTown) + plunderedGold);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", plunderedGold, currentTown, cityGold.get(currentTown));
                }
            }
            nextInput = scanner.nextLine();
        }

        if (cityPopulation.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cityPopulation.size());

            cityGold.entrySet()
                    .stream()
                    .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                    .forEach(element ->
                            System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", element.getKey(), cityPopulation.get(element.getKey()), element.getValue()));

        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }
}
