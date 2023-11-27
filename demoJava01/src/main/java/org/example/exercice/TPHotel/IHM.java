package org.example.exercice.TPHotel;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class IHM {

    private static Scanner scan = new Scanner(System.in);

    private  static Hotel monHotel;

    public static void newHotel() {

        System.out.println("\n\t\t ******* HOTEL ASSISTANT 1.0 *******");

        String saisie;

        System.out.println("\n\t Bonjour, quel est le nom de l'hôtel ?");

        saisie = scan.next();

        monHotel = new Hotel(saisie);

        System.out.printf("\n\t Bienvenu à l'hôtel %s",monHotel.getNom());

        displayMenu();
    }


    public static void displayMenu() {

        int choix ;

        System.out.println("\n");
        System.out.println("\t 1 - Ajouter un client");
        System.out.println("\t 2 - Afficher la liste des clients");
        System.out.println("\t 3 - Afficher les réservation d'un client");
        System.out.println("\t 4 - Ajouter une réservation");
        System.out.println("\t 5 - Annuler une réservation");
        System.out.println("\t 6 - Afficher la liste des réservation");

        System.out.println("\n\t 0 - Quitter HOTEL ASSISTANT");

        System.out.println("\n\n\t\t => Selectionner une action :");

        choix = scan.nextInt();


        if (choix != 0 ) {

            switch (choix) {

                case 1 -> nouvoClient();

                case 2 -> printClients();

                case 3 -> printClientReservation();

                case 4 -> newReservation();

                case 5 -> cancelReservation();

                case 6 -> printReservation();

                default -> System.out.println("\n\t !!! Choix invalide");

            }

            displayMenu();

        } else {
            scan.close();
            System.out.println("\n\t Merci d'avoir utilisé Hotel Assistant");
        }

    }

    private static void newReservation() {

        int clientID,numChambre;

        System.out.println("\n\t\t *** Création d'une nouvelle réservation ***");
        System.out.println("\n\t -> Indiquer l'ID du client");
        clientID = scan.nextInt();

        System.out.println("\n\t -> Indiquer le numéro de chambre");
        numChambre = scan.nextInt();

        monHotel.reserver(clientID,numChambre);

    }

    private static void printClientReservation() {
        int idClient;
        System.out.println("n\t => quelle est l'ID du client dont vous voulez les réservatrions (0 pour revenir au menu) ?");

        idClient = scan.nextInt();

        if (idClient > 0) {
            monHotel.getReservationByClient(idClient);
        }

    }

    private static void cancelReservation() {
        int numToCancel;
        System.out.println("n\t *** Annuler une réservation ***");
        System.out.println("n\t => quelle réservation souhaitez vous annuler (0 pour revenir au menu) ?");

        numToCancel = scan.nextInt();

        if (numToCancel > 0) {
            monHotel.reservationCancel(numToCancel);
        }
    }


    private static void printReservation() {
        System.out.println("\t Liste des réservations :");
        //System.out.println(Arrays.toString(monHotel.getClientList()));
        Reservation[] reservTable = monHotel.getReservationList();
        for (Reservation re:reservTable) {
            System.out.printf("\n Num : %d, client : %s, id : %d, chambre : %d, statut : %s",re.getNumero(),monHotel.getClientByID(re.getClientID()),re.getClientID(),re.getNumero(),re.statut() );
        }
    }

    private static void printClients() {
        System.out.println("\t Liste des clients de l'hôtel :");

        Client[] clientsTable = monHotel.getClientList();
        for (Client cl:clientsTable) {
            System.out.printf("\n ID : %d, %s %s, %d",cl.getId(),cl.getFirstname(),cl.getLastname(),cl.getTelephone());
        }
    }

    private static void nouvoClient() {

        String lastName, firstName ;
        int phone;

        System.out.println("\n\t\t *** Création d'un nouveau client ***");
        System.out.println("\n\t -> Indiquer le Nom de famille");
        lastName = scan.next().trim();

        System.out.println("\n\t -> Indiquer le prénom");
        firstName = scan.next().trim();

        System.out.println("\n\t -> Indiquer le numéro de téléphone");
        phone = scan.nextInt();

        monHotel.nouveauCLient(lastName,firstName,phone);

    }



}
