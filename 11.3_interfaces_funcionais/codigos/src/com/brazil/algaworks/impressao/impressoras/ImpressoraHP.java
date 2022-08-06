package com.brazil.algaworks.impressao.impressoras;

import com.brazil.algaworks.compra.Compra;
import com.brazil.algaworks.impressao.Impressora;

public class ImpressoraHP implements Impressora {

    @Override
    public void imprimir(Compra compra) {
        System.out.println("Enviando o comando para a impressora HP -> " + compra);
    }

}
