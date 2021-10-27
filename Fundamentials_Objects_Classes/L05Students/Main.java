package Fundamentals.Fundamentials_Objects_Classes.L05Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();

        while(!input.equals("end")) {
            String[] studentData = input.split(" ");

            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String town = studentData[3];
            
            if (isStudentExist(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHomeTown(town);
            } else {
                Student student = new Student(firstName, lastName, age, town);
                students.add(student);
            }
            
            input = scanner.nextLine();
        }
        String filterCity = scanner.nextLine();
        
        for (Student student : students) {
            if (student.getHomeTown().equals(filterCity)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(),student.getAge());
            }
        }

    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

    private static boolean isStudentExist(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
           if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
               return true;
           }
        }
        return false;
    }
}
