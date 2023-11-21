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
        String saisie ;

        String outString = utilPendu(mot.toLowerCase(),lettres) ;

        while ( outString.contains("_") ) {

            System.out.printf("\n Vous devez deviner le mot : %s", outString );

            System.out.println("\n -> proposer une lettre : ");
            saisie = scannerGame.next();
           // System.out.printf("lettre saisie : %s\n",saisie);
           // System.out.println(mot.contains(saisie));

            if (mot.contains(saisie)) {
                lettres += saisie;
           //     System.out.printf("lettres : %s",lettres);

                outString = utilPendu(mot.toLowerCase(),lettres) ;
            }


        }





    }


}
