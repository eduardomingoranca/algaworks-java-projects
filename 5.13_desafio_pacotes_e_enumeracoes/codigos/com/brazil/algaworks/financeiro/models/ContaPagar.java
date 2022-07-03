package com.brazil.algaworks.financeiro.models;

import com.brazil.algaworks.financeiro.enums.SituacaoConta;

import static com.brazil.algaworks.financeiro.enums.SituacaoConta.*;

public class ContaPagar {

    private String descricao;
    private Double valor;
    private String dataVencimento;
    private Fornecedor fornecedor;
    private SituacaoConta situacaoConta;

    public ContaPagar() {
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.situacaoConta = PENDENTE;
    }

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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public void pagar() {
        if (PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que já está paga: "
                    + this.getDescricao() + ".");
        } else if (CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que está cancelada: "
                    + this.getDescricao() + ".");
        }
        System.out.println("Pagando conta " + this.getDescricao() + " no valor de R$ "
                + this.getValor() + " e vencimento em " + this.getDataVencimento()
                + " do fornecedor " + this.getFornecedor().getNome() + ".");

        // altera situação da conta para PAGA
        this.situacaoConta = PAGA;
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
