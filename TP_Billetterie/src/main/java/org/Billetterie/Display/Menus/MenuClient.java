package org.Billetterie.Display.Menus;

import org.Billetterie.Classes.Client;
import org.Billetterie.Classes.Event;
import org.Billetterie.Display.IHM;
import org.Billetterie.JSQL.DDBBilletterie;
import org.Billetterie.JSQL.Exceptions.KnowMail;
import org.Billetterie.JSQL.MaBilletterie;

import java.util.ArrayList;
import java.util.HashMap;

public class MenuClient {

    private static DDBBilletterie maBilleterie = MaBilletterie.getBilletterie();

    public static void mnClients() {

        int choix;
        String[] menuCLient = {"Rechercher un client ->", "Ajouter un client", "- RETOUR -" };

        choix = IHM.menuBilleterie(menuCLient,"Gestion Client");

        switch (choix) {
            case 1 -> mnClient();
            case 2 -> addClient();
            case 3 -> Home.mainMenu();

            default -> mnClients();
        }
    }

    public static void mnClient() {

        Client[] clients = maBilleterie.getAllClients();
        String[] menuData = {"Sélectionner client ->","Recherche par nom","Filtrer par Evènement TODO"," - RETOUR -"};
        int choix;

        IHM.H1("Liste des clients");
        for (Client cl:clients) {
            IHM.consoleLi(cl.toString());
        }

        choix = IHM.menuBilleterie(menuData);

        switch (choix) {
            case 1 -> infoClient(clients);
            case 2 -> searchClient(clients);
            case 3 -> filterByEvent(clients);
            case 4 -> mnClients();
            default -> mnClient();
        }

    }

    private static void infoClient(Client[] clients) {

        String[] labels = new String[clients.length + 2] ;
        int choix;

        for (int i = 0; i < clients.length ; i++) {
            labels[i] = clients[i].toString();
        }

        labels[clients.length] = " - Affiner recherche - ";
        labels[clients.length + 1] = " - RETOUR -";

        choix = IHM.menuBilleterie(labels,"Selectionner un client");

        if (choix != 0) {
            choix--;
            if (choix == clients.length) {
                searchClient(clients);
            } else if (choix == labels.length-1) {
                mnClient();
            } else {
                OptionCLient.optClient(clients[choix]);
            }
        } else {
            IHM.consoleFail("Saisie invalide");
            infoClient(clients);
        }

    }

    private static void searchClient(Client[] clients) {

        String str = IHM.inputText("saisir recherche").toLowerCase();
        ArrayList<Client> selection = new ArrayList<>();

        for (Client cl:clients) {
            if (cl.getLastname().toLowerCase().contains(str) || cl.getFirstname().toLowerCase().contains(str) || cl.getEmail().toLowerCase().contains(str)){
                selection.add(cl);
            }
        }

        if (!selection.isEmpty()) {
            IHM.consoleConfirm(selection.size() + " clients trouvés");
            Client[] selecArray = selection.toArray(new Client[0]);
            infoClient(selecArray);
        } else {
            IHM.consoleFail("Aucun client correspondant");
            mnClients();
        }


    }

    private static void filterByEvent(Client[] clients) {

        HashMap<String,Event> clEvent = new HashMap<>();




    }

    private static void addClient() {

        String last, first, mail;

        IHM.H1("création de client");

        last = IHM.inputText("nom").trim();
        first = IHM.inputText("prénom").trim();
        mail = IHM.inputText("courriel").trim();

        if (!last.isEmpty() && !first.isEmpty() && IHM.isNoNumberChain(last+first) && IHM.isCourrielFormat(mail)) {
            try {
                maBilleterie.addClient(last,first,mail);
                IHM.consoleConfirm("Client créé : " + maBilleterie.getClient(mail).toString() );
            } catch (KnowMail err) {
                IHM.consoleError(err.getMessage() + "aucun client créé");
            }

        } else {
            if (!IHM.isCourrielFormat(mail)) {
                IHM.consoleFail("format courriel invalide");
            } else {
                IHM.consoleFail("problème de saisie");
            }
        }

        mnClients();
    }
}

