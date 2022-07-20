package com.brazil.algaworks.javadbc.dao.jdbc;

import com.brazil.algaworks.javadbc.dao.ClienteDAO;
import com.brazil.algaworks.javadbc.dao.DAOFactory;
import com.brazil.algaworks.javadbc.modelo.Cliente;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcDAOFactory extends DAOFactory {

    // criando a conexao
    private Connection connection;

    public JdbcDAOFactory() {
        try {
            // carregando o driver
            Class.forName("com.mysql.jdbc.Driver");
            // recuperando a conexao com o banco de dados
            // string de conexao, usuario com o banco de dado, senha com o banco de dados
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost/cadastro_cliente",
                    "root", "root");
        } catch (Exception e) {
            throw new RuntimeException("Erro recuperando conexao com o banco", e);
        }
    }

    @Override
    public ClienteDAO getClienteDAO() {
        return new JdbcClienteDAO(connection);
    }
}
