package org.Billetterie.Display.Menus;

import org.Billetterie.Classes.Client;
import org.Billetterie.Classes.Event;
import org.Billetterie.Display.IHM;
import org.Billetterie.JSQL.DDBBilletterie;
import org.Billetterie.JSQL.Exceptions.KnowMail;
import org.Billetterie.JSQL.MaBilletterie;

import java.util.ArrayList;

public class OptionCLient {
    public static void optClient(Client client) {

        String[] infosClient = new String[5];
        int choix ;

        infosClient[0] = "Modifier : " + client.getLastname();
        infosClient[1] = "Modifier : " + client.getFirstname();
        infosClient[2] = "Modifier : " + client.getEmail();
        infosClient[3] = "Gestion des billets du client -> ";
        infosClient[4] = " - RETOUR - ";

        choix = IHM.menuBilleterie(infosClient);

        switch (choix) {
            case 1 -> updLast(client);
            case 2 -> updFirst(client);
            case 3 -> updMail(client.getEmail());
            case 4 -> BilletsClient.mnBilletClient(client);
            case 5 -> MenuClient.mnClient();
            default -> optClient(client);
        }

    }

    private static void updLast(Client client) {
        String newLast  = IHM.inputText("Nouveau nom").trim();
        if (!newLast.isEmpty() && IHM.isNoNumberChain(newLast)) {
            client.setLastname(newLast);
            IHM.consoleConfirm("Infos client mis à jour : " + client.toString());
        } else {
            IHM.consoleFail("Saisie invalide : nom inchangé");
        }
        optClient(client);
    }

    private static void updFirst(Client client) {
        String newFirst  = IHM.inputText("Nouveau prénom").trim();
        if (!newFirst.isEmpty() && IHM.isNoNumberChain(newFirst)) {
            client.setFirstname(newFirst);
            IHM.consoleConfirm("Infos client mis à jour : " + client.toString());
        } else {
            IHM.consoleFail("Saisie invalide: prénom inchangé");
        }
        optClient(client);
    }

    private static void updMail(String key) {
        String newMail = IHM.inputText("Nouveau courriel");

        if (IHM.isCourrielFormat(newMail)) {
            DDBBilletterie laBilleterie = MaBilletterie.getBilletterie();
            try {
                laBilleterie.changeMail(key,newMail);
                IHM.consoleConfirm("Client mis à jour : "+ laBilleterie.getClient(newMail).toString());
                optClient(laBilleterie.getClient(newMail));
            } catch (KnowMail err) {
                IHM.consoleError("Problème de mail : " + err.getMessage() + ", aucun changement");
                optClient(laBilleterie.getClient(key));
            }
        }
    }

}
