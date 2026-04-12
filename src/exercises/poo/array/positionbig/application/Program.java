package exercises.poo.array.positionbig.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] numbers = new double[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um numero: ");
            numbers[i] = sc.nextDouble();
        }

        double valueBig = 0.0;
        int positionValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > valueBig) {
                valueBig = numbers[i];
                positionValue= i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", +valueBig);
        System.out.println("POSICAO DO MAIOR VALOR = "+positionValue);

        sc.close();
    }
}