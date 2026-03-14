package exercises.conditional;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int number2 = sc.nextInt();

        if (number % number2 == 0 || number2 % number == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}
