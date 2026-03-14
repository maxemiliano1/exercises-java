package exercises.logic;

import java.util.Locale;
import java.util.Scanner;

public class CalcParts {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        //data entry

        int number = sc.nextInt();
        int und = sc.nextInt();
        double value = sc.nextDouble();

        int number2 = sc.nextInt();
        int und2 = sc.nextInt();
        double value2 = sc.nextDouble();

        double total = (und * value) + (und2 * value2);

        //data output

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);


        sc.close();

    }

}
