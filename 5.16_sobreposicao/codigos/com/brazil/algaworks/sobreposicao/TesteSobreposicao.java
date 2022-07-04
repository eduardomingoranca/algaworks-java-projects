package com.brazil.algaworks.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {

    public static void main(String[] args) {
        ProdutoPerecivel perecivel = new ProdutoPerecivel();
        perecivel.descricao = "Caixa de fosforo";
        perecivel.dataValidade = new Date();
        perecivel.identificar();
    }
}
