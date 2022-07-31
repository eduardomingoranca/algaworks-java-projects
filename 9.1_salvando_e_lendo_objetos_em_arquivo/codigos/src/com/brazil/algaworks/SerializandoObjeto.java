package com.brazil.algaworks;

import com.brazil.algaworks.model.Pessoa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializandoObjeto {

    public static void main(String[] args) {
        // instancia do objeto
        Pessoa p = new Pessoa();
        p.setNome("John Wheeler");
        p.setIdade(25);
        p.setProfissao("Software Engineer");

        // salvando um objeto em um arquivo de saida
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("john.obj"))){
            out.writeObject(p);
            System.out.println("Objeto salvo com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro salvando o objeto. "+ e.getMessage());
            e.printStackTrace();
        }
    }
}
