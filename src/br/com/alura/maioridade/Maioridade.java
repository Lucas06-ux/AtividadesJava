package br.com.alura.maioridade;

import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        int idade;
        String mensagem;
        System.out.println("Digite a sua idade: ");
        Scanner leia = new Scanner(System.in);
        idade = leia.nextInt();

        if (idade >= 18){
            mensagem = "Você já é maior de idade pois tem " + idade + " anos";
        }
        else{
            mensagem = "Você ainda é menor de idade pois tem " + idade + " anos";
        }
        System.out.println(mensagem);
    }

}
