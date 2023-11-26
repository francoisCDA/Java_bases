package org.example.exercice.morpion;

public class Display {

    public static void displayGrille(Grille grille,boolean isGameOver) {

        System.out.print("\n");

        int cmpt = 7 ;
        for (int i = 0 ; i < grille.length() ; i++ ) {
            if (isGameOver) { System.out.print("\t\t"); }
            System.out.print("\t[");
            for (int j = 0; j < grille.length() ; j++) {
                System.out.print(grille.IJ(i,j));
                if (j != grille.length() - 1 ) {
                    System.out.print("|");
                } else {
                    System.out.print("]");
                }

            }

            if (!isGameOver) {

                System.out.print("\t\t\t|");

                for (int j = 0; j < grille.length(); j++) {
                    System.out.print( grille.IJ(i,j) == " " ? cmpt : " " );
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

    public static int checkSaisie(Grille grille, String joueur, int saisie) {

        if (saisie > 9 || saisie < 1) { return -1 ; }

        int cmpt = 7 ;

        for (int i = 0 ; i < grille.length() ; i++) {
            for ( int j = 0 ; j < grille.length() ; j++ ) {
                if (cmpt  == saisie) {
                    if (grille.IJ(i,j).equals(" ")){
                        grille.playOn(new Coord(i,j),joueur);
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


}
