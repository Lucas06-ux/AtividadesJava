package br.com.alura.media;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva a primeira nota do aluno: ");
        nota1 = leia.nextDouble();

        System.out.println("Escreva a segunda nota: ");
        nota2 = leia.nextDouble();

        System.out.println("Por fim, escreva a última nota conquistada pelo aluno: ");
        nota3 = leia.nextDouble();

        double mediaNota = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média final foi: " +mediaNota);

    }
}
