package com.brazil.algaworks.desafio;

public class RelatorioContas {

    public void exibirListagem(Conta[] contas) {
        System.out.println("**************************");
        System.out.println("*** LISTAGEM DE CONTAS ***");
        System.out.println("**************************");

        for (Conta conta : contas) {
            if (conta.situacaoConta == null) {
                conta.situacaoConta = SituacaoConta.PENDENTE;
            }
            conta.exibirDetalhes();
        }
    }
}
