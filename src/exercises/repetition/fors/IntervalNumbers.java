package exercises.repetition.fors;

import java.util.Scanner;

public class IntervalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int input = 0;
        int in = 0;
        int out = 0;

        for (int i = 0; i < number; i++) {
            input = sc.nextInt();
            if (input >= 10 && input <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();
    }
}
