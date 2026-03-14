package exercises.logic;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //data entry

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        //data output

        int diference = a * b - c * d;

        System.out.println("Diferença = " + diference);


    }
}
