package Exercicio9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        String numeroInteiro = String.valueOf(myScanner.nextInt());
        String[] digitosSeparados = numeroInteiro.split("");
        for (int i = (digitosSeparados.length-1); i>=0; i--){
            System.out.print(digitosSeparados[i]);
        }
    }
}