package org.example.exercice;

import java.util.Scanner;

public class ExoConditionsStructurelles {

    static Scanner scanner = new Scanner(System.in);

    public static void exo5_1() {

        System.out.println("\n\n #### exercice 5.1");

        int nbre = 0;
        long nbreATrouver = Math.round(Math.random()*2) +1;

        while (nbre != nbreATrouver) {
            System.out.println("trouver le nombre entre 1 et 3");
            nbre = scanner.nextInt();
            if (nbre != nbreATrouver) {
                System.out.println("essayes encore !");
            }
        }

        System.out.println("Gagné !");

    }

    public static void exo5_2() {

        System.out.println("\n\n #### exercice 5.2");

        int nbre = 0;
        long nbreATrouver = Math.round(Math.random()*10) + 10;

        while (nbre != nbreATrouver) {
            System.out.println("trouver le nombre entre 10 et 20");
            nbre = scanner.nextInt();
            if (nbre < 10) {
                System.out.println("Plus Grand !");
            }
            if (nbre > 20) {
                System.out.println("Plus Petit !");
            }
        }

        System.out.println("Gagné !");


    }

    public static void exo5_3() {

        System.out.println("\n\n #### exercice 5.3");

        int nbre;
        String liste = "";
        System.out.println("saisir un nombre");
        nbre = scanner.nextInt();

        for (Integer i = nbre + 1 ; i < nbre + 11 ; i++) {
            liste += i.toString() + " ";
        }
        System.out.println(liste);

   }

    public static void exo5_4() {

        System.out.println("\n\n #### exercice 5.4");

        int nbre;
        int i;
        System.out.println("saisir un nombre");
        nbre = scanner.nextInt();

        i = nbre;
        while (i < nbre + 10) {
            System.out.println(++i);
        }

    }


    public static void exo5_5() {

        System.out.println("\n\n #### exercice 5.5");

        int nbre;

        System.out.println("saisir un nombre");
        nbre = scanner.nextInt();

        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println( nbre + " x " + i + " = " + i * nbre);
        }

    }

    public static void exo5_6() {

        System.out.println("\n\n #### exercice 5.6");

        int nbre;
        int somme = 0;
        System.out.println("saisir un nombre");
        nbre = scanner.nextInt();

        for (int i = 1 ; i <= nbre ; i++ ) {
            somme+=i;
        }
        System.out.println("somme des entiers de 1 à "+ nbre + " = " + somme);

    }

    public static void exo5_7() {

        System.out.println("\n\n #### exercice 5.7");

        int nbre;
        int max = 0;

        System.out.println("Entrer le nombre 1 : ");
        max = scanner.nextInt();

        for (int i = 2 ; i <= 20 ; i++) {
            System.out.println("Entrer le nombre "+ i + " : ");
            nbre = scanner.nextInt();
            max = Math.max(max, nbre);
        }

        System.out.println("Le plus grand de css nombres était " + max);

    }

    public static void exo5_7_2() {

        System.out.println("\n\n #### exercice 5.7.2");

        int nbre;
        int max = 0;
        int indice = 1;

        System.out.println("Entrer le nombre 1 : ");
        max = scanner.nextInt();

        for (int i = 2 ; i <= 20 ; i++) {
            System.out.println("Entrer le nombre "+ i + " : ");
            nbre = scanner.nextInt();
            if (max < nbre)  {
                max = nbre;
                indice = i;
            }
        }

        System.out.println("Le plus grand de ces nombres était " + max );
        System.out.println("C'était le numéro " + indice );

    }

    public static void exo5_8() {

        System.out.println("\n\n #### exercice 5.8");

        int nbre;
        long factorielle = 1L;
        System.out.println("saisir un nombre");
        nbre = scanner.nextInt();

        if (nbre == 0) {
            System.out.println("0! = 1");
        } else {
            for (int i = 1 ; i <= nbre ; i++ ) {
                factorielle *= i;
            }
            System.out.println( nbre + "! = " + factorielle);
        }
    }

    public static void exo5_9() {

        System.out.println("\n\n #### exercice 5.9");

        int nbre ;
        int max = 0;
        int indice = 1;
        int cmpt = 1;

        System.out.println("Entrer le nombre 1 (0 pour arrêter) : ");
        max = scanner.nextInt();
        nbre = max;

        while ( nbre != 0 ) {
            cmpt++ ;
            System.out.println("Entrer le nombre "+ cmpt + "  (0 pour arrêter) : ") ;
            nbre = scanner.nextInt() ;
            if (max < nbre)  {
                max = nbre;
                indice = cmpt;
            }
        }

        System.out.println("Le plus grand de ces nombres était " + max );
        System.out.println("C'était le numéro " + indice );

    }

    public static void exo5_10() {

        System.out.println("\n\n #### exercice 5.10");

        int prix = -1 ;
        int somme = 0 ;
        int paiement = 0 ;
        int diff ;
        int nbBillet10 = 0 ;
        int nbBillet5 = 0 ;
        int nbBillet1 = 0 ;


        while ( prix != 0 ) {

            System.out.println("Entrer le prix de l'article suivant (0 pour arrêter) :") ;
            prix = scanner.nextInt() ;
            if (prix < 0 ) {
                System.out.println("Il n'existe pas de prix négatif ");
            } else {
                somme += prix;
            }

        }

        System.out.println("\nTotal à payer :" + somme + "€");

        while (paiement < somme ) {
            System.out.println("\nVous payez combien :") ;
            paiement = scanner.nextInt() ;
            if (paiement<somme) {
                System.out.println(" >>>> paiement insuffisant ! \n") ;
            }
        }

        diff = paiement - somme;

        System.out.println("À rendre : " + diff );

        while (diff >= 10 ) {
            nbBillet10++;
            diff -= 10;
        }

        while (diff >= 5 ) {
            nbBillet5++;
            diff -= 5;
        }
        while (diff > 0 ) {
            nbBillet1++;
            diff -=1;
        }


        System.out.println("Total à payer : " + somme );
        System.out.println("Le client a payé : " + paiement );


        if (nbBillet10 > 0) {
            System.out.println(" billet de 10€ à rendre: " + nbBillet10 );
        }

        if (nbBillet5 > 0) {
            System.out.println(" billet de 5€ à rendre : " + nbBillet5 );
        }

        if (nbBillet1 > 0) {
            System.out.println(" pièce de 1€ à rendre : " + nbBillet1 );
        }

    }

    public static void exo5_11() {

        System.out.println("\n\n #### exercice 5.11");

        int somme = 0;
        int compteur = 0;

        while (somme < 100) {
            compteur++;
            somme += compteur;
        }

        System.out.println(" la somme des nombres de 1 à " + compteur + " = " + somme );


}
}

