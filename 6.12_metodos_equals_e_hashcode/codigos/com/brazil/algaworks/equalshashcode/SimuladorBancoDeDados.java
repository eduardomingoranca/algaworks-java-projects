package com.brazil.algaworks.equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class SimuladorBancoDeDados {

    public static Set<Aluno> buscarAlunos() {
        Set<Aluno> alunos = new HashSet<>();
        alunos.add(new Aluno("Richard"));
        alunos.add(new Aluno("James"));
        alunos.add(new Aluno("Mary"));

        return alunos;
    }

}
