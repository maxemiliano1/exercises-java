package exercises.conditional;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("NEGATIVO");
        }
        sc.close();
    }
}