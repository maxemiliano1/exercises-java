package exercises.poo.composition.course.application;

import exercises.poo.composition.course.entities.Course;
import exercises.poo.composition.course.entities.Instructor;
import exercises.poo.composition.course.entities.Module;
import exercises.poo.composition.course.entities.enums.DifficultyLevel;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter instructor data:");

        System.out.print("Name: ");
        String nameInstructor = sc.nextLine();
        System.out.print("Email: ");
        String emailInstructor = sc.next();
        Instructor instructor = new Instructor(nameInstructor, emailInstructor);


        System.out.println("Enter course data:");
        System.out.print("Name: ");
        sc.nextLine();
        String nameCourse = sc.nextLine();
        Course course = new Course(nameCourse);
        course.setInstructor(instructor);

        System.out.print("How many modules to this course? ");
        int numberModule = sc.nextInt();

        for (int i = 0; i < numberModule; i++) {
            System.out.printf("Enter module #%s data:%n", i + 1);
            System.out.print("Title: ");
            sc.nextLine();
            String titleModule = sc.nextLine();


            System.out.print("Hours: ");
            int workLoad = sc.nextInt();

            System.out.print("Difficulty (BEGINNER, INTERMEDIATE, ADVANCED): ");
            String difficulty = sc.next().toUpperCase();
            System.out.println();
            Module module = new Module(titleModule, workLoad, DifficultyLevel.valueOf(difficulty));
            course.addModule(module);
        }

        System.out.println("\nCOURSE SUMMARY:");
        System.out.println(course);

        for (Module m : course.getModules()) {
            System.out.println(m);
        }

        System.out.printf("Total duration: %s hours", course.totalHours());

        sc.close();
    }
}