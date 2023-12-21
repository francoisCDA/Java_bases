package org.Billetterie.JDBC.dao;

import org.Billetterie.JDBC.util.ConnectBDD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public abstract class BaseDAO<T> {

    protected Connection _connection;
    protected PreparedStatement statement;
    protected String request;
    protected ResultSet resultSet;

    public BaseDAO() {
        _connection = ConnectBDD.getConnection();
    }

    public abstract ArrayList<T> get();
    public abstract boolean update(T element);
    public abstract boolean delete(int id);


}
