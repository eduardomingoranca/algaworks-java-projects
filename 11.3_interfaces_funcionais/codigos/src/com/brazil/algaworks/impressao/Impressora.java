package com.brazil.algaworks.impressao;

import com.brazil.algaworks.compra.Compra;

@FunctionalInterface
public interface Impressora {
    void imprimir(Compra compra);

}
