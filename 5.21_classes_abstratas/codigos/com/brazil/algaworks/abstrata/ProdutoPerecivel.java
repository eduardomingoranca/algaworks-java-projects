package com.brazil.algaworks.abstrata;

public class ProdutoPerecivel extends Produto {
    String dataValidade;

    @Override
    public void imprimirDescricao() {
        // Digitar a logica...
        System.out.println("Descricao: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
    }
}
