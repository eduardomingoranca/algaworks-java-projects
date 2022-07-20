package com.brazil.algaworks.javadbc.dao;

import com.brazil.algaworks.javadbc.modelo.Cliente;

public interface ClienteDAO {
    void salvar(Cliente cliente);
    Cliente buscarPeloCodigo(Long codigo);
}
