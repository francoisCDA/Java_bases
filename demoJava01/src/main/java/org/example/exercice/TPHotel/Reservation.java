package org.example.exercice.TPHotel;

public class Reservation {

    private static int cmptReservation = 0;
    private int numero ;
    private ReservationStatut statut ;
    private int clientID ;
    private int chambreNum ;

    public Reservation( int clientID, int chambreNum) {
        this.numero = ++cmptReservation;
        this.statut = ReservationStatut.VALIDEE;
        this.clientID = clientID;
        this.chambreNum = chambreNum;
    }

    public int getNumero() {
        return numero;
    }

    public String statut() {
        return statut.toString();
    }

    public int getClientID() {
        return clientID;
    }

    public int getChambre() {
        return chambreNum;
    }

    public void annulation() {
        statut = ReservationStatut.ANNULEE;
    }

    public void changeChambre(Chambre chambre) {
        this.chambreNum = chambre.getNumero();
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "numero=" + numero +
                ", statut=" + statut +
                ", client=" + clientID +
                ", chambre=" + chambreNum +
                '}';
    }

}

enum ReservationStatut {
    VALIDEE,
    ANNULEE,
}