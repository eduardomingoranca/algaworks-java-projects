package com.brazil.algaworks.slf4j.dao;

import com.brazil.algaworks.slf4j.model.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClienteDAO {

    private static Logger logger = LoggerFactory.getLogger(ClienteDAO.class);

    public void salvar(Cliente cliente) {
        if (cliente == null) {
            // Regra para dizer ao usuario informar o nome
            logger.warn("Cliente esta nulo");
            return;
        }
        if (logger.isDebugEnabled())
            logger.debug("Salvando o cliente: " + cliente);

        // Salvaria o cliente no banco de dados
        logger.debug("Cliente salvo com sucesso.");
    }
}
