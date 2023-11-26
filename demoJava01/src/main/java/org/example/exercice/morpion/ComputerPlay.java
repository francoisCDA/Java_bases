package org.example.exercice.morpion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ComputerPlay {

    public static Coord randomMove(Grille grille) {

        Coord[] coords = grille.getFreeCel();
        int idx = 0 ;

        Random rand = new Random();

        idx = rand.nextInt(coords.length);

        return coords[idx];

    }


    public static Coord bestMove(Grille grille) {

        Coord[] possibles = grille.getFreeCel() ;
        int[] scores = new int[possibles.length];
        String currentPlayer = possibles.length%2 == 0 ? "X" : "O" ;


        for ( int i = 0; i < possibles.length ; i++ ) {
            scores[i] = getScore(grille, possibles[i], currentPlayer);
            if (scores[i] == 1) return possibles[i];
        }

        for (int i = 0 ; i < scores.length ; i++) {
            if (scores[i] == -1) {
                return possibles[i];
            }
        }

        //return randomMove(grille);

        return bestNextMove(possibles,grille);

    }


    public static Coord bestNextMove(Coord[] possibles,Grille grille) {

        if (findCoord(1,1,possibles)) {
            return new Coord(1,1);
        }

        if (findCoord(0,0,possibles)) {
            return new Coord(0,0);
        }

        if (findCoord(2,2,possibles)) {
            return new Coord(2,2);
        }

        if (findCoord(0,2,possibles)) {
            return new Coord(0,2);
        }

        if (findCoord(2,0,possibles)) {
            return new Coord(2,0);
        }

        return randomMove(grille);

    }


    public static boolean findCoord(int i,int j, Coord[] coords) {

        for (int a = 0 ; a < coords.length ; a++) {
            if (coords[a].i == i && coords[a].j == j) {
                return true ;
            }
        }

        return false;
    }


    private static int getScore(Grille grille, Coord ij, String vPlayer) {

        Grille vGrille = new Grille(grille.getGrille());
        vGrille.playOn(ij,vPlayer);
        if (vGrille.checkVictory()) return 1;

        Grille vGrille2 = new Grille(grille.getGrille());
        vGrille2.playOn(ij,vPlayer2(vPlayer));
        if (vGrille2.checkVictory()) return -1;


        return 0;

    }

    private static String vPlayer2(String vPlayer) {
        if (vPlayer == "X") return "O";
        return "X";
    }

}


