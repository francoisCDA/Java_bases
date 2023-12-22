package org.Billetterie.JDBC.dao;

import org.Billetterie.Classes.Client;
import org.Billetterie.Classes.Event;
import org.Billetterie.Classes.Lieu;
import org.Billetterie.Display.IHM;
import org.Billetterie.JDBC.services.ServicesBilleterie;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class EventDAO extends BaseDAO<Event>{


    @Override
    public ArrayList<Event> get() {
        ArrayList<Event> ret = new ArrayList<>();
        request = "SELECT * FROM Event JOIN lieu ON event.salle = lieu.id_lieu";
        try {
            statement = _connection.prepareStatement(request);
            resultSet = statement.executeQuery();

            while (resultSet.next()){

                Lieu lieu = new Lieu(resultSet.getInt("id_lieu"),
                                     resultSet.getString("nom"),
                                     resultSet.getString("adresse"),
                                     resultSet.getInt("capacite"));

                java.sql.Date dateSql = resultSet.getDate("date_event");
                java.sql.Time heureSql = resultSet.getTime("time_event");

                Event ev = new Event(resultSet.getInt("id_event"),
                                     resultSet.getString("nom_event"),
                                     dateSql.toLocalDate(),
                                     heureSql.toLocalTime(),
                                     lieu,
                                     resultSet.getDouble("prix") ) ;

                ret.add(ev);

            }

            return ret;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }


    @Override
    public boolean update(Event element) {
        return false;
    }


    @Override
    public boolean delete(int id) {
        return false;
    }


    public Boolean addNew(String nom, LocalDate date, LocalTime heure, int idLieu, double prix) {

        DecimalFormat monetaire = new DecimalFormat("#.##");
        String prixString = monetaire.format(prix);
        prixString = prixString.replace(',','.');
        prix = Double.parseDouble(prixString);

        request = "INSERT INTO event (nom_event,date_event,time_event,salle,prix) VALUES (?,?,?,?,?)";
        try {
            statement = _connection.prepareStatement(request);
            statement.setString(1,nom);
            statement.setDate(2, Date.valueOf(date));
            statement.setTime(3, Time.valueOf(heure));
            statement.setInt(4,idLieu);
            statement.setDouble(5,prix);

            int rows = statement.executeUpdate();

            return rows == 1;

        } catch (SQLException e) {
            IHM.consoleError(e.getMessage());
            return false;
        }

    }

}
