package Fundamentals.Fundamentials_AssociativeArrays;

import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.toMap;

public class E06Courses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] nextInput = input.split(" :");

            if (!courses.containsKey(nextInput[0])) {
                courses.put(nextInput[0], new ArrayList<>());
            }
            courses.get(nextInput[0]).add(nextInput[1]);
            input = scanner.nextLine();
        }
        courses.entrySet()
                .stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
                    List<String> students = entry.getValue();
                    students.stream().sorted().forEach(studentName -> System.out.println("--" + studentName));
                });



    }
}
