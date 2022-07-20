package com.brazil.algaworks.javadbc.dao;

import com.brazil.algaworks.javadbc.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {

    public static DAOFactory getDAOFactory() {
        return new JdbcDAOFactory();
    }
}
