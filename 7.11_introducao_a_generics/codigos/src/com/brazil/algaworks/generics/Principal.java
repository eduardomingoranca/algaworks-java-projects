package com.brazil.algaworks.generics;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
//        List funcionarios = new ArrayList();
        // generics -> List<TipoDoObjeto>
        List<Funcionario> funcionarios = new ArrayList();

        funcionarios.add(new Funcionario("John"));
        funcionarios.add(new Funcionario("Mary"));

//        funcionarios.add("Richard");

//        for (int i = 0; i < funcionarios.size(); i++) {
//            Funcionario f = (Funcionario) funcionarios.get(i);
//            Funcionario f = funcionarios.get(i);

//            System.out.println("Nome do funcionario: " + f.getNome());
//        }

        for (Funcionario f: funcionarios)
            System.out.println("Nome do funcionario: " + f.getNome());

    }
}
