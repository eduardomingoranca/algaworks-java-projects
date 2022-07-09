package com.brazil.algaworks.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {

    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("R$ #,##0.00");
        double valorProduto = 13.59;

        System.out.println(valorProduto);
        System.out.println(format.format(valorProduto));

        String input = "R$ 50,34";
        try {
            double numero = format.parse(input).doubleValue();
            System.out.println("Numero: " + numero);
        } catch (ParseException e) {
            System.out.println("Entrada invalida.");
        }

        BigDecimal bigDecimal = new BigDecimal(5131231231000d);
        bigDecimal = bigDecimal.divide(BigDecimal.TEN);

        System.out.println(bigDecimal);
    }

}
