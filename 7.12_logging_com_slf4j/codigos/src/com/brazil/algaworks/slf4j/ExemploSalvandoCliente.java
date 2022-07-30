package com.brazil.algaworks.slf4j;

import com.brazil.algaworks.slf4j.dao.ClienteDAO;
import com.brazil.algaworks.slf4j.model.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExemploSalvandoCliente {

    private static Logger logger = LoggerFactory.getLogger(ExemploSalvandoCliente.class);

    public static void main(String[] args) {
        logger.info("Iniciando a aplicacao");

        Cliente cliente = new Cliente("John");
        new ClienteDAO().salvar(cliente);

        new ClienteDAO().salvar(null);

        logger.info("Finalizando a aplicacao");
    }
}
