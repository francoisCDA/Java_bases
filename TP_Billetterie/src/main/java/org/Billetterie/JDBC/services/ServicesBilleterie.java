package org.Billetterie.JDBC.services;

import org.Billetterie.Classes.Client;
import org.Billetterie.Classes.Event;
import org.Billetterie.Classes.Lieu;
import org.Billetterie.JDBC.dao.BilletDAO;
import org.Billetterie.JDBC.dao.ClientDAO;
import org.Billetterie.JDBC.dao.EventDAO;
import org.Billetterie.JDBC.dao.LieuDAO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ServicesBilleterie {

    private LieuDAO lieuDAO;
    private EventDAO eventDAO;
    private ClientDAO clientDAO;
    private BilletDAO billetDAO;

    private static ServicesBilleterie instance;

    private ServicesBilleterie() {
        lieuDAO = new LieuDAO();
        eventDAO = new EventDAO();
        clientDAO = new ClientDAO();
        billetDAO = new BilletDAO();
        instance = this;
    }

    public static ServicesBilleterie get(){
        if (instance == null) {
            instance = new ServicesBilleterie();
        }

        return instance;
    }


// **************************************** Lieux ************************
    public ArrayList<Lieu> getLieux(){
        return lieuDAO.get();
    }

    public Lieu getLieu(int idLieu){ return lieuDAO.get(idLieu); }

    public boolean addNewLieu(String nom, String adresse, int capacite){
        return lieuDAO.addNew(nom,adresse,capacite);
    }

    public boolean updateLieu(Lieu lieu) {
        return lieuDAO.update(lieu);
    }

    public boolean deleteLieu(int id) { return lieuDAO.delete(id); }

    // **************************************** Client ************************
    public Boolean addNewClient(String last, String first, String email){
         return clientDAO.addNew(last,first,email);
    }

    public ArrayList<Client> getClients() {
        return clientDAO.get();
    }

    public boolean updateClient(Client client) { return clientDAO.update(client); }

    public boolean deleteClient(int id) { return clientDAO.delete(id); }


    // **************************************** Event ************************

    public Boolean addNewEvent(String nom, LocalDate date, LocalTime heure, int idLieu, Double prix){
        return eventDAO.addNew(nom, date, heure, idLieu, prix);
    }

    public ArrayList<Event> getEvents(){ return eventDAO.get();}





    // **************************************** Billet ************************

    public boolean addNewBillet(int idSalle, int idCLient) {
        return billetDAO.addNew(idSalle,idCLient);
    }

    public boolean cancel(int idBillet) {
        return billetDAO.cancel(idBillet);
    }





}
