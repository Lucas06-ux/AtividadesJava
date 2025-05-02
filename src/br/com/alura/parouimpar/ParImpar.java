package br.com.alura.parouimpar;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int numero;

        System.out.println("Olá! Aqui voce irá descobrir e entender porque um número é par ou ímpar!");
        Scanner leia = new Scanner(System.in);

        System.out.println("Por favor, digite um número inteiro: ");
        numero = leia.nextInt();

        if (numero %2 ==0){
            System.out.println("O número " + numero + " é par, pois dividindo pelo 2, o resultado da divisão é 0, sendo assim, um número par");
        } else {
            System.out.println("O número " + numero + " é ímpar, pois dividindo pelo 2, o resultado da divisão não é 0, sendo assim, um número ímpar");
        }
    }
}
