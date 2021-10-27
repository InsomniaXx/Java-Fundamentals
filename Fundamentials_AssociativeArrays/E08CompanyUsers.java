package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.*;

public class E08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> company = new TreeMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] data = input.split(" -> ");

            if (!company.containsKey(data[0])) {
                company.put(data[0], new ArrayList<>());
            }
            if (!company.get(data[0]).contains(data[1])) {
                company.get(data[0]).add(data[1]);
            }
            input = scanner.nextLine();
        }

        company.entrySet()
                .stream()
                .forEach(e -> {
                    System.out.println(e.getKey());
                    List<String> models = e.getValue();
                    models.stream().forEach(
                            model -> System.out.printf("-- %s%n", model)
                    );
                });
    }
}
