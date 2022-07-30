package com.brazil.algaworks.testesjunit;

public class Fibonacci {

    public long calcular(long posicao) {
        if (posicao <= 1)
            return posicao;

        return calcular(posicao - 1) + calcular(posicao - 2);
    }
}
