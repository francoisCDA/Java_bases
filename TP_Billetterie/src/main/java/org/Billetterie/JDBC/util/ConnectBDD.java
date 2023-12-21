package org.Billetterie.JDBC.util;

import org.Billetterie.Display.IHM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectBDD {

    private static final String URI = "jdbc:mysql://localhost:3306/billetterie";

    private static final String USER = "root";

    private static final String PASSWORD = "admin";

    private static Connection connection;


    private ConnectBDD(){

    }

    public static Connection getConnection(){
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(URI,USER,PASSWORD);
                IHM.consoleConfirm("Connection à la base de donnée...");
            } catch (SQLException e) {
                IHM.consoleError("connection fail");
                throw new RuntimeException(e);
            }
        }
        return connection;
    }

    public static void disconnect(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            connection = null ;
        }
    }


}
