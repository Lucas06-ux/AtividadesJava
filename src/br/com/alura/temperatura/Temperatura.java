package br.com.alura.temperatura;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        int celsius;
        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva a temperatura de hoje, em graus celsius para saber o valor em Farenheit: ");
        celsius = leia.nextInt();

        double farenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em graus Farenheit é " + farenheit);

    }
}
