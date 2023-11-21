package org.example.exercice;

import java.util.Arrays;

public class ExoFunction {


    public static int findMaxIntInArray(int[] intArray) {

        int max = intArray[0];

        for (int nb : intArray) {
            if (max < nb) {
                max = nb;
            }
        }

        return max;
    }

    public static int[] parseArStringToArInt(String[] nbTxt) {

        int[] nbInt = new int[nbTxt.length];

        for (int i = 0; i < nbTxt.length ; i++) {
            nbInt[i] = Integer.parseInt(nbTxt[i]);
        }

        return nbInt ;
    }


    public static void getExo1() {

        System.out.println("\n ***** exo1 *****");

        String nbres;
        String[] arNbres;
        int[] entiers;

        System.out.println("Saisir des entiers séparés par un espace");
        nbres = Jeux.scannerGame.nextLine();

        arNbres = nbres.trim().split(" ");

        entiers = new int[arNbres.length];

        for (int i = 0; i < arNbres.length; i++) {
            entiers[i] = Integer.parseInt(arNbres[i]);
        }

        System.out.printf(" le plus grans nombre saisi est : %d\n", findMaxIntInArray(entiers));
    }


    public static void printLigne(String symbole,int repeat) {

        for (int i = 0 ; i < repeat ; i++) {
            System.out.print(symbole);
        }

    }

    public static void drawRectangle(int hauteur, int largeur) {

        System.out.println("\n");

        printLigne("*",largeur);
        System.out.print("\n");
        for (int i = 2; i < hauteur ; i++) {
            System.out.print("*");
            printLigne(" ",largeur-2);
            System.out.print("*");
            System.out.print("\n");
        }
        printLigne("*",largeur);

        System.out.println("\n");
    }

    public static void getExo2() {

        System.out.println("\n ***** exo2 *****");

        int hauteur ;
        int largeur ;

        System.out.println("saisir une hauteur");
        hauteur = Jeux.scannerGame.nextInt();

        System.out.println("saisir largeur");
        largeur = Jeux.scannerGame.nextInt();

        drawRectangle(hauteur,largeur);

    }

    public static int getWordsAmount(String phrase) {

        String[] arMots = phrase.trim().split(" ");

        return arMots.length ;

    }


    public static void getExo3() {

        System.out.println("\n ***** exo3 *****");

        String txt;

        System.out.println("Saisir du texte :");
        txt = Jeux.scannerGame.nextLine();

        System.out.printf(" la phrase saisie compte %d mots.\n", getWordsAmount(txt));
    }

    public static String[] filterWordsByLength(int minLength, String[] mots) {

        StringBuilder retour = new StringBuilder();
        String ret;

        for (String m:mots) {
            if (m.length() >= minLength) {
                retour.append(m);
                retour.append(" ");
            }
        }

        ret = retour.toString();

        return ret.split(" ");

    }


    public static void getExo4() {

        System.out.println("\n ***** exo4 *****");

        String mots;
        String[] arMots;
        int tailleMini;

        System.out.println("Saisir une liste de mot aléatoire :");
        mots = Jeux.scannerGame.nextLine();
        arMots = mots.split(" ");

        System.out.println("Saisir une longueur minimal de mot :");
        tailleMini = Jeux.scannerGame.nextInt();


        System.out.println("\nliste des mots filtrés sur une longeur minimum de : " + tailleMini );
        System.out.println(Arrays.toString(filterWordsByLength(tailleMini,arMots)));
    }


    public static int gcdRecursive(int a, int b) {


        if ( b == 0 ) {
            return a ;
        } else if (a == 0) {
            return b ;
        } else {
            System.out.println(a%b);
            return gcdRecursive(a%b,a) ;
        }

    }


    public static void getExo6() {

        System.out.println("\n ***** exo6 *****");

        String nbres;
        String[] arNbStr;
        int[] arNbInt ;

        System.out.println("Saisir des entiers séparés par un espace");
        nbres = Jeux.scannerGame.nextLine();

        arNbStr = nbres.trim().split(" ");
        arNbInt = parseArStringToArInt(arNbStr);


        System.out.printf("\nLe plus grand diviseur commun entre %d et %d est %d \n",arNbInt[0],arNbInt[1],gcdRecursive(arNbInt[0],arNbInt[1]));

    }


}