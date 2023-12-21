package org.Billetterie.JDBC.dao;

import org.Billetterie.JDBC.util.ConnectBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class BaseDAO<T> {

    protected Connection _connection;
    protected PreparedStatement statement;
    protected String request;
    protected ResultSet resultSet;

    public BaseDAO() {
        _connection = ConnectBDD.getConnection();
    }

}
