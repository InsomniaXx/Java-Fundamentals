package Fundamentals.Fundamentials_MidExams.First;

import java.util.Scanner;

public class NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());

        int peopleCount = Integer.parseInt(scanner.nextLine());

        int employeeHours = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;
        int countHours = 0;

        countHours += Math.ceil(1.0 * peopleCount / employeeHours);

        if (countHours / 4 != 0) {
            countHours += countHours / 4;
        }
        System.out.printf("Time needed: %dh.", countHours);
    }
}
