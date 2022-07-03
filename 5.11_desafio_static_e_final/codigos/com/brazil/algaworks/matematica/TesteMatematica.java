package com.brazil.algaworks.matematica;

import static com.brazil.algaworks.util.MatematicaUtil.calcularAreaCirculo;
import static com.brazil.algaworks.util.MatematicaUtil.calcularFibonacci;

public class TesteMatematica {

    public static void main(String[] args) {
        int numeroFibonacci = calcularFibonacci(8);
        System.out.println("Número de Fibonacci da posição 8: " + numeroFibonacci);

        double areaCirculo = calcularAreaCirculo(104.8);
        System.out.println("Área do círculo: " + areaCirculo);
    }
}
