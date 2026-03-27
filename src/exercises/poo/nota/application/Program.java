package exercises.poo.nota.application;

import exercises.poo.nota.entity.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println(student);

        if (student.gradeCalc() >= 60.0) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("%s %.2f %s", "MISSING", student.gradeFailed(), "POINTS");

        }

        sc.close();

    }
}
