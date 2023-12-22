package org.Billetterie.Display.Menus;

import org.Billetterie.Classes.Lieu;
import org.Billetterie.Display.Exceptions.SaisieNull;
import org.Billetterie.Display.IHM;
import org.Billetterie.JSQL.DDBBilletterie;
import org.Billetterie.JSQL.Exceptions.ErrorEvent;
import org.Billetterie.JSQL.Exceptions.ErrorLieu;
import org.Billetterie.JSQL.MaBilletterie;

import java.util.ArrayList;

public class MenuSalles {

  //  private static DDBBilletterie maBilletterie  = MaBilletterie.getBilletterie();

    public static void mnSalle() {

        int choix;
        String[] menuSalle = {"Afficher les lieux", "Ajouter un lieux", "Modifier un lieux", "Supprimer un lieux", " - RETOUR -"};

        choix = IHM.menuBilleterie(menuSalle,"Gestion des lieux");

        switch (choix) {

            case 1 -> afficheSalles();
            case 2 -> addSalle();
            case 3 -> updateSalle();
            case 4 -> rmSalle();
            case 5 -> {
                return;
            }

            default -> mnSalle();
        }
    }


    private static void afficheSalles() {

//        Lieu[] salles = maBilletterie.getSalles();
//
//        for (Lieu s:salles) {
//           IHM.consoleLi(s.toString());
//        }

        ArrayList<Lieu> lieux = IHM.serviceBilleterie.getLieux();

        lieux.forEach(l -> IHM.consoleLi(l.toString()));

        mnSalle();
    }

    private static void addSalle() {

        String nom, adresse;
        int capacite;

       IHM.H1("ajouter un lieu");

        nom = IHM.inputText("Nom du lieu");
        adresse = IHM.inputText("Adresse du lieu");

        try {
            capacite = IHM.inputNumber("Capacité de la salle");

            if (capacite > 0 && !nom.trim().isEmpty() && !adresse.trim().isEmpty()) {
                if (IHM.serviceBilleterie.addNewLieu(nom.trim(),adresse.trim(),capacite)){
                    IHM.consoleConfirm("Le lieu a bien été ajouté.");
                }
            } else {
                IHM.consoleFail("Valeur incorrectes, ajout impossible");
            }

        } catch ( SaisieNull err) {
            IHM.consoleError("saisie capacité invalide");
            mnSalle();
        }
        mnSalle();
    }

    private static void updateSalle() {

        Lieu[] salles = IHM.serviceBilleterie.getLieux().toArray(new Lieu[0]);

        String[] labels = new String[salles.length+1];

        for ( int i = 0 ; i < salles.length ; i++) {
            labels[i] = salles[i].toString();
        }

        labels[salles.length] = "- ANNULER -";

        int choix = IHM.menuBilleterie(labels,"Choisir la salle à modifier");

        if (choix != 0) {
            if (choix == labels.length) {
                mnSalle();
            } else {
                MenuUpdSalles.mnUpdSalles(salles[choix-1]);
            }
        } else {
            IHM.consoleFail("saisie incorrecte");
            updateSalle();
        }
    }


    private static void rmSalle() {

        Lieu[] salles = IHM.serviceBilleterie.getLieux().toArray(new Lieu[0]);
        String[] labels = new String[salles.length+1];

        for ( int i = 0 ; i < salles.length ; i++) {
            labels[i] = salles[i].toString();
        }

        labels[salles.length] = "- ANNULER -";

        int choix = IHM.menuBilleterie(labels,"Choisir la salle à SUPPRIMER");

        if ( choix != 0 ) {
            if (choix == labels.length) {
                mnSalle();
            } else {
               int key = salles[choix-1].getId();
                IHM.serviceBilleterie.deleteLieu(key);
                mnSalle();
            }
        } else {
            IHM.consoleFail("saisie incorrecte");
            rmSalle();
        }

    }



}
