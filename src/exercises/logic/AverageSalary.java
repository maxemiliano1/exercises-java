package exercises.logic;

import java.util.Locale;
import java.util.Scanner;

public class AverageSalary {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        //data entry

        int number = sc.nextInt();
        int time = sc.nextInt();
        double salary_time = sc.nextDouble();

        double salary = time * salary_time;

        //data output

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}
