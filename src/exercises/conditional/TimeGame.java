package exercises.conditional;

import java.util.Scanner;

public class TimeGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int timer = sc.nextInt();
        int timer2 = sc.nextInt();

        if (timer2 > timer) {
            System.out.println("O JOGO DUROU " + (timer2 - timer) + " HORA(S)");
        } else if (timer2 < timer) {
            System.out.println("O JOGO DUROU " + (timer2 + (24 - timer)) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        sc.close();
    }
}
