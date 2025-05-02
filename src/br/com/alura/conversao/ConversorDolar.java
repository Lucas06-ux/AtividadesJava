package br.com.alura.conversao;

import java.util.Scanner;

public class ConversorDolar {
    public static void main(String[] args) {
        double valorEmReais;
        double taxa = 5.25;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor em reais, que você deseja converter para o dólar: ");
        valorEmReais = leia.nextDouble();

        double valorEmDolar = valorEmReais / taxa;

        System.out.println("O valor em dólar é de US$"+valorEmDolar);

    }
}
