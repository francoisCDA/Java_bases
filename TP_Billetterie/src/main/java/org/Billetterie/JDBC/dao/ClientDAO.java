package org.Billetterie.JDBC.dao;

import org.Billetterie.Classes.Client;
import org.Billetterie.Display.IHM;

import java.sql.SQLException;
import java.util.ArrayList;

public class ClientDAO extends BaseDAO<Client> {
    @Override
    public ArrayList<Client> get() {
        ArrayList<Client> ret = new ArrayList<>();
        request = "SELECT * FROM client";
        try {
            statement = _connection.prepareStatement(request);
            resultSet = statement.executeQuery();

            while (resultSet.next()){

                Client cl = new Client(resultSet.getInt("id_client"),resultSet.getString("last"),resultSet.getString("first"),resultSet.getString("email"));

                ret.add(cl);
            }

            return ret;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Client addNew(String last, String first, String email) {
        request = "INSERT INTO client (first,last,email) VALUES (?,?,?)";
        try {
            statement = _connection.prepareStatement(request);
            statement.setString(1,first);
            statement.setString(2,last);
            statement.setString(3,email);

            resultSet = statement.executeQuery();

            if (resultSet.next()){
                return new Client(resultSet.getInt("ic_client"),resultSet.getString("last"),resultSet.getString("first"),resultSet.getString("email"));
            }

        } catch (SQLException e) {
            IHM.consoleError(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean update(Client client) {
        request = "UPDATE client SET first = ? ,last = ? ,email = ? WHERE id_client = ?";
        try {
            statement = _connection.prepareStatement(request);
            statement.setString(1, client.getFirstname());
            statement.setString(2, client.getLastname());
            statement.setString(3, client.getEmail());
            statement.setInt(4, client.getId());

            int rows = statement.executeUpdate();
            return rows == 1;

        } catch (SQLException e) {
            IHM.consoleError(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        request = "DELETE FROM client WHERE id_client = ?";
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
