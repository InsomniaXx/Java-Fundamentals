package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class E07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> students = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!students.containsKey(name)) {
                students.put(name, grade);
            } else {
                students.put(name, (students.get(name) + grade) / 2);
            }
        }

        students.entrySet()
                .stream()
                .filter(e -> e.getValue() >= 4.50)
                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .forEach(element -> {
                    System.out.printf("%s -> %.2f%n", element.getKey(), element.getValue());
                });
    }
}
