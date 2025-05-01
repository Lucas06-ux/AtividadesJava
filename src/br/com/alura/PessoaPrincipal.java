package br.com.alura;

import java.util.Scanner;

public class PessoaPrincipal {

    public static void main(String[] args) {
        String nome;
        int idade;
        double altura;
        boolean estudante;

        Scanner leitor =  new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        nome = leitor.next() + leitor.nextLine();

        System.out.println("Qual é a sua idade?: ");
        idade = leitor.nextInt();

        System.out.println("Qual a sua altura em metros?: ");
        altura = leitor.nextDouble();

        System.out.println("Você é estudante?: ");
        estudante = leitor.nextBoolean();

        System.out.println("Seja muito bem vindo(a) " + nome + ", ficamos muito felizes de ter você por aqui!");


    }
}
