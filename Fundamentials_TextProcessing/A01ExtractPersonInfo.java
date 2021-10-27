package Fundamentals.Fundamentials_TextProcessing;

import java.util.Scanner;

public class A01ExtractPersonInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int indexStartName = 0;
            int indexEndName = 0;

            int indexStartAge = 0;
            int indexEndAge = 0;

            for (int j = 0; j < input.length(); j++) {
                switch (input.charAt(j)) {
                    case '@':
                        indexStartName = j + 1;
                        break;
                    case '|':
                        indexEndName = j;
                        break;
                    case '#':
                        indexStartAge = j + 1;
                        break;
                    case '*':
                        indexEndAge = j;
                        break;
                }
            }
            String name = input.substring(indexStartName, indexEndName);
            String age = input.substring(indexStartAge, indexEndAge);

            System.out.printf("%s is %s years old.%n", name, age);
        }

    }
}

