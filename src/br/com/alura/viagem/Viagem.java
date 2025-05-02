package br.com.alura.viagem;

import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        double consumoMedio;
        double capacidadeTanque;
        double combustivelAtual;
        double distanciaViagem;

        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos km por litro o seu carro faz?");
        consumoMedio = leia.nextDouble();

        System.out.println("Seu tanque tem capacidade para quantos litros?");
        capacidadeTanque = leia.nextDouble();

        System.out.println("Você tem quantos litros disponíveis agora?");
        combustivelAtual = leia.nextDouble();

        System.out.println("Quantos km tem a sua viagem?");
        distanciaViagem = leia.nextDouble();

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.printf("Autonomia máxima do veículo: %.1f km%n", autonomiaMaxima);
        System.out.printf("Autonomia atual: %.1f km%n", autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        } else {
            System.out.println("Atenção! Você precisará abastecer antes de concluir a viagem.");
        }
    }
}
