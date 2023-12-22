package org.Billetterie.JDBC.dao;

import org.Billetterie.Classes.Billet;
import org.Billetterie.Display.IHM;

import java.sql.SQLException;
import java.util.ArrayList;

public class BilletDAO extends BaseDAO<Billet> {
    @Override
    public ArrayList get() {
        return null;
    }

    @Override
    public boolean update(Billet billet) {
        return cancel(billet.getId());
    }

    @Override
    public boolean delete(int idBillet) {
        return cancel(idBillet);
    }

    public boolean cancel(int idBillet) {
        request = "UPDATE billet SET cancel = TRUE WHERE id_billet = ?";

        try {
            statement = _connection.prepareStatement(request);
            statement.setInt(1,idBillet);

            int rows = statement.executeUpdate();

            return rows == 1;

        } catch (SQLException e) {
            IHM.consoleError(e.getMessage());
            return false;
        }

    }

    public Boolean addNew(int idSalle, int idCLient) {
        request = "INSERT INTO billet (event_id,client_id) VALUES (?,?)";

        try {
            statement = _connection.prepareStatement(request);
            statement.setInt(1,idSalle);
            statement.setInt(2,idCLient);

            int rows = statement.executeUpdate();

            return rows == 1;

        } catch (SQLException e) {
            IHM.consoleError(e.getMessage());
            return false;
        }
    }

}
