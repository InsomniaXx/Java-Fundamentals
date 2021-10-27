package Fundamentals.Fundamentials_Objects_Classes.E03OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> listPerson = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] personData = input.split(" ");
            Person person = new Person(personData[0], Integer.parseInt(personData[1]));

            listPerson.add(person);
        }

        listPerson = listPerson.stream().filter(p -> p.getAge() > 30).collect(Collectors.toList());

        listPerson.sort(Comparator.comparing(Person::getName));

        for(Person person : listPerson) {
            System.out.printf("%s - %d%n", person.getName(), person.getAge());
        }
    }
}
