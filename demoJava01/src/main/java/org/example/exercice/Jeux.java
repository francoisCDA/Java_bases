package org.example.exercice;

import java.util.Scanner;

public class Jeux {

    static Scanner scannerGame = new Scanner(System.in);

    public static String utilPendu(String mot, String lettres) {

        StringBuilder retour = new StringBuilder();

        for (int i = 0 ; i < mot.length() ; i++ ) {

            String let = String.valueOf(mot.charAt(i));

            if (lettres.contains(let)) {
                retour.append(let);
            } else {
                retour.append("_");
            }

        }

        return retour.toString();
    }

    public static void getPendu(String mot) {

        String lettres = "" ;
        String badLettres= "" ;
        String saisie ;
        int nbTry = 8 ;

        String outString = utilPendu(mot.toLowerCase(),lettres) ;

        while ( outString.contains("_") || nbTry > 0 ) {

            System.out.printf("\n Vous devez deviner le mot : %s, nombre d'essais : %d, erreurs %s  ", outString, nbTry, badLettres);

            System.out.println("\n -> proposer une lettre : ");
            saisie = scannerGame.next();

            if (mot.contains(saisie)) {
                lettres += saisie;
                outString = utilPendu(mot.toLowerCase(),lettres) ;
            } else {
                badLettres += saisie + " " ;
                nbTry--;
            }
        }

        if (outString.contains("_")) {
            System.out.println("\nPerdu, il fallait trouver\n"+ mot);
        } else {
            System.out.printf("\nGagné, %s était le mot à trouver\n",mot);
        }




    }


}
