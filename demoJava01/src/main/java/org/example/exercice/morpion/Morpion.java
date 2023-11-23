package org.example.exercice.morpion;

import org.example.exercice.Jeux;

import java.util.Scanner;

public class Morpion {

    static String[][] grille = {{" "," "," "},{" "," "," "},{" "," "," "}};

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isGameOver = false;
        String joueur = "X";
        int saisie = -1;
        int nbCoup = 0 ;


        while (!isGameOver) {
            saisie = -1 ;
            while (saisie < 0) {
                display(joueur,isGameOver);
                System.out.printf("\n\t au tour du joueur %s \n\t",joueur);
                saisie = scan.nextInt();
                saisie = checkSaisie(joueur, saisie);
            }
             nbCoup++;

            if (nbCoup >= 5 ) {
                isGameOver = checkVictory();
            }

            if (!isGameOver) {
                joueur = joueur == "X" ? "O" : "X" ;
            }
        }

        display(joueur,isGameOver);

        if (checkVictory()) {
            System.out.println("\n\t\t" + joueur + "  a gagné !");
        } else {
            System.out.println("Match nul !");
        }


    }

    private static boolean checkVictory() {

        for (int i = 0 ; i < 3 ; i++ ) {
            if ( grille[0][i] != " " &&  grille[0][i] == grille[1][i] && grille[0][i] == grille[2][i] ||
                 grille[i][0] != " " &&  grille[i][0] == grille[i][1] && grille[i][0] == grille[i][2] ) {
                return true ;
            }
        }

        if ( !grille[1][1].equals(" ") && ( (grille[1][1].equals(grille[0][0]) && grille[1][1].equals(grille[2][2])) ||
                                            (grille[1][1].equals(grille[0][2]) && grille[1][1].equals(grille[2][0])) )
        ) {
          return true ;
        }


        return false ;
    }


    private static int checkSaisie(String joueur, int saisie) {

        if (saisie > 9 || saisie < 1) { return -1 ; }

        int cmpt = 7 ;

        for (int i = 0 ; i < grille.length ; i++) {
            for ( int j = 0 ; j < grille[0].length ; j++ ) {
                if (cmpt  == saisie) {
                    if (grille[i][j].equals(" ")){
                        grille[i][j] = joueur;
                        return saisie;
                    } else {
                        return -1;
                    }
                }
                cmpt++ ;
            }
            cmpt -= 6 ;
        }
        return -1 ;
    }


    static void display(String joueur,boolean isGameOver) {

        System.out.print("\n");

        int cmpt = 7 ;
        for (int i = 0 ; i < grille.length ; i++ ) {
            if (isGameOver) { System.out.print("\t\t"); }
            System.out.print("\t[");
            for (int j = 0; j < grille[i].length; j++) {
                System.out.print(grille[i][j]);
                if (j != grille.length -1 ) {
                    System.out.print("|");
                } else {
                    System.out.print("]");
                }

            }

            if (!isGameOver) {

                System.out.print("\t\t\t|");

                for (int j = 0; j < grille[i].length; j++) {
                    System.out.print( grille[i][j] == " " ? cmpt : " " );
                    System.out.print("|");
                    cmpt++;
                }
                System.out.print("\n");
                cmpt -= 6;
            } else {
                System.out.print("\n");
            }
        }
    }
}