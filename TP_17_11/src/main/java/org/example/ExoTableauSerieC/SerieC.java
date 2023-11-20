package org.example.ExoTableauSerieC;

import org.example.Main;

import java.util.Arrays;

public class SerieC {

    public static void printTab(int[] monTab) {
        for ( int i = 0 ; i < monTab.length ; i ++ ) {
            System.out.println("valeur " + (i+1) + " du tableau : " + monTab[i]);
        }
    }


    public static void getExo5_5(int[] monTab) {
        System.out.println("\nexo 5.5");
        System.out.println(Arrays.toString(monTab));
        int tmp;

        for (int i = 0, j = monTab.length -1 ; i < j ; i++, j-- ) {
            tmp = monTab[i];
            monTab[i] = monTab[j];
            monTab[j] = tmp ;
        }

        System.out.println(Arrays.toString(monTab));
        //printTab(monTab);
    }


    public static void getExo5_6(int[] monTab) {
        System.out.println("\nexo 5.6");

        int min;
        int idx;
        int cmpt = 0;

        for (int i = 0 ; i < monTab.length ; i++ ) {

            min = monTab[i];
            idx = i ;

            for ( int j = i ; j < monTab.length ; j++ ) {
                cmpt++;
                if ( min > monTab[j] ) {
                    min = monTab[j];
                    idx = j;
                }
            }

            monTab[idx] = monTab[i];
            monTab[i] = min;

        }
        System.out.println(Arrays.toString(monTab) + ", tri selection nombre d'itérations : " + cmpt);
        //printTab(monTab);
    }

    public static void getExo5_7(int[] monTab) {
        System.out.println("\nexo 5.7");

        int tmp ;
        boolean pasfini = true;
        int cmpt = 0 ;

        while (pasfini) {
            pasfini = false;
            for (int i = 0 ; i < monTab.length -1 ; i++ ) {
                cmpt++;
                if (monTab[i] > monTab[i+1] ) {
                    pasfini = true;
                    tmp = monTab[i+1];
                    monTab[i+1] = monTab[i];
                    monTab[i]=tmp;
                }
            }
        }
        System.out.println(Arrays.toString(monTab) + ", tri bulle 1 nombre d'itérations : " + cmpt);
        //printTab(monTab);
    }

    public static void getExo5_7_bis(int[] monTab) {
        System.out.println("\nexo 5.7_bis");

        int tmp ;
        boolean pasfini = true;
        int idxStart = 0;
        int idxEnd = monTab.length - 1;

        int cmpt = 0;

        while (pasfini) {

            pasfini = false;

            int first = -1 ;
            int last = idxEnd ;

            for (int i = idxStart ; i < idxEnd ; i++ ) {
                cmpt++;
                if (monTab[i] > monTab[i+1] ) {
                    pasfini = true;
                    tmp = monTab[i+1];
                    monTab[i+1] = monTab[i];
                    monTab[i]=tmp;

                    if ( first == -1 ) { first = i; }
                    last = i+1 ;
                }
            }
            idxStart = first -1;
            idxEnd = last;

        }
        System.out.println(Arrays.toString(monTab) + ", tri bulle 2 nombre d'itérations : "+ cmpt);
        //printTab(monTab);
    }


    public static void getExo5_8(int[] monTabA, int[]monTabB) {
        System.out.println("\nexo 5.8");
        int somme = 0;

        if (monTabA.length == monTabB.length) {

            for ( int i = 0 ; i < monTabA.length ; i ++ ) {
                somme += monTabA[i] + monTabB[i];
                System.out.println(monTabA[i] + " + " + monTabB[i] +  " = " + (monTabA[i] + monTabB[i]) );
            }

            System.out.println("\nLa somme des 2 tableaux est : " + somme);

        } else {
            System.out.println("les talbeaux ne sont pas de la même taille");
        }
    }




}
