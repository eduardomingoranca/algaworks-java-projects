package com.brazil.algaworks.arquivosjar;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Principal {

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
