package com.brazil.algaworks.collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("John Hammond");
        Aluno aluno2 = new Aluno("Mary Calhoun");
        Aluno aluno3 = new Aluno("Joseph Bolton");
        Aluno aluno4 = new Aluno("Peter Firstley");

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);

        imprimirAlunos(alunos);
    }

    public static void imprimirAlunos(List<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getName());
        }
    }

}
