package com.brazil.algaworks;

import com.brazil.algaworks.dao.FaturaDAO;
import com.brazil.algaworks.modelo.Fatura;

import java.util.List;
import java.util.stream.Stream;

public class Teste {

    public static void main(String[] args) {
        List<Fatura> faturas = new FaturaDAO().buscarTodasFaturas();

//        for (Fatura f: faturas) {
//            if (f.getValor() > 250.0)
//                System.out.println("Alerta: Fatura acima de R$ 250.00 " + f);
//        }

        faturas.stream()
                .filter(Fatura::estaEmRisco)
                .forEach(System.out::println);

    }

}
