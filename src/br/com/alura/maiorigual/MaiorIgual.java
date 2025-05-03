package br.com.alura.maiorigual;

import java.util.Scanner;

public class MaiorIgual {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome;
        int numero;
        int numero2;
        System.out.println("Olá, digite o seu nome");
        nome = leia.next() + leia.nextLine();

        System.out.println("Digite o primeiro número");
        numero = leia.nextInt();

        System.out.println("Agora digite o segundo número");
        numero2 = leia.nextInt();

        if (numero < numero2){
            System.out.println("Olá " + nome + ", o número " + numero + " é menor que o número " + numero2);
        } else if (numero > numero2) {
            System.out.println("Olá " + nome + ", o número " + numero + " é maior que o número " + numero2);
        }
        else {
            System.out.println("Os números são iguais");
        }
    }
}
