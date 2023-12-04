package org.Billetterie.Display.Menus;

import org.Billetterie.Classes.Billet;
import org.Billetterie.Classes.Client;
import org.Billetterie.Classes.Event;
import org.Billetterie.Classes.Exceptions.DateError;
import org.Billetterie.Classes.Exceptions.PasAssezDePlace;
import org.Billetterie.Display.Exceptions.SaisieNull;
import org.Billetterie.Display.IHM;
import org.Billetterie.JSQL.DDBBilletterie;
import org.Billetterie.JSQL.MaBilletterie;

public class BilletsClient {

    public static void mnBilletClient(Client client) {
        String[] gestionBillets = {"Afficher les réservations client : "+ client.getBillets().length, "acheter des billets"," - RETOUR -"};

        int choix = IHM.menuBilleterie(gestionBillets);

        switch (choix) {
            case 1 -> affBilletClient(client);
            case 2 -> achatBillet(client);
            case 3 -> OptionCLient.optClient(client);
            default -> mnBilletClient(client);
        }
    }

    private static void affBilletClient(Client client) {
        Billet[] reservations = client.getBillets();

        if (reservations.length == 0) {
          IHM.consoleConfirm("Le client n'a aucune réservation");
        } else {
            for (Billet b:reservations) {
                IHM.consoleLi(b.toString());
            }
        }
        mnBilletClient(client);
    }

    private static void achatBillet(Client client) {
        DDBBilletterie laBilletrie = MaBilletterie.getBilletterie();

        Event[] evenements = laBilletrie.getEvent();

        String[] menuStr = new String[evenements.length+1];

        for (int i = 0 ; i < evenements.length ; i++) {
            menuStr[i] = evenements[i].toString();
        }
        menuStr[evenements.length] = " - RETOUR -";


        int choix = IHM.menuBilleterie(menuStr,"Acheter un billet");

        if ( choix != 0 ) {
            choix--;
            if (choix == evenements.length) {
                mnBilletClient(client);
            } else {

                IHM.consoleConfirm("Evènement sélectionné : " + evenements[choix].toString());
                try {
                    int nbPlaces = IHM.inputNumber("Combien de place");
                    try {
                        client.achetteBillet(evenements[choix].vendreBillet(nbPlaces));
                        mnBilletClient(client);
                        IHM.consoleConfirm("Achat validé");
                    } catch (PasAssezDePlace err) {
                        IHM.consoleError("Nombre de Places libres Insuffisante : ");
                        achatBillet(client);
                    } catch (DateError err) {
                        IHM.consoleError("Date Error : " + err.getMessage());
                        achatBillet(client);
                    }

                } catch (SaisieNull err) {
                    IHM.consoleError("Achat annulé : " + err.getMessage());
                    achatBillet(client);
                }

            }

        } else {
            IHM.consoleFail("saisie invalide");
            achatBillet(client);
        }

    }
}
