package org.Billetterie.JDBC.services;

import org.Billetterie.Classes.Client;
import org.Billetterie.Classes.Lieu;
import org.Billetterie.JDBC.dao.BilletDAO;
import org.Billetterie.JDBC.dao.ClientDAO;
import org.Billetterie.JDBC.dao.EventDAO;
import org.Billetterie.JDBC.dao.LieuDAO;

import java.util.ArrayList;

public class ServicesBilleterie {

    private LieuDAO lieuDAO;
    private EventDAO eventDAO;
    private ClientDAO clientDAO;
    private BilletDAO billetDAO;

    public ServicesBilleterie() {
        lieuDAO = new LieuDAO();
        eventDAO = new EventDAO();
        clientDAO = new ClientDAO();
        billetDAO = new BilletDAO();
    }

// **************************************** Lieux ************************
    public ArrayList<Lieu> getLieux(){
        return lieuDAO.get();
    }

    public boolean addNewLieu(String nom, String adresse, int capacite){
        return lieuDAO.addNew(nom,adresse,capacite);
    }

    public boolean updateLieu(Lieu lieu) {
        return lieuDAO.update(lieu);
    }

    public boolean deleteLieu(int id) { return lieuDAO.delete(id); }

    // **************************************** Client ************************
    public Client addNewClient(String last, String first, String email){
         return clientDAO.addNew(last,first,email);
    }

    public ArrayList<Client> getClients() {
        return clientDAO.get();
    }

    public boolean updateClient(Client client) { return clientDAO.update(client); }

    public boolean deleteClient(int id) { return clientDAO.delete(id); }


    // **************************************** Event ************************



    // **************************************** Billet ************************
}
