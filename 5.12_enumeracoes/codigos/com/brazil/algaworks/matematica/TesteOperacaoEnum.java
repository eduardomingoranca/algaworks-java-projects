package com.brazil.algaworks.matematica;

import com.brazil.algaworks.matematica.enums.OperacaoAritmetica;

import static com.brazil.algaworks.matematica.enums.OperacaoAritmetica.ADICAO;

public class TesteOperacaoEnum {

    public static void main(String[] args) {
        OperacaoAritmetica op1 = ADICAO;

        int resultado1 = op1.operacao(5, 3);

        System.out.println("O resultado eh: " + resultado1);

        for (OperacaoAritmetica op : OperacaoAritmetica.values()) {
            System.out.println(op + " -> " + op.operacao(4, 2));
        }
    }
}
