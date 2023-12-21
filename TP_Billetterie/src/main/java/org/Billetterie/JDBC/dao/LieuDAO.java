package org.Billetterie.JDBC.dao;

import org.Billetterie.Classes.Client;
import org.Billetterie.Classes.Lieu;
import org.Billetterie.Display.IHM;

import java.sql.SQLException;
import java.util.ArrayList;


public class LieuDAO extends BaseDAO<Lieu>{
    public LieuDAO() {
        super();
    }


    public ArrayList<Lieu> get() {
        ArrayList<Lieu> ret = new ArrayList<>();
        request = "SELECT * FROM lieu";
        try {
            statement = _connection.prepareStatement(request);
            resultSet = statement.executeQuery();

            while (resultSet.next()){

                Lieu li = new Lieu(resultSet.getInt("id_lieu"),resultSet.getString("nom"),resultSet.getString("adresse"), resultSet.getInt("capacite"));

                ret.add(li);
            }

            return ret;

        } catch (SQLException e) {
           e.printStackTrace();
            return null;
        }
    }

    public boolean addNew(String nom, String adresse, int capacite) {
        request = "INSERT INTO lieu (nom,adresse,capacite) VALUES (?,?,?)";
        try {
            statement = _connection.prepareStatement(request);
            statement.setString(1,nom);
            statement.setString(2,adresse);
            statement.setInt(3,capacite);

            int rows = statement.executeUpdate();
            return rows == 1;

        } catch (SQLException e) {
            IHM.consoleError(e.getMessage());
            return false;
        }

    }

    public boolean update(Lieu lieu) {
        request = "UPDATE lieu SET nom = ? ,adresse = ? ,capacite = ? WHERE id_lieu = ?";
        try {
            statement = _connection.prepareStatement(request);
            statement.setString(1, lieu.getNom());
            statement.setString(2, lieu.getAdresse());
            statement.setInt(3,lieu.getCapacite());
            statement.setInt(4,lieu.getId());

            int rows = statement.executeUpdate();
            return rows == 1;

        } catch (SQLException e) {
            IHM.consoleError(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        request = "DELETE FROM lieu WHERE id_lieu = ?";
        try {
            statement = _connection.prepareStatement(request);
            statement.setInt(1,id);

            int rows = statement.executeUpdate();
            return rows == 1;

        } catch (SQLException e) {
            IHM.consoleError(e.getMessage());
            return false;
        }
    }


}
