package Fundamentals.Fundamentials_Objects_Classes.E06EOrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

        while (!input.equals("End")) {
            String nextInput = input;
            String[] inputArray = nextInput.split(" ");
            Person person = new Person(inputArray[0], inputArray[1], Integer.parseInt(inputArray[2]));
            personList.add(person);

            input = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));

        for (Person person : personList) {
            System.out.printf("%s with ID: %s is %d years old.%n", person.getName(), person.getId(), person.getAge());
        }
    }
}
