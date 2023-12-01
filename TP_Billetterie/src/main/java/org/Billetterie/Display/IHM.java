package org.Billetterie.Display;

import org.Billetterie.Classes.Lieu;
import org.Billetterie.JSQL.DDBBilletterie;
import org.Billetterie.JSQL.FakeData;

import java.util.Scanner;

public class IHM {

    private static Scanner scan = new Scanner(System.in);

    private static DDBBilletterie maBilletterie = new DDBBilletterie() ;

    public static void initBilleterie() {
        FakeData.initBilleterie(maBilletterie);
        System.out.println(maBilletterie);
        System.out.println("\n\t *** Billetterie initialisée ***");
    }


    public static void start() {

        int choix;
        String[] mainMenu = {"Menu salles", "Menu évènements", "Menu clients", "Quitter l'application"};


        choix = MenuBilleterie(mainMenu);

        switch (choix) {
            case 1 -> menuSalle();

            case 2 -> menuEvent();

            case 3 -> menuClient();

            default -> System.out.println("Au revoir");
        }


    }

    private static void menuClient() {
        System.out.println("à implémenter");
        start();
    }

    private static void menuEvent() {
        System.out.println("à implémenter");
        start();
    }

    private static void menuSalle() {
        int choix;
        String[] mainMenu = {"Afficher les salles", "Ajouter une salle", "Modifier une salle", "Supprimer une salle", "Retour au menu principal"};

        choix = MenuBilleterie(mainMenu);

        switch (choix) {
            case 1 -> afficheSalles();

            case 2 -> addSalle();

            case 3 -> changeSalle();

            case 4 -> rmSalle();

            default -> start();
        }
    }

    private static void afficheSalles() {
       Lieu[] salles = maBilletterie.getSalles();

       for (Lieu s:salles) {
           System.out.println(s.toString());
       }

        menuSalle();
    }

    private static void addSalle() {

        String nom, adresse;
        int capacite;

        System.out.println(" *** AJOUTER UNE SALLE *** ");
        System.out.println("\n\t nom de la salle :");
        nom = scan.nextLine();

        System.out.println("\t adresse de la salle :");
        adresse = scan.nextLine();

        System.out.println("\t capacité de la salle :");
        capacite = scan.nextInt();
        scan.nextLine();

        if (capacite > 0) {
            maBilletterie.addSalle(nom,adresse,capacite);
            System.out.println("\t >> Nouvelle salle ajoutée");
        } else {
            System.out.println("\t !! Capacité négative, ajout impossible");
        }


        menuSalle();
    }

    private static void changeSalle() {


        System.out.println("à implémenter");

        menuSalle();
    }

    private static void rmSalle() {

        System.out.println("à implémenter");

        menuSalle();
    }


    private static int MenuBilleterie(String[] menu) {

        int saisie ;

        System.out.println("\n > CHOISIR UNE OPTION :");
        for (int i = 0 ; i < menu.length ; i++ ) {
            System.out.printf("\n\t %d : %s",i+1,menu[i]);
        }
        System.out.print("\n\n\t> ");
        try {
            saisie = scan.nextInt();
            if (saisie < 1 || saisie > menu.length) {
                System.out.println("\t ! Saisie invalide");
                return 0;
            }
            return saisie;
        } catch ( Exception e ) {
            System.out.println("Saisie Incorrecte : " + e.getMessage());
            return 0;
        }

    }



}
