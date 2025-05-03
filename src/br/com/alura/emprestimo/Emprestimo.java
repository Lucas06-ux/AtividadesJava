package br.com.alura.emprestimo;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valorEmprestimo;

        System.out.println("Digite o valor que deseja pegar de empréstimo:");
        valorEmprestimo = leia.nextDouble();

        if (valorEmprestimo >= 1000 && valorEmprestimo <= 5000){
            System.out.println("O valor de R$"+ valorEmprestimo + " está dentro do intervalo permitido para empréstimo");
        } else {
            System.out.println("O valor de R$"+ valorEmprestimo + " não está dentro do intervalo permitido para empréstimo");
        }
    }
}
