package org.example.exercice;

import java.util.Arrays;
import java.util.Objects;

public class Matrix {

    public static void getExo1(int[][] matrice) {
        System.out.println(" \n **** Exo1 ****  ");
        int max = matrice[0][0];

        for (int i = 0 ; i < matrice.length ; i++) {
            for (int j = 0 ; j < matrice[i].length ; j++) {
               if (matrice[i][j] > max ) {
                    max = matrice[i][j] ;
               }
            }
        }

        System.out.println(" la plus grande valeur du talbeau est : " + max);

    }

    public static void getExo2() {
        System.out.println(" \n **** Exo2 ****  \n");

        int[][] tableau = new int[4][5] ;
        int cmpt = 0;
        int somme = 0;
        long produit = 1L;

        for (int i = 0 ; i < tableau.length ; i++) {
            for (int j = 0 ; j < tableau[i].length ; j++) {
                tableau[i][j] = ++cmpt;
                somme += cmpt;
                produit *= cmpt;
                System.out.printf(" %d ", cmpt);
            }
            System.out.printf("\n");
        }

        System.out.println("\n somme de la matrice : " + somme);
        System.out.println("\n produit de la matrice : " + produit);
        System.out.println("\n moyenne de la matrice : " + (somme / cmpt));
    }


    public static void getExo3() {
        System.out.println(" \n **** Exo3 ****  \n");

        String saisie = "";
        StringBuilder vendeurs = new StringBuilder();
        String[] tablVendeurs;
        StringBuilder vehicules = new StringBuilder();
        String[] tablVehicules;

        String[][] tableau;

        while (!Objects.equals(saisie, "stop")) {
            System.out.println("Indiquer les vendeurs (stop = quitter) : ");
            saisie = Jeux.scannerGame.next();

            if (!Objects.equals(saisie, "stop")) {
                vendeurs.append(";");
                vendeurs.append(saisie);
                if (saisie.length()<5) {
                    vendeurs.append("\t");
                }
            }
        }

        saisie = "";
        System.out.println("\n");

        while (!Objects.equals(saisie, "stop")) {
            System.out.println("Indiquer les véhicules (stop = quitter) : ");
            saisie = Jeux.scannerGame.next();

            if (!Objects.equals(saisie, "stop")) {
                vehicules.append(";");
                vehicules.append(saisie);
                if (saisie.length()<5) {
                    vehicules.append("\t");
                }
            }
        }

        //System.out.println(vendeurs.toString());

        tablVendeurs = vendeurs.toString().split(";");
        tablVehicules = vehicules.toString().split(";");

      //  System.out.println(Arrays.toString(tablVendeurs));
       // System.out.println(Arrays.toString(tablVehicules));

        tableau = new String[tablVehicules.length][tablVendeurs.length];

        tableau[0][0] = "#\t";

        for (int i = 1; i < tablVendeurs.length; i++) {
            tableau[0][i] = tablVendeurs[i];
        }

        for (int i = 1; i < tablVehicules.length; i++) {
            tableau[i][0] = tablVehicules[i];
        }



        for (int i = 1; i < tablVendeurs.length ; i++) {
            for (int j = 1; j < tablVehicules.length; j++) {
                System.out.printf("\n de Combien de %s ont été vendus par %s : \n", tableau[j][0], tableau[0][i]);
              //  System.out.printf("i: %d, j: %d \n",i,j);
                tableau[j][i] = Jeux.scannerGame.next();
            }

        }

        System.out.println("\n");

        for (int i = 0 ; i < tableau.length ; i++) {
            for (int j = 0 ; j < tableau[i].length ; j++) {
                System.out.printf(" %s \t", tableau[i][j] );
            }
            System.out.printf("\n");
        }
    }


}
