package Exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Insira o primeiro número");
        float PrimeiroNumeroDigitado = scanner.nextFloat();

        System.out.println("insira o segundo número");
        float SegundoNumeroDigitado = scanner.nextFloat();

        System.out.println("Insira o terceiro número");
        float TerceiroNumeroDigitado = scanner.nextFloat();

        System.out.println(SomaNumeros(PrimeiroNumeroDigitado, SegundoNumeroDigitado, TerceiroNumeroDigitado));
    }

    static float SomaNumeros(float PrimeiroNumero, float SegundoNumero, float TerceiroNumero){
        System.out.println("A soma dos números foi igual a: ");
        return (PrimeiroNumero + SegundoNumero + TerceiroNumero);
    }
}
