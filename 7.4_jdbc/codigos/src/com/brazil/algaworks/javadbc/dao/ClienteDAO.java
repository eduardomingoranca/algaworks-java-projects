package com.brazil.algaworks.javadbc.dao;

import com.brazil.algaworks.javadbc.modelo.Cliente;

import java.util.List;

public interface ClienteDAO {
    void salvar(Cliente cliente);
    Cliente buscarPeloCodigo(Long codigo);

    List<Cliente> buscarTodos();
}
