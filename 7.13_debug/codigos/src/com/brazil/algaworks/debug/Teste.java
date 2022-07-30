package com.brazil.algaworks.debug;

public class Teste {

    public static void main(String[] args) {
        long posicao = 6;
        long valor = Fibonacci.calcula(posicao);

        System.out.println("F(" + posicao + ") = " + valor);
    }
}
