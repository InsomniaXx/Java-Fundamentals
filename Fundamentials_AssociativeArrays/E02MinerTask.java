package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E02MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> miner = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (miner.containsKey(resource)) {
                miner.put(resource, miner.get(resource) + quantity);
            } else {
                miner.put(resource, quantity);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : miner.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
