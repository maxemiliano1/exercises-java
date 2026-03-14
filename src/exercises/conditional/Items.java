package exercises.conditional;

import java.util.Locale;
import java.util.Scanner;

public class Items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod = sc.nextInt();
        int und = sc.nextInt();

        if (cod == 1) {
            System.out.println("Total: R$ " + (und * 4.00));
        } else if (cod == 2) {
            System.out.println("Total: R$ " + (und * 4.50));
        } else if (cod == 3) {
            System.out.println("Total: R$ " + (und * 5.00));
        } else if (cod == 4) {
            System.out.println("Total: R$ " + (und * 2.00));
        } else if (cod == 5) {
            System.out.println("Total: R$ " + (und * 1.50));
        } else {
            System.out.println("Produto não encontrado");
        }
        sc.close();
    }
}
