package com.brazil.algaworks.util;

import static java.lang.Math.pow;

public class MatematicaUtil {

    public static double PI = 3.14;

    public static int calcularFibonacci(int posicao) {
        if (posicao < 2) {
            return posicao;
        }
        return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
    }

    public static double calcularAreaCirculo(double raio) {
        return pow(raio, 2) * PI;
    }
}
