package exercises.poo.array.older.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos pessoas voce vai digitar? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] age = new int[n];

        for (int i = 0; i < name.length; i++) {
            System.out.printf("Dados da %d° pessoa:\n", i + 1);
            System.out.print("Nome: ");
            name[i] = sc.next();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
        }

        String older = "";
        int contOlder = 0;
        for (int i = 0; i < name.length; i++) {
            if (age[i] > contOlder) {
                contOlder = age[i];
                older = name[i];
            }
        }

        System.out.print("PESSOA MAIS VELHA: "+older);

        sc.close();
    }
}