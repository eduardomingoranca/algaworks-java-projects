package com.brazil.algaworks.sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto {

    protected Date dataValidade;

    public void identificar() {
        // executando o metodo da classe mae
        super.identificar();
        System.out.println("Minha data de validade eh: " + dataValidade);
    }
}
