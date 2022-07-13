package com.brazil.algaworks.ordenacao;

import java.util.Comparator;

public class IdadeComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa o1, Pessoa o2) {
        if (o1.getIdade() < o2.getIdade()) {
            return -1;
        } else if (o1.getIdade() > o2.getIdade()) {
            return 1;
        }
        return 0;
    }

}
