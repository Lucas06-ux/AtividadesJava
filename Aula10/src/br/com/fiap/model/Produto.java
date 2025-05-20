package br.com.fiap.model;

public class Produto {
    private double preco;
    private int quantidade;
    private String nome;

    public double calcularDesconto(int porcentagem){
        double valor = preco - ((preco/100) * porcentagem);
        return valor;
    }
    public double calcularDesconto(int quantidade, boolean parcelado){
        int porcentagem = 0;
        if(quantidade > 5){
            porcentagem = 20;
        } else{
            porcentagem = 5;
        }
        if (!parcelado){
            porcentagem += 5;
        }
        return calcularDesconto(porcentagem);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
