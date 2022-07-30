package com.brazil.algaworks.slf4j;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfiguracaoBasica {

    private static Logger logger = LoggerFactory.getLogger(ConfiguracaoBasica.class);

    public static void main(String[] args) {

        logger.info("Comecando a aplicacao.");
        // codigo aplicacao
        logger.info("Finalizando a aplicacao.");

    }

}
