package org.Billetterie.Display.Menus;

import org.Billetterie.Classes.Lieu;
import org.Billetterie.Display.Exceptions.SaisieNull;
import org.Billetterie.Display.IHM;

public class MenuUpdSalles {

    public static void mnUpdSalles(Lieu salle) {
        IHM.H1("mise à jour lieux");

        String[] nmEntries = {"Nom : " +salle.getNom(),"Adresse : " +salle.getAdresse() ,"Capacité : "+salle.getCapacite(), " - RETOUR GESTION DES LIEUX -"} ;

        int choix = IHM.menuBilleterie(nmEntries);

        switch (choix) {
            case 1 -> updNom(salle);
            case 2 -> updAdresse(salle);
            case 3 -> updCapacite(salle);
            case 4 -> MenuSalles.mnSalle();
            default -> mnUpdSalles(salle);
        }
    }

    private static void updNom(Lieu salle) {
        String newNom = IHM.inputText("Indiquer le nouveau nom");
        if (!newNom.trim().isEmpty()) {
            salle.setNom(newNom.trim());
            if (IHM.serviceBilleterie.updateLieu(salle)){
                IHM.consoleConfirm("Nouveau nom du lieu : " + salle.getNom());
            } else {
                IHM.consoleFail("Erreur serveur");
            }

        } else {
            IHM.consoleFail("Echec de mise à jour, le nom ne peut pas être vide");

        }
        MenuSalles.mnSalle();
    }

    private static void updAdresse(Lieu salle) {
        String newAdresse = IHM.inputText("Indiquer une nouvelle adresse");
        if (!newAdresse.trim().isEmpty()) {
            salle.setAdresse(newAdresse.trim());
            if (IHM.serviceBilleterie.updateLieu(salle)){
                IHM.consoleConfirm("Nouvelle adresse du lieu : " + salle.getAdresse());
            } else  {
                IHM.consoleFail("Erreur serveur");
            }

        } else {
            IHM.consoleFail("Echec de mise à jour, l'adresse ne peut pas être vide");
        }
        MenuSalles.mnSalle();
    }

    private static void updCapacite(Lieu salle) {

        try {
            int newCapacite = IHM.inputNumber("Nouvelle capacitée");
            if (newCapacite > 0 ) {
                salle.setCapacite(newCapacite);
                if (IHM.serviceBilleterie.updateLieu(salle)) {
                    IHM.consoleConfirm("Nouvelle capacié : "+ salle.getCapacite());
                } else {
                    IHM.consoleFail("Problème, Capacité inchangée");
                }

            } else {
                IHM.consoleFail("Capacité impossible");
            }

        } catch (SaisieNull e) {
            IHM.consoleError("saisie invalide");
        }

        MenuSalles.mnSalle();
    }
}
