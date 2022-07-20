package com.brazil.algaworks.javadbc;

import com.brazil.algaworks.javadbc.dao.ClienteDAO;
import com.brazil.algaworks.javadbc.dao.DAOFactory;
import com.brazil.algaworks.javadbc.modelo.Cliente;

public class BuscaPeloCodigo {

    public static void main(String[] args) {
        ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();

        Cliente cliente = clienteDAO.buscarPeloCodigo(2L);

        if (cliente != null) {
            System.out.println("========= Cliente encontrada =========");
            System.out.printf("Codigo: %d\n", cliente.getCodigo());
            System.out.printf("Nome: %s\n", cliente.getNome());
            System.out.println();
        } else {
            System.out.println("Nenhum cliente encontrado.");
        }

    }
}
