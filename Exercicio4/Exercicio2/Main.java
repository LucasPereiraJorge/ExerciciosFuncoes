package Exercicio2;

import java.util.Scanner;

public class Main {

    public static void repetição(int NumRepetições) {
        for (int i = 0; i < NumRepetições; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print((j + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, insira o número de repetições");
        int NumRepeti = scanner.nextInt();
        repetição(NumRepeti);
    }
}
