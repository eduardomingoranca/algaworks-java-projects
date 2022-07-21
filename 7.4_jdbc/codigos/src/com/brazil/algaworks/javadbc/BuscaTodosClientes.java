package com.brazil.algaworks.javadbc;

import com.brazil.algaworks.javadbc.dao.ClienteDAO;
import com.brazil.algaworks.javadbc.dao.DAOFactory;
import com.brazil.algaworks.javadbc.modelo.Cliente;

import java.util.List;

public class BuscaTodosClientes {

    public static void main(String[] args) {
        ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();

        List<Cliente> clientes = clienteDAO.buscarTodos();

        for (Cliente cliente: clientes) {
            System.out.println("========= Cliente =========");
            System.out.printf("Codigo: %d\n", cliente.getCodigo());
            System.out.printf("Nome: %s\n", cliente.getNome());
            System.out.println();
        }

    }
}
