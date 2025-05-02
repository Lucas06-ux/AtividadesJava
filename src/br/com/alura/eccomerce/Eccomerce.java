package br.com.alura.eccomerce;

import java.util.Scanner;

public class Eccomerce {

    public static void main(String[] args) {
        String produto;
        double preço;

        System.out.println("Seja muito bem vindo ao nosso eccomerce!");
        Scanner leia =  new Scanner(System.in);

        System.out.println("Diga o nome do produto que deseja: ");
        produto = leia.next() + leia.nextLine();

        System.out.println("Para saber a categoria do produto, fale o preço dele: ");
        preço = leia.nextDouble();

        if (preço <= 50){
            System.out.println("A categoria do(a) " + produto + " é 'Econômico' pois o valor de R$" + preço + " se encaixa nessa categoria");
        } else if (preço > 50 && preço <=200) {
            System.out.println("A categoria do(a) " + produto + " é 'Intermediário' pois o valor de R$" +preço +" se encaixa nessa categoria");
        }else {
            System.out.println("A categoria do(a) " + produto + " é 'Premium' pois o valor de R$" +preço +" se encaixa nessa categoria");
        }

    }
}
