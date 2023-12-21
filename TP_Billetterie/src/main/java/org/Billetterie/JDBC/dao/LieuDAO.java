package org.Billetterie.JDBC.dao;

import org.Billetterie.Classes.Client;
import org.Billetterie.Classes.Lieu;

import java.sql.SQLException;
import java.util.ArrayList;


public class LieuDAO extends BaseDAO<Lieu>{
    public LieuDAO() {
        super();
    }


    public ArrayList<Lieu> getLieux() {
        ArrayList<Lieu> ret = new ArrayList<>();
        request = "SELECT * FROM lieu";
        try {
            statement = _connection.prepareStatement(request);
            resultSet = statement.executeQuery();

            while (resultSet.next()){

                Lieu li = new Lieu(resultSet.getInt("id_lieu"),resultSet.getString("nom"),resultSet.getString("adresse"), resultSet.getInt("capactite"));


            }



        } catch (SQLException e) {
            return null;
        }


        return ret;
    }
}
