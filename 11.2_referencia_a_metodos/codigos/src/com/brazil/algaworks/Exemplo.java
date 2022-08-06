package com.brazil.algaworks;

import com.brazil.algaworks.dao.FaturaDao;
import com.brazil.algaworks.model.Fatura;

import java.util.List;

public class Exemplo {

    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDao().buscarFaturasVencidas();

//        for (Fatura f: faturasVencidas)
//            f.atualizarStatus();

//        faturasVencidas.forEach(f -> f.atualizarStatus());

        faturasVencidas.forEach(Fatura::atualizarStatus);

    }
}
