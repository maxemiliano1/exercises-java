package exercises.poo.array.approved.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        double[] nota1 = new double[n];
        double[] nota2 = new double[n];

        for (int i = 0; i < name.length; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %d° aluno:%n", i + 1);
            System.out.print("Name: ");
            sc.nextLine();
            name[i] = sc.nextLine();
            System.out.print("Primeira nota: ");
            nota1[i] = sc.nextDouble();
            System.out.print("Segunda nota: ");
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos Aprovados:");

        for (int i = 0; i < nota1.length; i++) {
            if ((nota1[i] + nota2[i]) / 2 >= 6.0) {
                System.out.println(name[i]);
            }
        }
        sc.close();
    }
}