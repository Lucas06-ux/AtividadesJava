package br.com.alura.desconto;

import java.util.Scanner;

public class VerificaDesconto {
    public static void main(String[] args) {
        double valor;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        valor = leia.nextDouble();

        if (valor >= 100.0){
            double desconto = valor * 0.10;
            double valorDesconto = valor - desconto;
            System.out.println("Voce recebeu um desconto de 10%. O novo valor agora é de R$"+valorDesconto);
        }else {
            System.out.println("Voce não recebeu descontos nessa compra. O valor final foi R$"+ valor);
        }
    }
}
