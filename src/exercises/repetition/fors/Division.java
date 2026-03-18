package exercises.repetition.fors;

import java.util.Locale;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            if (b == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.println(a / b);
            }
        }
        sc.close();
    }
}
