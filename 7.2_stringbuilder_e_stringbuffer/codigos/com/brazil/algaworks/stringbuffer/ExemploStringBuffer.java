package com.brazil.algaworks.stringbuffer;

public class ExemploStringBuffer {

    public static void main(String[] args) {
        /**
         * StringBuffer eh mutavel ao contrario do String
         * que cria outra String para ser alterado
         * *****************************************************************
         * Qual a diferenca entre StringBuffer e StringBuilder?
         * a diferenca eh que o StringBuilder nao eh thread-safe e
         * StringBuffer eh thread-safe, ou seja, caso esteja trabalhando
         * em um programa multi-thread que vai acessar o StringBuilder e
         * o StringBuffer ao mesmo tempo e vai alterar ao mesmo tempo
         * tendo uma concorrencia, deve-se utilizar o StringBuffer porque
         * ele eh thread-safe.
         * *****************************************************************
         */
//        StringBuffer sb = new StringBuffer(); // thread-safe - use no contexto de concorrencia
        StringBuilder sb = new StringBuilder(); // not-thread-safe - mais rapido

        sb.append("Bem vindo ao curso de java. ");
        sb.append("Fique a vontade para tirar suas duvidas. ");
        sb.append("Estamos aqui para te ajudar. ");

        System.out.println(sb.toString());

        sb.insert(26, " da Algaworks");

        System.out.println(sb);
    }
}
