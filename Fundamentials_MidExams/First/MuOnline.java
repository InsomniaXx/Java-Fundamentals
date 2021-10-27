package Fundamentals.Fundamentials_MidExams.First;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays
                .stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        int health = 100;
        String monster = "";
        int damage = 0;
        int countRooms = 0;
        int bitcoins = 0;
        int difference = 0;
        boolean isDead = false;

        for (int i = 0; i < input.size() && health > 0; i++) {
            countRooms++;
            String[] currentElement = input.get(i).split(" ");

            monster = currentElement[0];
            damage = Integer.parseInt(currentElement[1]);

            switch (monster) {
                case "potion":
                    if (health + damage > 100) {
                        difference = 100 - health;
                        health += difference;
                        System.out.println("You healed for " + difference + " hp.");
                        System.out.println("Current health: " + health + " hp.");

                    } else if (health == 100) {
                        System.out.println("You healed for 0 hp.");
                        System.out.println("Current health: 100 hp.");
                    } else {
                        health += damage;
                        System.out.println("You healed for " + damage + " hp.");
                        System.out.println("Current health: " + health + " hp.");
                    }
                    break;
                case "chest":
                    bitcoins += damage;
                    System.out.println("You found " + damage + " bitcoins.");
                    break;
                default:
                    health -= damage;
                    if (health > 0) {
                        System.out.println("You slayed " + monster + ".");
                    } else {
                        isDead = true;
                        System.out.println("You died! Killed by " + monster + ".");
                        break;
                    }
                    break;
            }
        }
        if (isDead) {
            System.out.println("Best room: " + countRooms);
        } else {
            System.out.println("You've made it!");
            System.out.println("Bitcoins: " + bitcoins);
            System.out.println("Health: " + health);
        }
    }
}
