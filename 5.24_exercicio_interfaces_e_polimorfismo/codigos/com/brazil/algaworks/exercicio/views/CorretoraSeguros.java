package com.brazil.algaworks.exercicio.views;

import com.brazil.algaworks.exercicio.interfaces.Seguravel;

public class CorretoraSeguros {

    public void fazerPropostaSeguro(Seguravel objetoSeguravel) {
        System.out.println("-------------------------------");
        System.out.println("Corretora de Seguros - Proposta");
        System.out.println("-------------------------------");
        System.out.println(objetoSeguravel.obterDescricao());
        System.out.println("Valor da apólice: " + objetoSeguravel.calcularValorApolice());
        System.out.println("-------------------------------\n");
    }

}
