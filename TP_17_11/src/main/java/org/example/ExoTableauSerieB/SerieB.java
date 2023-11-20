package org.example.ExoTableauSerieB;

import org.example.ExoTableauSerieC.SerieC;

import java.util.Arrays;

public class SerieB {

    public static void getExo5_1(int[] monTab,int val) {
        System.out.println("exo 5.1");

        int cmpt = 0;

        for (int i = 0; i < monTab.length; i++) {

            if (monTab[i] == val) {
                cmpt++;
            }
        }

        System.out.println("le talbeau contient " + cmpt + " occurrences de " + val);

    }

    public static void getExo5_2(int[] monTab) {
        System.out.println("exo 5.2");

        boolean croissant = true ;

        for (int i = 1; i < monTab.length; i++) {

            if (monTab[i-1] > monTab[i]) {
                croissant = false;
                break;
            }
        }

        if (croissant) {
            System.out.println("le talbeau est croissant");
        } else {
            System.out.println("le talbeau n'est pas croissant");
        }

    }

    public static void getExo5_3(int[] monTab) {
        System.out.println("exo 5.3");

        int min = monTab[0] ;
        int max = monTab[0] ;

        for (int i = 1; i < monTab.length; i++) {

            min = Math.min(monTab[i], min); //  je voulais faire un ternaire """ monTab[i] < min ? monTab[i] : min ; """ mais il tenait à le remplacer par sa fonction
            max = Math.max(monTab[i], max);

        }

        System.out.println("le plus grand écart du talbeau est " + max + " - " + min + " = " + (max - min) );

    }

    public static void getExo5_4(int[] monTab) {

        System.out.println("exo 5.4");

        SerieC.printTab(monTab);

        System.out.println("\n########\n");

        int tmp = monTab[monTab.length - 1];

        for (int i = monTab.length - 1 ; i > 0 ; i-- ) {
            monTab[i] = monTab[i - 1];
        }

        monTab[0] = tmp;

        SerieC.printTab(monTab);
    }

    public static void getExo5_4_bis(int[] monTab) {

        int[] tabOut = Arrays.stream(monTab, 1, monTab.length).toArray();

        System.out.println("exo 5.4_bis");

        SerieC.printTab(monTab);

        System.out.println("\n########\n");

        int tmp = monTab[monTab.length - 1];

        monTab[0] = tmp;

        SerieC.printTab(tabOut);
    }

}
