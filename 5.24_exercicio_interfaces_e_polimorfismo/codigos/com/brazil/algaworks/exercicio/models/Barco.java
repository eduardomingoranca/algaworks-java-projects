package com.brazil.algaworks.exercicio.models;

import com.brazil.algaworks.exercicio.interfaces.Seguravel;

public class Barco implements Seguravel {
    private double valorMercado;
    private int anoFabricacao;

    public Barco(double valorMercado, int anoFabricacao) {
        this.valorMercado = valorMercado;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public double calcularValorApolice() {
        // cálculos fictícios do valor de uma apólice de um barco
        double valorApolice = this.valorMercado * 0.05;
        if (anoFabricacao < 2017) {
            valorApolice = valorApolice * 1.00;
        }
        return valorApolice;
    }

    @Override
    public String obterDescricao() {
        return "Barco ano " + this.anoFabricacao + " com valor de mercado "
                + this.valorMercado;
    }

}
