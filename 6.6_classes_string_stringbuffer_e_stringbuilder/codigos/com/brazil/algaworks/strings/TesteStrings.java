package com.brazil.algaworks.strings;

public class TesteStrings {

    public static void main(String[] args) {
        // String, StringBuilder e StringBuffer

        // String cria duas variaveis na memoria
        String s = "Ola"; // Criada na memoria a String "Ola"
        s = s + " Pessoal!"; // Criada na memoria a String "Ola Pessoal!"

        System.out.println(s);

        // StringBuilder e StringBuffer cria uma unica variavel na memoria e a reaproveita
        StringBuilder stringBuilder = new StringBuilder("Ola"); // Existe a StringBuilder
        stringBuilder.append(" Pessoal!"); // Reaproveitando a StringBuilder

        String resultado = stringBuilder.toString();

        System.out.println("Com StringBuilder: " + resultado);

        StringBuffer stringBuffer = new StringBuffer("Ola");
        stringBuffer.append(" Pessoal!");

        System.out.println("Com StringBuffer: " + stringBuffer);

        /**
         * Qual a diferenca entre StringBuilder e StringBuffer?
         * StringBuilder nao eh protegida em relacao a treads, ou seja,
         * quando se tem muito acesso concorrente as operacoes no StringBuilder
         * podem dar problemas
         */
    }

}
