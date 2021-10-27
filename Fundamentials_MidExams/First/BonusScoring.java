package Fundamentals.Fundamentials_MidExams.First;

import java.util.Scanner;

public class BonusScoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());

        double maxScore = Integer.MIN_VALUE;
        int maxStudentAttendances = Integer.MIN_VALUE;
        double currentScore = 0;

        for (int i = 1; i <= studentsCount; i++) {
            int studentAttendances = Integer.parseInt(scanner.nextLine());
            currentScore = 1.0 * studentAttendances / lecturesCount * (5 + initialBonus);

            if (studentAttendances > maxStudentAttendances) {
                maxStudentAttendances = studentAttendances;
            }

            if (currentScore > maxScore) {
                maxScore = currentScore;
            }
        }
        System.out.printf("Max bonus: %.0f.%n", Math.ceil(maxScore));
        System.out.printf("The student has attended %d lectures.", maxStudentAttendances);
    }
}
