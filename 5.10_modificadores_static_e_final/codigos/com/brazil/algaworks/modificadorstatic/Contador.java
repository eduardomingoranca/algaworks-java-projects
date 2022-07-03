package com.brazil.algaworks.modificadorstatic;

public class Contador {

    public static int COUNT = 0;

    // final -> informa que a variavel eh uma constante, ou seja, o valor nao muda
    public static final double PI = 3.14;
    public void incrementar() {
        COUNT++;
    }

    public static void imprimirContador() {
        System.out.println("O valor do contador agora eh: " + COUNT);
    }


}
