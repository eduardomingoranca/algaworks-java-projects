package com.brazil.algaworks.modificadorstatic;

import static com.brazil.algaworks.modificadorstatic.Contador.COUNT;
import static com.brazil.algaworks.modificadorstatic.Contador.imprimirContador;

public class TesteContador {

    public static void main(String[] args) {
        Contador c = new Contador();
        c.incrementar();

//        System.out.println(COUNT);

        COUNT++;
//        System.out.println(c.COUNT);

        imprimirContador();
    }

}
