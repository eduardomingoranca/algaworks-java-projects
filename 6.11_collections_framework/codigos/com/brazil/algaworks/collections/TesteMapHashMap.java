package com.brazil.algaworks.collections;

import java.util.HashMap;
import java.util.Map;

public class TesteMapHashMap {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("John Hammond");
        Aluno aluno2 = new Aluno("Mary Calhoun");
        Aluno aluno3 = new Aluno("Joseph Bolton");
        Aluno aluno4 = new Aluno("Peter Firstley");

        Map<String, Aluno> alunos = new HashMap<>();

        alunos.put("1", aluno1);
        alunos.put("2", aluno2);
        alunos.put("3", aluno3);
        alunos.put("4", aluno4);
        alunos.put("5", aluno4);

        imprimirAlunos(alunos);

        Aluno alunoRecuperado = alunos.get("3");
        System.out.println("Aluno de chave 3: " + alunoRecuperado.getName());
    }

    private static void imprimirAlunos(Map<String, Aluno> alunos) {
        for (Aluno aluno : alunos.values()) {
            System.out.println("Nome: " + aluno.getName());
        }
    }

}
