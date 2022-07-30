package com.brazil.algaworks.testesjunit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void init() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void deveRetornarFibonacciPosicao1() {
        // 1.Cenario
        long posicao = 1L;

        // 2.Acao
        long valor = fibonacci.calcular(posicao);

        // 3.Validacao
        assertEquals(1L, valor);
    }

    @Test
    public void deveRetornarFibonacciPosicao2() {
        // 1.Cenario
        long posicao = 2L;

        // 2.Acao
        long valor = fibonacci.calcular(posicao);

        // 3.Validacao
        assertEquals(1L, valor);
    }

    @Test
    public void deveRetornarFibonacciPosicaoO() {
        // 1.Cenario
        long posicao = 0L;

        // 2.Acao
        long valor = fibonacci.calcular(posicao);

        // 3.Validacao
        assertEquals(0L, valor);
    }

}