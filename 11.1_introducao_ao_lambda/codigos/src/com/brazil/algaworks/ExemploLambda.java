package com.brazil.algaworks;

import com.brazil.algaworks.dao.FaturaDao;
import com.brazil.algaworks.model.Fatura;
import com.brazil.algaworks.util.EnviadorEmail;

import java.util.List;

public class ExemploLambda {

    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDao().buscarFaturasVencidas();

        EnviadorEmail enviadorEmail = new EnviadorEmail();

//        for (Fatura f: faturasVencidas) {
//            enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
//        }

        faturasVencidas.forEach(f -> {
            enviadorEmail.enviar(f.getEmailDevedor(), f.resumo());
            f.setEmailEnviado(true);
        });

    }
}
