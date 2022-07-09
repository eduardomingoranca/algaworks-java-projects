package com.brazil.algaworks.desafio;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Informe um valor R$: ");
            double valor = scanner.nextDouble();

            int percentage = 10;

            DecimalFormat format = new DecimalFormat("R$ 0.00");
            BigDecimal bg = new BigDecimal(valor);
            BigDecimal percentageAmount = bg.multiply(new BigDecimal(percentage/100.0));

            System.out.println(format.format(percentageAmount));
        } catch(InputMismatchException e) {
            System.out.println("Informe um numero");
        }

        scanner.close();
    }

}
