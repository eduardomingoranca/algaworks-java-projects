package com.brazil.algaworks.excecoes;

public class TesteExcecoes {

    public static void main(String[] args) {
//        int numero = 5 / 0; // java.lang.ArithmeticException
//        String s = "Um texto";
//        s = null;
//        String maiuscula = s.toLowerCase(); // java.lang.NullPointerException

        ContaCorrente contaCorrente = new ContaCorrente(100);

        try {
            contaCorrente.depositar(-10);
            // varias linhas de codigo...
        } catch (IllegalArgumentException e) {
            System.out.println("Voce executou uma operacao ilegal " + e.getMessage());
        }

    }

}
