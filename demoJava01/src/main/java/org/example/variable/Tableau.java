package org.example.variable;

public class Tableau {

    public static void getArray() {

        int[] tab = {2,4,5} ;

        int tab2[] ;

        tab2 = new int[10];

        String[] tab3 = new String[5];

        int[][] matrice = {{1,2,3},{1,2,3},{1,2,3}};

        for (int i = 0; i < tab.length ; i++) {
            tab[i] = i+1;
            System.out.println(tab[i]);
        }

    }
}
