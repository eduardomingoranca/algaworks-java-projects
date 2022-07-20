package com.brazil.algaworks.javadbc.dao.jdbc;

import com.brazil.algaworks.javadbc.dao.ClienteDAO;
import com.brazil.algaworks.javadbc.dao.DAOException;
import com.brazil.algaworks.javadbc.modelo.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcClienteDAO implements ClienteDAO {

    private Connection connection;

    public JdbcClienteDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void salvar(Cliente cliente) {
        try {
            String sql =  String.format("insert into cliente (nome) values ('%s')", cliente.getNome());

            // atualiza e executa o comando sql no banco de dados
            PreparedStatement ps = this.connection.prepareStatement(sql);
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new DAOException("Erro salvando cliente", e);
        } finally {
            // fechando a conxao com o banco de dados
            try {
                this.connection.close();
            } catch(Exception e) {}
        }
    }

    @Override
    public Cliente buscarPeloCodigo(Long codigo) {
        Cliente cliente = null;

        try {
            String sql =  String.format("select * from cliente where codigo = %d", codigo);

            // atualiza e executa o comando sql no banco de dados
            PreparedStatement ps = this.connection.prepareStatement(sql);

            // executa o comando sql e retorna uma tabela
            ResultSet rs = ps.executeQuery();
            // percorrendo a tabela
            while(rs.next()) {
                cliente = new Cliente();
                cliente.setCodigo(rs.getLong("codigo"));
                cliente.setNome(rs.getString("nome"));
            }
        } catch (SQLException e){
            throw new DAOException("Erro buscando cliente", e);
        } finally {
            try {
                this.connection.close();
            } catch (Exception e) {}
        }
        return cliente;
    }
}
