package exercises.repetition.fors;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fat = 1;

        for (int i = n; i > 0; i--) {
            fat *= i;
        }

        System.out.println(fat);

        sc.close();
    }
}
