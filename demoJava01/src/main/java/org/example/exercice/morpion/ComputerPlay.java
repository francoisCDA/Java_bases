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




}
