package com.brazil.algaworks.generics;

import java.util.List;

public class RetiraElementos {

    public static <T> T recuperaPrimeiro(List<T> lista) {
        return lista.get(0);
    }

}
