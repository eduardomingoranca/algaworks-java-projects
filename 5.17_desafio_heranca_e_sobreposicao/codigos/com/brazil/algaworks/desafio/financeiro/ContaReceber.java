package com.brazil.algaworks.desafio.financeiro;

import static com.brazil.algaworks.desafio.financeiro.SituacaoConta.CANCELADA;
import static com.brazil.algaworks.desafio.financeiro.SituacaoConta.PAGA;

public class ContaReceber extends Conta {

    protected Cliente cliente;

    public ContaReceber() {
    }

    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void cancelar() {
        if (PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi paga: "
                    + this.getDescricao() + ".");
        } else if (CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi cancelada: "
                    + this.getDescricao() + ".");
        } else if (getValor() > 50000.00) {
            System.out.println("Nao pode cancelar uma conta com o valor maior que R$ 50000.00");
        }
        System.out.println("Cancelando conta " + this.getDescricao() + ".");

        // altera situação da conta para CANCELADA
        this.situacaoConta = CANCELADA;
    }

    public void receber() {
        System.out.println("O cliente " + getCliente().getNome() + " recebeu o produto " + getDescricao() + " na data " + getDataVencimento());
    }

}
