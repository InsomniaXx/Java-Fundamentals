package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.*;
import java.util.regex.Pattern;

public class EE5HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> cards = new LinkedHashMap<>();
        Map<String, Integer> cardsPower = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {
            String[] draw = input.split(": ");

            String name = draw[0];
            String[] cardInput = draw[1].split(", ");
            if (!cards.containsKey(name)) {
                cards.put(name, new ArrayList<>());
            }

            for (int i = 0; i < cardInput.length; i++) {
                String card = cardInput[i];
                if (!cards.get(name).contains(card)) {
                    cards.get(name).add(card);
                } else {
                    break;
                }
                char currentMultiplier = card.charAt(card.length() - 1);
                String currentPower = card.substring(0, card.length() - 1);

                int multiplier = 0;
                switch (currentMultiplier) {
                    case 'S':
                        multiplier = 4;
                        break;
                    case 'H':
                        multiplier = 3;
                        break;
                    case 'D':
                        multiplier = 2;
                        break;
                    case 'C':
                        multiplier = 1;
                        break;
                    default:
                        break;
                }
                int power = 0;
                if (currentPower.equals("J") || currentPower.equals("Q") || currentPower.equals("K") || currentPower.equals("A")) {
                    switch (currentPower) {
                        case "J":
                            power = 11;
                            break;
                        case "Q":
                            power = 12;
                            break;
                        case "K":
                            power = 13;
                            break;
                        case "A":
                            power = 14;
                            break;
                        default:
                            break;
                    }
                } else {
                    power = Integer.parseInt(currentPower);
                }

                int addPower = multiplier * power;
                if (!cardsPower.containsKey(name)) {
                    cardsPower.put(name, addPower);
                } else {
                    cardsPower.put(name, cardsPower.get(name) + addPower);
                }


            }
            input = scanner.nextLine();
        }
        System.out.println();
    }
}
