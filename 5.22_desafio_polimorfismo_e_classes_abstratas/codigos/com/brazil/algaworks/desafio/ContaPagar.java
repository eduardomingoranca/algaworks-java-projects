package com.brazil.algaworks.desafio;

import static com.brazil.algaworks.desafio.SituacaoConta.CANCELADA;
import static com.brazil.algaworks.desafio.SituacaoConta.PAGA;

public class ContaPagar extends Conta {

    protected Fornecedor fornecedor;

    public ContaPagar() {
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("\nConta a Pagar");
        System.out.println("===================================");
        System.out.println("Fornecedor: " + this.getFornecedor().getNome());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Valor: R$ " + this.getValor());
        System.out.println("Data de vencimento: " + this.getDataVencimento());
        System.out.println("Situacao: " + this.getSituacaoConta());
        System.out.println("===================================");
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
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

}
