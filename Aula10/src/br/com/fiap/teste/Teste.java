package br.com.fiap.teste;

import br.com.fiap.model.Produto;

public class Teste {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setPreco(100);

        System.out.println(produto.calcularDesconto(10));
    }

}
