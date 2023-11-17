package org.example.ExoTableauSerieA;

import org.example.Main;

import java.util.Scanner;

public class SerieA {

    static Scanner scanner = new Scanner(System.in);

    public static void getExo1() {
        System.out.println("\n\nExercice 1 ");

        int[] monTab = new int[5];

        for ( int i = 0 ; i < monTab.length ; i ++ ) {
            monTab[i] = i+1;
        }

        for ( int i = 0 ; i < monTab.length ; i ++ ) {
            System.out.println("valeur " + i + " du tableau : " + monTab[i]);
        }

    }



    public static void getExo2() {

        System.out.println("\n\nExercice 2 ");

        int[] monTab = new int[10];

        for ( int i = 0 ; i < monTab.length ; i ++ ) {
            monTab[i] = i+1;
        }

        for ( int i = 0 ; i < monTab.length ; i ++ ) {
            System.out.println("valeur " + i + " du tableau : " + monTab[i]);
        }

    }

    public static void getExo3() {
        System.out.println("\n\nExercice 3 ");

        String retour = " n'est pas dans la liste";
        int saisie ;
        int[] monTab = new int[8];

        for ( int i = 0 ; i < monTab.length ; i ++ ) {
            monTab[i] = i * 10;
        }

        System.out.println("Saisissez un nombre entier");
        saisie = scanner.nextInt();

        for ( int i = 0 ; i < monTab.length ; i ++ ) {

            if (monTab[i] == saisie ) {
                retour = " est bien dans la liste";
                break;
            } else {

            }
        }

        System.out.println(saisie + retour);

    }


    public static void getExo4() {
        System.out.println("\n\nExercice 4 ");

        boolean allPairs = true ;
        int taille;
        int[] monTab = new int[5];

        System.out.println("Combien d'entier voulez-vous saisir ?");
        taille = scanner.nextInt();

        if (taille > 0) {

            monTab = new int[taille];

            for ( int i = 0 ; i < monTab.length ; i ++ ) {
                System.out.println("Saisissez un nombre :" + (i+1) + "/" + taille);
                int saisie = scanner.nextInt();

                monTab[i] = saisie;

                if (saisie%2 != 0) {
                    allPairs = false;
                }

            }

            if (allPairs) {
                System.out.println("Tous les éléments sont pairs");
            } else {
                System.out.println("Au moins un élément est impaire");
            }

        }
    }



    public static void getExo5() {
        System.out.println("\n\nExercice 5 ");

        long[] monTab = new long[10];

        for ( int i = 0 ; i < monTab.length ; i ++ ) {
            monTab[i] = Math.round(Math.random()*99) + 1 ;
        }

        for ( int i = 0 ; i < monTab.length ; i ++ ) {
            System.out.println("valeur " + (i+1) + " du tableau : " + monTab[i]);
        }

    }


    public static void getExo6() {
        System.out.println("\n\nExercice 6 ");

        long[] monTabA;
        long[] monTabB;
        int taille;

        System.out.println("quelle doit être la taille des tableaux ?");
        taille = scanner.nextInt();

        monTabA = new long[taille];
        monTabB = new long[taille];

        for ( int i = 0 ; i < taille ; i ++ ) {
            monTabA[i] = Math.round(Math.random()*99) + 1 ;
            monTabB[i] = Math.round(Math.random()*99) + 1 ;

            System.out.println( monTabA[i] + " + " + monTabB[i] + " = " + (monTabA[i] + monTabB[i]) );
        }

    }


    public static void getExo7() {
        System.out.println("\n\nExercice 7 ");

        long max = 0 ;
        long[] monTab = new long[10];

        for ( int i = 0 ; i < monTab.length ; i ++ ) {
            monTab[i] = Math.round(Math.random()*99) + 1 ;

            if (max < monTab[i]) {
                max = monTab[i];
            }

        }

        System.out.println("le plus grand nombre généné est : " + max);

        scanner.close();
    }


}
