package com.brazil.algaworks.javadoc;

import com.brazil.algaworks.javadoc.modelo.Funcionario;

public class Teste {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("John Hopkins", 3000);

        System.out.println(funcionario.adiantamentoViagem(5, true));
    }
}
