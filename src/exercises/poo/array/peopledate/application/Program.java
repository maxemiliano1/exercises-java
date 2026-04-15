package exercises.poo.array.peopledate.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");

        int n = sc.nextInt();

        double[] heightPeople = new double[n];
        char[] sex = new char[n];

        for (int i = 0; i < sex.length; i++) {
            System.out.printf("Altura da %d° pessoa: ", i + 1);
            heightPeople[i] = sc.nextDouble();
            System.out.printf("Genero da %d° pessoa: ", i + 1);
            sex[i] = sc.next().charAt(0);
        }

        double heightMenor = heightPeople[0];
        double heightMaior = heightPeople[0];
        double somaMulher = 0.0;
        int contMulher = 0;
        int contHomem = 0;

        for (int i = 0; i < sex.length; i++) {
            if (heightPeople[i] < heightMenor) {
                heightMenor = heightPeople[i];
            }
            if (heightPeople[i] > heightMaior) {
                heightMaior = heightPeople[i];
            }
            if (sex[i] == ('F')) {
                somaMulher += heightPeople[i];
                contMulher++;
            }
            if (sex[i] == 'M') {
                contHomem++;
            }
        }


        double mediaMulher = somaMulher / contMulher;


        System.out.printf("Menor altura = %.2f%n", heightMenor);
        System.out.printf("Maior altura = %.2f%n", heightMaior);
        System.out.printf("Media as Alturas das mulheres = %.2f%n", mediaMulher);
        System.out.println("Numero de homens = " + contHomem);


        sc.close();
    }
}