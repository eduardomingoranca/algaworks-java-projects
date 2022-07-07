package com.brazil.algaworks.exercicio.models;

import com.brazil.algaworks.exercicio.interfaces.Seguravel;

public class Notebook implements Seguravel {

    private double valorMercado;

    private int anoFabricacao;

    public Notebook(double valorMercado, int anoFabricacao) {
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public double calcularValorApolice() {
        // cálculos fictícios do valor de uma apólice de um notebook
        double valorApolice = this.valorMercado * 0.04;
        if (anoFabricacao < 2000) {
            valorApolice = valorApolice * 0.90;
        }
        return valorApolice;
    }

    @Override
    public String obterDescricao() {
        return "Notebook ano " + this.anoFabricacao + " com valor de mercado "
                + this.valorMercado;
    }
}
