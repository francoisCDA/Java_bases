package org.example.exercice.TPHotel;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String nom ;
    private Chambre[] chambreTable ;
    private List<Reservation> reservationList ;
    private List<Client> clientList ;

    public Hotel(String nom) {
        this.nom = nom;
        chambreTable = new Chambre[20];
        for (Chambre ch:chambreTable) {
            ch = new Chambre();
        }
        reservationList = new ArrayList<>();
        clientList = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public Chambre[] getChambreTable() {
        return chambreTable;
    }

    public Reservation[] getReservationList() {
        return reservationList.toArray(new Reservation[0]);
    }

    public Client[] getClientList() {
        return clientList.toArray(new Client[0]);
    }

    public void nouveauCLient(String lastName, String firstname, int telephone) {
        Client nouvoClient = new Client(lastName,firstname,telephone);
        clientList.add(nouvoClient);
        System.out.println("\n -> nouveau client créé : " + nouvoClient);
    }

    private boolean knowClient(int id) {
        boolean knowId = false;
        Client[] tablClient = clientList.toArray(new Client[0]);

        for (Client cl:tablClient) {
            if (cl.getId() == id) {
               return true;
            }
        }
        return false;
    }


    public void getReservationByClient(int id) {

        if (knowClient(id)) {
            Reservation[] tablReservation = reservationList.toArray(new Reservation[0]);

            for (Reservation re:tablReservation) {
                System.out.println("Reservation du client " + id );
                if (re.getClientID() == id ) {
                    System.out.println(re);
                }
            }

        } else {
            System.out.printf("\n\t !!! l'id client %d est inconnu \n",id);
        }

        List<Reservation> ret = new ArrayList<>() ;

    }

    private boolean isFree(int numChambre) {

        for (Chambre ch:chambreTable) {
            if (ch.getNumero() == numChambre) {
                return ch.isLibre();
            }
        }

        return false;
    }

    public void reserver(int clientID,int chambreNum) {

        if (!knowClient(clientID)) {
            System.out.println("\n !!! numéro de client inconnu");
        } else if (!isFree(chambreNum)) {
            System.out.println("\n !!! chambre indisponible ou introuvable");
        } else {
            reservationList.add(new Reservation(clientID,chambreNum));
            System.out.println("\n -> réservation validée");
        }

    }

    private boolean knowReservationID(int resID) {

        Reservation[] tableRes = reservationList.toArray(new Reservation[0]);

        for (Reservation res:tableRes) {
            if (res.getNumero() == resID) {
                res.annulation();
                return true ;
            }
        }
        return false ;
    }

    public void reservationCancel(int reservationID) {

        if (!knowReservationID(reservationID)) {
            System.out.println("\n !!! numéro de réservation invalide");
        } else {
            System.out.println("\n -> réservation annulée");
        }

    }


}
