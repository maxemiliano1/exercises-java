package exercises.poo.bankaccount.application;

import exercises.poo.bankaccount.entity.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, name, initialDeposit);
        } else {
            account = new Account(number, name);
        }

        System.out.println("\nAccount data:");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated account data:\n" + account);

        System.out.print("\nEnter a withdraw value: ");
        account.withdraw(sc.nextDouble());
        System.out.println("Updated account data:\n" + account);

        sc.close();
    }
}