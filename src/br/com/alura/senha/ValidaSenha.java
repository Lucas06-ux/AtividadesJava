package br.com.alura.senha;

import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        String senha;
        String confirmarSenha;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        senha = scanner.next() + scanner.nextLine();

        System.out.println("Confirme a sua senha: ");
        confirmarSenha  = scanner.next() + scanner.nextLine();



        if (confirmarSenha.equals(senha)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

    }
}
