package com.brazil.algaworks.dao;

import com.brazil.algaworks.modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    // buscando no banco de dados
    public List<Fatura> buscarTodasFaturas() {
        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura("john@mail.com", 350.0));
        faturas.add(new Fatura("mary@mail.com", 150.0));
        faturas.add(new Fatura("joseph@mail.com", 290.0));

        return faturas;
    }

}
