package org.Billetterie.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.Billetterie.Classes.Exceptions.DateError;
import org.Billetterie.Classes.Exceptions.OutOfCapacity;
import org.Billetterie.Classes.Exceptions.PasAssezDePlace;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

@Data
public class Event {

    private String id;
    private String nom;
    private LocalDate date;
    private LocalTime heure;
    private Lieu salle;
    private int prix;
    private int billetsVendus;
    private int cmptBillets;
    private ArrayList<Billet> canceledBillet;

    public Event(String id, String nom,LocalDate date, LocalTime heure, Lieu salle, int prix) {
        this.id = id;
        this.nom = nom;
        this.date = date;
        this.heure = heure;
        this.salle = salle;
        this.prix = prix;
        this.billetsVendus = 0;
        this.cmptBillets = 0;
        this.canceledBillet = new ArrayList<>();
    }

    public boolean isBilletLibre() {
        return billetsVendus < salle.getCapacite();
    }

    public int nbPlaceLibre() {
        return salle.getCapacite() - billetsVendus;
    }

    public boolean isNbPlacesLibres(int nbPlaces) {
        return nbPlaces < nbPlaceLibre();
    }

    public Billet[] vendreBillet(int nbPlace) throws PasAssezDePlace, DateError {


        if (LocalDate.now().isAfter(date)) throw new DateError("Evenement : \"" + nom + "\" terminé");
        if (!isNbPlacesLibres(nbPlace)) throw new PasAssezDePlace("Nombre de place libre insuffissante");

        ArrayList<Billet> ret = new ArrayList<>() ;

        if (nbPlace>0) {
            for (int i = 0 ; i < nbPlace ; i++) {
                ret.add(new Billet(this,String.format("%05d",++cmptBillets) ));
                billetsVendus++;
            }
        } else {
            throw new PasAssezDePlace("Nombre de place demandé invalide");
        }

        return ret.toArray(ret.toArray(new Billet[0]));
    }


    public void cancelBillet(Billet billetAnnule) throws OutOfCapacity,DateError {

        if (LocalDate.now().isAfter(date)) throw new DateError("Billet périmet, annulation impossible");

        if (nbPlaceLibre() > 0 ) {
           canceledBillet.add(billetAnnule);
           billetsVendus-- ;
        } else {
            throw new OutOfCapacity("Le nombre de billets rendus excède la capacité de la salle");
        }
    }

    public String toString(){
        return nom + ", " + salle.getNom() + ", " + date + ", " + heure + ", " + prix + "€, " + nbPlaceLibre()  + " places disponibles";
    }



}
