package Fundamentals.Fundamentials_Objects_Classes.E05Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String nextStudent = scanner.nextLine();
            String[] studentArray = nextStudent.split("\\s");
            Student student = new Student(studentArray[0], studentArray[1], Double.parseDouble(studentArray[2]));
            students.add(student);
        }

        students.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student : students) {
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getSecondName(), student.getGrade());
        }
    }
}
