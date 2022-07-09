package com.brazil.algaworks.equalshashcode;

import java.util.Set;

import static com.brazil.algaworks.equalshashcode.SimuladorBancoDeDados.buscarAlunos;

public class TesteSetHashSet {

    public static void main(String[] args) {
        Set<Aluno> alunos = buscarAlunos();

        // De alguma forma, sorteia o nome do aluno e constroi o objeto Aluno
        Aluno alunoSorteado = new Aluno("Mary");

        if (alunos.contains(alunoSorteado)) {
            System.out.println("Parabens " + alunoSorteado.getNome() + "! Voce ganhou um brinde!");
        } else {
            System.out.println("Aluno nao cadastrado no banco de dados.");
        }

    }

}
