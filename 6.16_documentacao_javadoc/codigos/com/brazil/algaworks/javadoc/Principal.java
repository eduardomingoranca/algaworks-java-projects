package com.brazil.algaworks.javadoc;

import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Essa classe eh util para fazer o calculo do IMC
 * 0 IMC eh baseado no peso e altura da pessoa.
 *
 * @author eduardo
 *
 */
public class Principal {

    /**
     * O metodo principal faz o calculo do IMC
     *
     *
     * @param args Recebe a entrada de dados da linha de comando
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o peso: ");
        double peso = scanner.nextDouble();

        System.out.println();

        System.out.print("Informe a altura: ");
        double altura = scanner.nextDouble();

        System.out.println();

        double imc = peso / pow(altura, 2);
        System.out.println(" O IMC eh: " + imc);

        scanner.close();
    }

}
