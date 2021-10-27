package Fundamentals.Fundamentials_DataTypes_Variables;

import java.util.Scanner;

public class E03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int difference = people % capacity;
        int coursesCount = (int) Math.ceil((double) people / capacity);

        System.out.println(coursesCount);
    }
}
