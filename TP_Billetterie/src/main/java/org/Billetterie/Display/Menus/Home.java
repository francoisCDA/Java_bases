package org.Billetterie.Display.Menus;

import org.Billetterie.Display.IHM;

public class Home {

    public static void mainMenu() {

        Integer choix;
        boolean run = true;

        while (run){

            String[] mainMenu = {"Gestion des lieux", "Gestion des évènements", "Gestion des clients", "Quitter l'application"};

            choix = IHM.menuBilleterie(mainMenu, "Menu principal");

            switch (choix) {
                case 1 -> MenuSalles.mnSalle();
                case 2 -> MenuEvent.mnEvent();
                case 3 -> MenuClient.mnClients();
                case 4 -> run = false;
                //default -> mainMenu();
            }

        }

        confirmeQuit();

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
