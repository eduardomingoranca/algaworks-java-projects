package com.brazil.algaworks.interfaces.impressao.impressoras;

import com.brazil.algaworks.interfaces.impressao.Impressora;
import com.brazil.algaworks.interfaces.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora {

    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.println("*********************************");
        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println("*********************************");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("==         EPSON               ==");
        System.out.println("---------------------------------");
    }

}
