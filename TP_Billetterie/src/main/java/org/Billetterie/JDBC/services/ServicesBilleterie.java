package org.Billetterie.JDBC.services;

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


    public ArrayList<Lieu> getLieux(){

        return lieuDAO.getLieux();


    }



}
