package org.example.ExoTableauSerieB;

public class SerieB {

    public static void getExo5_1(int[] monTab,int val) {
        System.out.println("exo 5.1");

        int cmpt = 0;

        for (int i = 0; i < monTab.length; i++) {

            if (monTab[i] == val) {
                cmpt++;
            }
        }

        System.out.println("le talbeau contient " + cmpt + " occurenece de " + val);

    }

    public static void getExo5_1(int[] monTab) {
        System.out.println("exo 5.2");

        boolean croissant = true ;

        for (int i = 1; i < monTab.length; i++) {

            if (monTab[i-1] > monTab[i]) {
                croissant = false;
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

            min = Math.min(monTab[i], min); // comme hier, je voulais faire un ternaire """ monTab[i] < min ? monTab[i] : min ; """ mais il tenait à le remplacer par sa fonction
            max = Math.max(monTab[i], max);

        }

        System.out.println("le plus grand écart du talbeau est " + max + " - " + min + " = " + (max - min) );

    }

    public static void getExo5_4(int[] monTab) {

        System.out.println("exo 5.3");

        for ( int i = 0 ; i < monTab.length ; i ++ ) {
            System.out.println("valeur " + (i+1) + " du tableau : " + monTab[i]);
        }
        System.out.println("\n########\n");

        int tmp = monTab[monTab.length - 1];

        for (int i = monTab.length - 1; i > 1; i--) {
            monTab[i] = monTab[i - 1];
        }

        monTab[0] = tmp;

        for ( int i = 0 ; i < monTab.length ; i ++ ) {
            System.out.println("valeur " + (i+1) + " du tableau : " + monTab[i]);
        }


    }

}
