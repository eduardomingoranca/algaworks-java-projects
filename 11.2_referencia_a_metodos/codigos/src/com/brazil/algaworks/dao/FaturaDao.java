package com.brazil.algaworks.dao;

import com.brazil.algaworks.model.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDao {

    public List<Fatura> buscarFaturasVencidas() {
        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura("john@mail.com", 350.00));
        faturas.add(new Fatura("mary@mail.com", 150.00));
        faturas.add(new Fatura("joseph@mail.com", 290.00));

        return faturas;
    }

}
