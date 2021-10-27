package Fundamentals.Fundamentials_DataTypes_Variables;

import java.math.BigDecimal;
import java.util.Scanner;

public class L03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <= n; i++) {
            BigDecimal enteredNumber = new BigDecimal(scanner.nextLine());
            sum = sum.add(enteredNumber);
        }
        System.out.println(sum);
    }
}
