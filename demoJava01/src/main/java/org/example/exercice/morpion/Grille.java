package org.example.exercice.morpion;

import java.util.ArrayList;
import java.util.List;

public class Grille {

    private String[][] grille ;
    private int length = 3 ;

    public Grille() {
        this.grille = new String[][] {{" "," "," "},{" "," "," "},{" "," "," "}};
    }


    public Grille(String[][] table) {
        if (table != null) {
            this.grille = new String[length][length];
            for ( int i = 0 ; i < length  ; i++ ) {
                this.grille[i] = table[i].clone();
            }
        }
    }

    public String[][] getGrille() {
        return grille;
    }

    public String IJ(int i, int j) {
        return grille[i][j];
    }

    public String IJ(Coord cd) {
        return grille[cd.i][cd.j];
    }

    public void playOn(Coord coord, String joueur) {
        this.grille[coord.i][coord.j] = joueur ;
    }

    public int length() {
        return length;
    }

    public Coord[] getFreeCel() {
        List<Coord> ret = new ArrayList<>();
        for (int i = 0 ; i < length ; i++) {
            for (int j = 0 ; j < length ; j++) {
                if (grille[i][j].equals(" ")) {
                    ret.add(new Coord(i,j));
                }
            }
        }
        return ret.toArray(new Coord[0]) ;
    }

    public boolean checkVictory() {

        for (int i = 0 ; i < 3 ; i++ ) {
            if (!grille[0][i].equals(" ") && grille[0][i].equals(grille[1][i]) && grille[0][i].equals(grille[2][i]) ||
                    !grille[i][0].equals(" ") && grille[i][0].equals(grille[i][1]) && grille[i][0].equals(grille[i][2])) {
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

    public boolean gameTerminated() {
        for (int i = 0 ; i < length ; i++) {
            for (int j = 0 ; j < length ; j++) {
                if (grille[i][j].equals(" ")) {
                    return false ;
                }
            }
        }
        return true;
    }


}
