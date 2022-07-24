package com.brazil.algaworks.introjson;

import com.brazil.algaworks.introjson.modelo.Cliente;
import com.brazil.algaworks.introjson.modelo.Endereco;
import com.brazil.algaworks.introjson.modelo.Telefone;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class GerandoJson {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua das Aguas, 10", "Sao Paulo", "SP");

        Telefone residencial = new Telefone("RESIDENCIAL", "11 3333-1111");
        Telefone comercial = new Telefone("COMERCIAL", "11 3222-2222");
        List<Telefone> telefones = new ArrayList<>();
        telefones.add(residencial);
        telefones.add(comercial);

        Cliente cliente = new Cliente("John Hopkins", 28, endereco, telefones);

        // convertendo object para json
        Gson gson = new Gson();
        String json = gson.toJson(cliente);

        System.out.println(json);

        System.out.println();
        System.out.println("=====================================================================");
        System.out.println();

        // json para object
        Cliente c2 = gson.fromJson(json, Cliente.class);

        System.out.println(c2.getNome());
        System.out.println(c2.getTelefones().get(0).getNumero());
    }
}
