package org.example.exercice.morpion;

import java.util.Random;
import java.util.Scanner;

public class Morpion {

    static Scanner scan = new Scanner(System.in);

    static Grille grille = new Grille();

    public static void main(String[] args) {

        boolean isGameOver = false;
        String joueur = "X";
        int saisie = -1;
        String saisieTxt = "N";
        int nbCoup = 0 ;
        boolean iaPlay = false;

        System.out.println("Voulez-vous jouer contre l'ordinateur (o/N) ?");
        saisieTxt = scan.next().toUpperCase();

        if (saisieTxt.equals("O")) { iaPlay = true ;}

        while (!isGameOver && !grille.gameTerminated()) {
            saisie = -1 ;
            while (saisie < 0) {
                Display.displayGrille(grille,isGameOver);
                System.out.printf("\n\t au tour du joueur %s \n\t",joueur);
                saisie = scan.nextInt();
                saisie = Display.checkSaisie(grille,joueur, saisie);
            }
             nbCoup++;

            if (nbCoup >= 5 ) {
                isGameOver = grille.checkVictory();
            }

          if ( !isGameOver && !grille.gameTerminated() ) {
                if (iaPlay) {
                    Coord coord = ComputerPlay.bestMove(grille) ;
                    grille.playOn(coord,"O");
                    isGameOver = grille.checkVictory();
                    if (isGameOver) {
                        joueur = joueur.equals("X") ? "O" : "X" ;
                    }
                    nbCoup++;
                } else {
                    joueur = joueur.equals("X") ? "O" : "X" ;
                }
            }
        }

        Display.displayGrille(grille,(isGameOver ^ grille.gameTerminated()));

        if (grille.checkVictory()) {
            System.out.println("\n\t\t" + joueur + "  a gagné !");
        } else {
            System.out.println("\n\t\tMatch nul !");
        }
    }



}



