package Exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Insira o número");
        Scanner scanner = new Scanner(System.in);
        Float NumeroDigiado = scanner.nextFloat();
        PositivoOuNEgativo(NumeroDigiado);

    }
    private static void PositivoOuNEgativo(float NumeroDigitado){
        if (NumeroDigitado > 0){
            System.out.println("O numéro inserido é positivo");

        }else if (NumeroDigitado < 0){
            System.out.println("O número inserido é negativo");

        } else {
            System.out.println(NumeroDigitado = 0);
        }
    }

}
