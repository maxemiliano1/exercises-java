package exercises.logic;

import java.util.Locale;
import java.util.Scanner;

public class CalcAreaCircle {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        //entrada dados

        double raio = sc.nextDouble();

        //formula calculo
        double area = 3.14159 * Math.pow(raio, 2.0);

        //saida dados
        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
