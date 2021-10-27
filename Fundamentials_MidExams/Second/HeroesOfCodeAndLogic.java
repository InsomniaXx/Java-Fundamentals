package Fundamentals.Fundamentials_MidExams.Second;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> heroHP = new TreeMap<>();
        Map<String, Integer> heroMP = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] heroes = scanner.nextLine().split("\\s+");
            String currentHero = heroes[0];
            int currentHP = Integer.parseInt(heroes[1]);
            int currentMP = Integer.parseInt(heroes[2]);

            if (currentHP <= 100) {
                heroHP.put(currentHero, currentHP);
            }
            if (currentMP <= 200) {
                heroMP.put(currentHero, currentMP);
            }
        }
        String nextCommand = scanner.nextLine();
        while (!nextCommand.equals("End")) {
            String[] currentCommand = nextCommand.split(" - ");
            String action = currentCommand[0];
            String heroName = currentCommand[1];

            if (heroHP.containsKey(heroName)) {
                switch (action) {
                    case "CastSpell":
                        int neededMP = Integer.parseInt(currentCommand[2]);
                        String spellName = currentCommand[3];
                        castSpell(heroMP, heroName, neededMP, spellName);
                        break;
                    case "TakeDamage":
                        int damage = Integer.parseInt(currentCommand[2]);
                        String attacker = currentCommand[3];
                        takeDamage(heroHP, heroMP, heroName, damage, attacker);
                        break;
                    case "Recharge":
                        int amountMP = Integer.parseInt(currentCommand[2]);
                        recharge(heroMP, heroName, amountMP);
                        break;
                    case "Heal":
                        int amountHP = Integer.parseInt(currentCommand[2]);
                        heal(heroHP, heroName, amountHP);
                        break;
                    default:
                        break;
                }
            }
            nextCommand = scanner.nextLine();
        }

        if (heroHP.size() > 0) {
            heroHP.entrySet()
                    .stream()
                    .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                    .forEach(element ->
                            System.out.printf("%s%n  HP: %d%n  MP: %d%n", element.getKey(), element.getValue(), heroMP.get(element.getKey()))
                    );
        }
    }

    private static void heal(Map<String, Integer> heroHP, String heroName, int amountHP) {
        if (heroHP.get(heroName) + amountHP > 100) {
            int additionalHP = Math.abs(100 - heroHP.get(heroName));
            heroHP.put(heroName, 100);
            System.out.printf("%s healed for %d HP!%n", heroName, additionalHP);
        } else {
            heroHP.put(heroName, heroHP.get(heroName) + amountHP);
            System.out.printf("%s healed for %d HP!%n", heroName, amountHP);
        }
    }

    private static void recharge(Map<String, Integer> heroMP, String heroName, int amountMP) {
        if (heroMP.get(heroName) + amountMP > 200) {
            int additionalMP = Math.abs(200 - heroMP.get(heroName));
            heroMP.put(heroName, 200);
            System.out.printf("%s recharged for %d MP!%n", heroName, additionalMP);
        } else {
            heroMP.put(heroName, heroMP.get(heroName) + amountMP);
            System.out.printf("%s recharged for %d MP!%n", heroName, amountMP);
        }
    }

    private static void takeDamage(Map<String, Integer> heroHP, Map<String, Integer> heroMP, String heroName, int damage, String attacker) {
        heroHP.put(heroName, heroHP.get(heroName) - damage);

        if (heroHP.get(heroName) > 0) {
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, heroHP.get(heroName));
        } else {
            System.out.printf("%s has been killed by %s!%n", heroName, attacker);
            heroHP.remove(heroName);
            heroMP.remove(heroName);
        }
    }

    private static void castSpell(Map<String, Integer> heroMP, String heroName, int neededMP, String spellName) {
        if (neededMP > heroMP.get(heroName)) {
            System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
        } else {
            System.out.printf("%s has successfully cast %s and now has %s MP!%n", heroName, spellName, heroMP.get(heroName) - neededMP);
            heroMP.put(heroName, heroMP.get(heroName) - neededMP);
        }
    }
}
