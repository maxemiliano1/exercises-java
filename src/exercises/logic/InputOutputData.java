package exercises.logic;

import java.util.Scanner;

public class InputOutputData {

    public static void main(String[] args) {

        System.out.println("Soma dos números");
        System.out.print("\n-----------------------------\n\n");

        Scanner sc = new Scanner(System.in);
        int x, y, soma;
        System.out.println("Digite Primeiro Número");
        x = sc.nextInt();
        System.out.println("Digite Segundo Número");
        y = sc.nextInt();

        soma = x + y;

        System.out.print("\n-----------------------------\n\n");
        System.out.println("Resultado soma dos números é: " + soma);

        sc.close();
    }
}
