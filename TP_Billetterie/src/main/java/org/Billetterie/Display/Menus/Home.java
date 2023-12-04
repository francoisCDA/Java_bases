package org.Billetterie.Display.Menus;

import org.Billetterie.Display.IHM;

public class Home {

    public static void mainMenu() {

        Integer choix;
        String[] mainMenu = {"Gestion des lieux", "Gestion des évènements", "Gestion des clients", "Quitter l'application"};

        choix = IHM.menuBilleterie(mainMenu, "Menu principal");

        switch (choix) {
            case 1 -> MenuSalles.mnSalle();
            case 2 -> MenuEvent.mvEvent();
            case 3 -> MenuClient.mnClients();
            case 4 -> confirmeQuit();
            default -> mainMenu();
        }

    }

    private static void confirmeQuit() {

        String[] confirQuit = {"Quitter","Revenir à l'accueil"};

        int choix = IHM.menuBilleterie(confirQuit,"Confirmer");

        switch (choix) {
            case 1 -> IHM.H1("Fin du programme");
            case 2 -> mainMenu();
            default -> confirmeQuit();
        }
    }

}
