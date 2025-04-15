package br.com.fiap.veiculos.teste;

import br.com.fiap.veiculos.model.Aviao;
import br.com.fiap.veiculos.model.Cor;

public class AviaoTeste {
    public static void main(String[] args) {
        //instanciar um avião
        Aviao aviao = new Aviao();
        // colocar informações no avião
        Cor cor = new Cor();
        cor.alterarCor(255, 255, 255, "Branco");
        aviao.setModelo("14 BIS ");
        aviao.setQuantidadeLugares(2);
        aviao.setPrefixo("Asa do avião");
        aviao.setComprimento(9.6);
        aviao.setAnoFabricacao(1906);
        aviao.setCor(cor);
        aviao.setQuantidadeTurbinas(0);


        //Exibir as informações de avião
        System.out.println(aviao.getModelo());
        System.out.println(aviao.getQuantidadeLugares());
        System.out.println(aviao.getPrefixo());
        System.out.println(aviao.getComprimento());
        System.out.println(aviao.getAnoFabricacao());
        System.out.println(aviao.getQuantidadeTurbinas());
        System.out.println(aviao.getCor().getNome());
    }
}
