package br.com.alura.doador;

import java.util.Scanner;

public class DoadorSangue {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double idade;
        double peso;

        System.out.println("Informe a sua idade:");
        idade = leia.nextDouble();

        System.out.println("Informe seu peso:");
        peso = leia.nextDouble();

        if (idade >= 18 && idade <= 65 && peso > 50){
            System.out.println("Obrigado! Você atende os requisitos para se tornar um doador de sangue pois tem " + idade + " anos, e pesa " + peso +"kg!");
        } else {
            System.out.println("Sinto lhe informar, mas para ser doador de sangue é necessário ter entre 18 anos e 65 anos e pesar mais de 50kg!");
        }
    }
}
