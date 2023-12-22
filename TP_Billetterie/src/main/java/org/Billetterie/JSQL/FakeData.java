package org.Billetterie.JSQL;

import org.Billetterie.Display.IHM;
import org.Billetterie.JSQL.Exceptions.KnowMail;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class FakeData {

    // aveux: les variables ont été générées pas chatGPT

    public static final String[] nomsSalle = new String[]{"Le Phoenix", "SonoSphere", "Groove Haven", "RockPulse", "JazzEcho", "Mélodie Arena", "Riff Hall", "Harmony Loft", "Beats Auditorium", "Vibe Pavilion"};
    public static final String[] rues = new String[]{"Rue de la Musique", "Avenue des Artistes", "Place du Spectacle", "Boulevard du Rythme", "Allée des Notes", "Chemin des Scènes", "Impasse des Concerts", "Quai des Mélodies", "Route des Harmonies", "Passage des Accords"};
    public static final String[] villes = new String[]{"Paris", "Lyon", "Marseille", "Bordeaux", "Lille", "Toulouse", "Nice", "Nantes","Strasbourg", "Rennes"};
    public static final String[] codesPostaux = new String[]{"75001", "69001", "13001", "33000", "59000", "31000", "06000", "44000","67000", "35000"};


    public static final String[] lastnames = new String[]{"Dupont", "Lefebvre", "Dubois", "Martin", "Bernard", "Thomas", "Robert", "Richard", "Petit", "Durand", "Leroy", "Moreau", "Simon", "Laurent", "Michel" };

    public static final String[] firstnames = new String[]{"Jean", "Pierre", "Marie", "Paul", "Julie", "Sophie", "Luc", "Alice", "Antoine", "Camille","Léa", "Louis", "Emma", "Adrien", "Clara"};

    public static final String[] eventName = new String[]{"Toto tournée 2024", "Henri Van Hallen", "TedTalk: Les Any c'est la vie.", "Pour ou contre les débats", "Java A cappela by Christophe D", "The Utopic Quintet", "Antoine D && the Reactvenger", "Another place to be", "Another beer to place", "The Bootstrap Blues Compagnons"};


    // mais pas les méthodes

    private static String mkAdress(int i) {
        return rues[i] + " " + codesPostaux[i] + " " + villes[i];
    }

    private static String mkCourriel(int i) {
        return firstnames[i]+"."+lastnames[i]+"@fmail.org";
    }



    public static void initSQL() {

        Random rand = new Random();

        for (int i = 0 ; i < nomsSalle.length ; i++) {
            IHM.serviceBilleterie.addNewLieu(nomsSalle[i],mkAdress(i),rand.nextInt(200)+100);
        }

        for ( int i = 0 ; i < lastnames.length ; i++ ) {
            IHM.serviceBilleterie.addNewClient(lastnames[i], firstnames[i], mkCourriel(i));
        }

        LocalDate hui = LocalDate.now();

        for (int i = 0 ; i < eventName.length ; i++) {

            String nom = eventName[i];
            LocalDate date = hui.plusDays(rand.nextInt(30)-10);
            LocalTime time = LocalTime.of(rand.nextInt(9)+12,0,0) ;
            int idSalle = rand.nextInt(9)+1; ;
            Double prix = rand.nextDouble(100)+50;

            IHM.serviceBilleterie.addNewEvent(nom ,date, time,idSalle,prix);
        }

    }

//
//    public static void initBilleterie(DDBBilletterie billetterie) {
//
//        Random rand = new Random();
//
//        for (int i = 0 ; i < nomsSalle.length ; i++) {
//            billetterie.addSalle(nomsSalle[i],mkAdress(i), rand.nextInt(200)+100);
//        }
//
//        for ( int i = 0 ; i < lastnames.length ; i++ ) {
//            try {
//                billetterie.addClient(lastnames[i], firstnames[i], mkCourriel(i));
//            }  catch (KnowMail e) {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        LocalDate hui = LocalDate.now();
//
//        for (int i = 0 ; i < eventName.length ; i++) {
//            billetterie.addEvent(eventName[i],hui.plusDays(rand.nextInt(30)-10), LocalTime.of(rand.nextInt(9)+12,0),billetterie.randLieu(), rand.nextInt(50)+10);
//        }
//
//    }



}
