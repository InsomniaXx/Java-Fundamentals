package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        Map<String, Double> orders = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] order = input.split("\\s");
            String product = order[0];
            double price = Double.parseDouble(order[1]);
            int quantity = Integer.parseInt(order[2]);

            if (productPrice.containsKey(product)) {
                productQuantity.put(product, productQuantity.get(product) + quantity);

                if (productPrice.get(product) != price) {
                    productPrice.put(product, price);

                } else {
                    productQuantity.put(product, productQuantity.get(product) + quantity);
                }
                orders.put(product, productPrice.get(product) * productQuantity.get(product));

            } else {
                productPrice.put(product, price);
                productQuantity.put(product, quantity);
                orders.put(product, price * quantity);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : orders.entrySet()) {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
        }
    }
}
