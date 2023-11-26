package org.example.exercice.morpion;

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


        return randomMove(grille);

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


