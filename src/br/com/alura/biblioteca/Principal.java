package br.com.alura.biblioteca;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner bola = new Scanner(System.in);

        System.out.println("Digite o nome do livro: ");
        String titulo = bola.next() + bola.nextLine();

        System.out.println("Escreva o nome do autor do livro: ");
        String autor = bola.next() + bola.nextLine();

        System.out.println("Diga o número de páginas do livro: ");
        int paginas = bola.nextInt();

        System.out.println("Fale o valor do livro: ");
        double preco = bola.nextDouble();

        System.out.println("Com a inicial, fale qual a categoria do livro: ");
        String categoria = bola.next() + bola.nextLine();

        String categoriaDescricao;


        Livro livro1 = new Livro();

        livro1.titulo = titulo;
        livro1.autor = autor;
        livro1.paginas = paginas;
        livro1.preco = preco;
        livro1.categoria = categoria;

        System.out.println("Nome do livro: " + livro1.titulo);
        System.out.println("Autor do livro: " + livro1.autor);
        System.out.println("O livro tem " +livro1.paginas + " páginas!");
        System.out.println("O livro custa R$"+ livro1.preco);
        System.out.println("A categoria dele é " + livro1.categoria);

        if (categoria.equalsIgnoreCase("F")) {
            categoriaDescricao = "Ficção";
        } else if (categoria.equalsIgnoreCase("N")) {
            categoriaDescricao = "Não-ficção";
        } else if (categoria.equalsIgnoreCase("T")) {
            categoriaDescricao = "Tecnologia";
        } else if (categoria.equalsIgnoreCase("H")) {
            categoriaDescricao = "História";
        } else {
            categoriaDescricao = "Categoria inválida";
        }


        System.out.println("Livro cadastrado: \"" + titulo + "\", de " + autor + ". Ele possui " + paginas + " páginas, custa R$" + preco + " e pertence à categoria " + categoriaDescricao + ".");







    }
}
