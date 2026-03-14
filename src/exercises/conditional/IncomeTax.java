package exercises.conditional;

import java.util.Locale;
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();

        if (salary <= 2000.00) {
            System.out.println("Isento");
        } else if (salary > 2000.00 && salary <= 3000.00) {
            System.out.printf("R$ %.2f%n", ((salary - 2000.00) * 8 / 100));
        } else if (salary > 3000.00 && salary <= 4500.00) {
            System.out.printf("R$ %.2f%n", (((salary - 3000.00) * 18 / 100) + 80.00));
        } else {
            System.out.printf("R$ %.2f%n", (((salary - 4500.00) * 28 / 100) + 350.00));
        }

        sc.close();
    }
}
