package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class EE3AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String resource = input;
            int count = Integer.parseInt(scanner.nextLine());

            if (resources.containsKey(resource)) {
                int updateCount = resources.get(resource) + count;
                resources.put(resource, updateCount);
            } else {
                resources.put(resource, count);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
