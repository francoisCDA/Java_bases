package org.example.exercice.morpion;

public class Morpion {

    static String[][] grille = {{" ","O","X"},{" "," "," "},{" "," "," "}};

    public static void main(String[] args) {

        display("X");

    }

    static void display(String joueur) {

        System.out.print("\n");

        int cmpt = 7 ;
        for (int i = 0 ; i < grille.length ; i++ ) {
            System.out.print("\t|");
            for (int j = 0; j < grille[i].length; j++) {
                System.out.print(grille[i][j]);
                System.out.print("|");
            }

            System.out.print("\t\t\t|");

            for (int j = 0; j < grille[i].length; j++) {
                System.out.print( grille[i][j] == " " ? cmpt : " " );
                System.out.print("|");
                cmpt++;
            }
            System.out.print("\n");
            cmpt -= 6;
        }

        System.out.printf("\n\t au tour du joueur %s \n\t",joueur);

    }


}
