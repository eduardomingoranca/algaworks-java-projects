package com.brazil.algaworks.desafio;

import static com.brazil.algaworks.desafio.SituacaoConta.CANCELADA;
import static com.brazil.algaworks.desafio.SituacaoConta.PAGA;

public class ContaReceber extends Conta {

    protected Cliente cliente;

    public ContaReceber() {
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nConta a Receber");
        System.out.println("===================================");
        System.out.println("Cliente: " + this.getCliente().getNome());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Valor: R$ " + this.getValor());
        System.out.println("Data de vencimento: " + this.getDataVencimento());
        System.out.println("Situacao: " + this.getSituacaoConta());
        System.out.println("===================================");
    }

    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.cliente = cliente;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.situacaoConta = SituacaoConta.PENDENTE;
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
