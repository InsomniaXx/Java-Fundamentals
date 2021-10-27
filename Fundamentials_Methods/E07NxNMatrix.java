package Fundamentals.Fundamentials_Methods;

import java.util.Scanner;

public class E07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        getMatrix(n);
    }

    private static void getMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
