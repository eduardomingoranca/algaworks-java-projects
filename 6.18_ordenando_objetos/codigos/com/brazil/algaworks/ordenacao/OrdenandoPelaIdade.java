package com.brazil.algaworks.ordenacao;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.sort;

public class OrdenandoPelaIdade {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("John", 22);
        Pessoa p2 = new Pessoa("Alice", 23);
        Pessoa p3 = new Pessoa("Brian", 21);

        List<Pessoa> pessoas = asList(p1, p2, p3);
        IdadeComparator idadeComparator = new IdadeComparator();
        sort(pessoas, idadeComparator);

//        pessoas.sort(idadeComparator);
//        pessoas.forEach(System.out::println);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
