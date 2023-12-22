package org.Billetterie.Display.Menus;

import org.Billetterie.Classes.Event;
import org.Billetterie.Classes.Lieu;
import org.Billetterie.Display.IHM;
import org.Billetterie.JDBC.services.ServicesBilleterie;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class MenuEvent {

    public static void mnEvent() {

        //IHM.H1("Evènements");

        int choix = 0;

        while (choix != 4) {

            String[] menuEvent = {"Afficher les évènements", "Modifier un évènement", "Ajouter une évènement"," - RETOUR -" };

            choix = IHM.menuBilleterie(menuEvent,"Gestion Eveènement");

            switch (choix) {
                case 1 -> printEvents();
                case 2 -> updateEvents();
                case 3 -> addEvents();
                default -> IHM.consoleFail("Saisie incorrecte");
            }
        }
    }

    private static void printEvents() {

        ArrayList<Event> events = IHM.serviceBilleterie.getEvents();

        events.forEach(ev -> IHM.consoleLi(ev.toString()));


    }

    private static void updateEvents() {
        IHM.consoleError("fonctionnalité non implémentée");
    }

    private static void addEvents() {
        String nomEvent;
        LocalDate dateEvent;
        LocalTime timeEvent;
        Lieu salle;
        double prix;


        nomEvent = IHM.inputText("Nom de l'évènement").trim();
        dateEvent = IHM.inputDate("Date de l'évènement (AAAA-MM-JJ)");
        timeEvent = IHM.inputTime("Heure de l'évènement (HH:MM)");
        salle = mnSelectLieu();
        prix = IHM.inputPrix("Prix de l'évènement");

        if (IHM.serviceBilleterie.addNewEvent(nomEvent,dateEvent,timeEvent, salle.getId(), prix)) {
            IHM.consoleConfirm("L'évènement à bien été ajouté");
        } else {
            IHM.consoleFail("Erreur lors de l'ajout de l'évènement");
        }

    }

    private static Lieu mnSelectLieu() {

        Lieu[] lieux = IHM.serviceBilleterie.getLieux().toArray(new Lieu[0]);
        String[] lieuxLabel = new String[lieux.length] ;
        int choix = 0;

        for (int i = 0 ; i < lieux.length ; i++) {
            lieuxLabel[i] = lieux[i].getNom() + " à " + lieux[i].getAdresse();
        }

        while (choix == 0) {
            choix = IHM.menuBilleterie(lieuxLabel,"Sléectionner un lieu");
            if (choix ==0) IHM.consoleFail("Saisie invalide");
        }

        return lieux[choix-1];
    }



}
