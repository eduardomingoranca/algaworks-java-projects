package com.brazil.algaworks.desafio.financeiro;

import static com.brazil.algaworks.desafio.financeiro.SituacaoConta.CANCELADA;
import static com.brazil.algaworks.desafio.financeiro.SituacaoConta.PAGA;

public class Conta {

    protected String descricao;
    protected Double valor;
    protected String dataVencimento;
    protected SituacaoConta situacaoConta;

    public Conta() { }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public void cancelar() {
        if (PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi paga: "
                    + this.getDescricao() + ".");
        } else if (CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi cancelada: "
                    + this.getDescricao() + ".");
        }
        System.out.println("Cancelando conta " + this.getDescricao() + ".");

        // altera situação da conta para CANCELADA
        this.situacaoConta = CANCELADA;
    }

}
