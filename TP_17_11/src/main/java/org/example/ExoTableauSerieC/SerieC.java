package org.example.ExoTableauSerieC;

import org.example.Main;

public class SerieC {

    public static void printTab(int[] monTab) {
        for ( int i = 0 ; i < monTab.length ; i ++ ) {
            System.out.println("valeur " + (i+1) + " du tableau : " + monTab[i]);
        }
    }


    public static void getExo5_5(int[] monTab) {
        System.out.println("exo 5.5");

        int tmp;

        for (int i = 0, j = monTab.length -1 ; i < j ; i++, j-- ) {

            tmp = monTab[i];
            monTab[i] = monTab[j];
            monTab[j] = tmp ;

        }
        printTab(monTab);
    }


    public static void getExo5_6(int[] monTab) {
        System.out.println("exo 5.6");

        int min;
        int idx;

        for (int i = 0 ; i < monTab.length ; i++ ) {

            min = monTab[i];
            idx = i ;

            for ( int j = i ; j < monTab.length ; j++ ) {

                if ( min > monTab[j] ) {
                    min = monTab[j];
                    idx = j;
                }

            }
            monTab[idx] = monTab[i];
            monTab[i] = min;

        }
        printTab(monTab);

    }

    public static void getExo5_7(int[] monTab) {
        System.out.println("exo 5.7");

        int tmp ;
        boolean pasfini = true;

        while (pasfini) {
            pasfini = false;

            for (int i = 0 ; i < monTab.length -1 ; i++ ) {

                if (monTab[i] > monTab[i+1] ) {
                    pasfini = true;
                    tmp = monTab[i+1];
                    monTab[i+1] = monTab[i];
                    monTab[i]=tmp;
                }
            }

        }
        printTab(monTab);
    }




    public static void getExo5_8(int[] monTabA, int[]monTabB) {
        System.out.println("exo 5.8");

        if (monTabA.length == monTabB.length) {

            for ( int i = 0 ; i < monTabA.length ; i ++ ) {
                System.out.println(monTabA[i] + " + " + monTabB[i] +  " = " + (monTabA[i] + monTabB[i]) );
            }


        } else {
            System.out.println("les talbeaux ne sont pas de la même taille");

        }


    }




}
