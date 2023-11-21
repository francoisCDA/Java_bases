package org.example.exercice;

import java.util.Scanner;

public class ExoString {

    static Scanner scanner = new Scanner(System.in);

    public static void getExo1(String txt ) {
        System.out.printf("\n\n exo 1");

        System.out.printf("\nExercice %s","1");

        String[] tableTxt = txt.trim().split(" ");

        System.out.printf("\nla chaine de catactère compte %d mots",tableTxt.length);
    }

    public static void getExo2(String mot, char lettre) {
        System.out.printf("\n\n exo 2");
        int cmpt = 0;

        for (int i = 0 ; i < mot.length() ; i++ ) {
            if (mot.toLowerCase().charAt(i) == lettre ) {
                cmpt++;
            }
        }

        System.out.printf("\n\nle mot %s compte %d %c",mot, cmpt,lettre);
    }


    public static int getCharInString(String mot, char lettre) {

        int cmpt = 0;

        for (int i = 0 ; i < mot.length() ; i++ ) {

            if (mot.charAt(i) == lettre) {
                cmpt++ ;
            }
        }
        return cmpt ;
    }

    public static void getExo3(String mot1 , String mot2 ) {
        System.out.printf("\n\n exo 3");
        String tableMot1 = mot1.toLowerCase();
        String tableMot2 = mot2.toLowerCase();

        boolean anagramme = true ;

        while (!tableMot1.isEmpty()) {

            if (tableMot1.length() != tableMot2.length()) {
              //  System.out.printf("\n %s %s",tableMot1,tableMot2 );
                anagramme = false ;
                break;
            }

            char test = tableMot1.charAt(0);
            int nb1 = getCharInString(tableMot1,test);
            int nb2 = getCharInString(tableMot1,test);

            if (nb1 != nb2) {
            //    System.out.printf(" %d %d",nb1,nb2 );
                anagramme = false ;
                break;
            } else {
                String monChar = tableMot1.substring(0,1) ;
             //   System.out.println(" Test : "+ monChar);
                tableMot1 = tableMot1.replace(monChar,"");
                tableMot2 = tableMot2.replace(monChar,"");
            }
        }

        if (anagramme) {
            System.out.printf("\n %s et %s sont des anagrammes",mot1, mot2);
        } else {
            System.out.printf("\n %s et %s ne sont pas des anagrammes",mot1, mot2);
        }

    }

    public static void getExo4(String mot ) {
        System.out.printf("\n\n exo 4");

        boolean palindrome = true;

        for (int i = 0 ; i < mot.length()/2 ; i++ ) {
            if (mot.charAt(i) != mot.charAt(mot.length()-1-i) ) {
                palindrome = false ;
                break ;
            }
        }

        if (palindrome) {
            System.out.printf("\n %s est un palindrome", mot);
        } else {
            System.out.printf("\n %s n'est pas un palindrome", mot);
        }

    }

    //static Scanner scanner = new Scanner(System.in);

    public static void getExo5() {
        System.out.printf("\n\n exo 5");
        int hauteur;

        System.out.println("\nQuelle doit être la hauteur de la pyramide ?");
        hauteur = scanner.nextInt();

        for (int i = 1 ; i < hauteur ; i++ ) {
            for (int j = 0 ; j < i ; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        for (int i = hauteur ; i > 0 ; i-- ) {
            for (int j = 0 ; j < i ; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }

    public static void getExo5_bis() {
        System.out.printf("\n\n exo 5_bis");
        int hauteur;
        int delta;
        int etoile = 0;

        System.out.println("\nQuelle doit être la hauteur de la pyramide ?");
        hauteur = scanner.nextInt();
        delta = hauteur ;


        for (int i = 1 ; i < hauteur ; i++ ) {

            delta--;
            etoile++;

            for (int j = 0 ; j < delta ; j++) {
                System.out.printf(" ");
            }
           // System.out.printf("*");
            for (int j = 0 ; j < etoile * 2 ; j++) {
                System.out.printf("*");
            }

            System.out.printf("\n");

        }

    }

}
