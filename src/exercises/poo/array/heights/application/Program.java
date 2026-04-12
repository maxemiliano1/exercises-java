package exercises.poo.array.heights.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for (int i = 0; i < name.length; i++) {
            System.out.println("\nDados da " + (i+1) + "º pessoa");
            System.out.print("Nome: ");
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            System.out.print("Altura: ");
            height[i] = sc.nextDouble();
        }

        double media = 0;
        for (int i = 0; i < height.length; i++) {
            media += height[i];
        }

        System.out.printf("Altura Média: %.2f%n", (media / height.length));

        double nMenores = 0;

        for (int i = 0; i < name.length; i++) {
            if (age[i] < 16) {
                nMenores++;

            }
        }
        System.out.print(String.format("Pessoas com menos de 16 anos: %.1f", ((nMenores / name.length) * 100)) + "%\n");

        for (int i = 0; i < name.length; i++) {
            if (age[i] < 16) {
                System.out.println(name[i]);
            }
        }

        sc.close();
    }

}
