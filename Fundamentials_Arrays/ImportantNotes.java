package Fundamentals.Fundamentials_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ImportantNotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Разделяне на символи
        String userInput = "1 2 3 4 5 6";
        String[] userInputArray = userInput.split(" ");
        for (int i = 0; i < userInputArray.length; i++) {
            System.out.println(userInputArray[i]);
        }

        int[] numbersArray = new int[userInputArray.length];
        for (int i = 0; i < userInputArray.length; i++) {
            numbersArray[i] = Integer.parseInt(userInputArray[i]);
        }

        int[] arr = Arrays.stream(userInputArray)
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] Array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        String[] arr2 = {"one", "two"};
        // == new String [] {"one", "two"};
        // Process all array elements
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr[%d] = %s%n", i, arr2[i]);
        }

        String names = "Gosho Pesho Toshko";
        //Split Method
        String[] namesArray = names.split(" ");
        //Join Method
        String backToString = String.join(" ", namesArray);

        //Размяна на стойности

        int a = 5;
        int b = 10;
        int c = a;

        a = b;
        b = c;
        System.out.println(a); //10
        System.out.println(b); //5

        int[] collection = {1, 2, 3, 4, 10};
        for (int number: collection) {
            System.out.println(number);
        }

    }
}
