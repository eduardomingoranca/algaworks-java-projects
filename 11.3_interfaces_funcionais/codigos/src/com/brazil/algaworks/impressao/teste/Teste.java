package com.brazil.algaworks.impressao.teste;

import com.brazil.algaworks.compra.Compra;
import com.brazil.algaworks.impressao.Impressora;
import com.brazil.algaworks.impressao.impressoras.ImpressoraHP;

public class Teste {

    public static void main(String[] args) {
//        Impressora i = new ImpressoraHP();

        Impressora i = (c) -> System.out.println("Simulando a impressao. Seria impresso: " + c);

        Compra compra = new Compra("Sabonete", 2.5);
        i.imprimir(compra);
    }
}
