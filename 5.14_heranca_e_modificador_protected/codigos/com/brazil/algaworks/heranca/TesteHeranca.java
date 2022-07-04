package com.brazil.algaworks.heranca;

public class TesteHeranca {

    public static void main(String[] args) {
        Jogador j = new Jogador();
        j.nome = "Ronald";
        j.idade = 33;

        j.seApresentar();
        j.dizerSeAindaJoga();
    }
}
