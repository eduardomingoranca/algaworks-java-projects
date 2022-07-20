package com.brazil.algaworks.javadbc;

import com.brazil.algaworks.javadbc.dao.ClienteDAO;
import com.brazil.algaworks.javadbc.dao.DAOFactory;
import com.brazil.algaworks.javadbc.modelo.Cliente;

import javax.swing.*;

public class SalvaCliente {

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Cliente cliente = new Cliente();

        String nome = JOptionPane.showInputDialog(null, "Nome do cliente",
                "Cadastro de cliente", JOptionPane.QUESTION_MESSAGE);

        if (nome != null) {
            cliente.setNome(nome);

            ClienteDAO clienteDAO = DAOFactory.getDAOFactory().getClienteDAO();
            clienteDAO.salvar(cliente);
            System.out.println("Cliente salvo com sucesso.");
        }
    }
}
