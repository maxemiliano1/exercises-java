package exercises.logic;

import java.util.Locale;
import java.util.Scanner;

public class CalcAreas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        //data input

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double triangle = A * C / 2;
        double circle = 3.14159 * Math.pow(C, 2.0);
        double trapeze = ((A + B) * C) / 2;
        double square = B * B;
        double rectangle = A * B;

        //data output

        System.out.printf("TRIANGULO: %.3f%n", triangle);
        System.out.printf("CIRCULO: %.3f%n", circle);
        System.out.printf("TRAPEZIO: %.3f%n", trapeze);
        System.out.printf("QUADRADO: %.3f%n", square);
        System.out.printf("RETANGULO: %.3f%n", rectangle);

        sc.close();
    }
}
