package Exercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Insira o valor do produto");
        Scanner scanner = new Scanner(System.in);
        float Valor = scanner.nextFloat();

        System.out.println("Insira o valor da taxa que será aplicada no produto");
        float Taxa = scanner.nextFloat();
        float ValorTaxa = SomaImposto(Taxa, Valor);
        float ValorFinal =  alterar(ValorTaxa, Valor);
        System.out.println("O valor do produto é: R$" + ValorFinal);
    }
    static float SomaImposto(float TaxaImposto, float custoProduto){
        return custoProduto * (TaxaImposto/100);
    }
    static float alterar(float ValorTaxa, float CustoProduto){
        return ValorTaxa + CustoProduto;
    }
}
