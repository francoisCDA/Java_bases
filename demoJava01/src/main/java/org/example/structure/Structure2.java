package org.example.structure;

public class Structure2 {

    public static void getBouclFor() {

        int[] tab = {1, 5, 9};
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            System.out.println("i = " + i + "valeur tab " + tab[i]);
        }


        for (int i = 0, j = 10; i <= j; ++i, --j) {

            System.out.println("i :" + i + " j :" + j);
        }

        //parcourrir un tableau
        for (int numb : tab) {
            sum += numb;
        }
        System.out.println(sum);

    }

    public static void getWhile() {
        int i = 5;
        while (i <= 5) {
            System.out.println(" i : " + i);
            i++;
        }

    }

    public static void getBreakContinue() {

        System.out.println(" ------------- continue ------------ ");
        for (int i = 0; i < 15; i++) {

            if (i % 2 == 0) {
                System.out.println("ça continue");
                continue;
            }

            System.out.println("i = " + i);
        }

        System.out.println(" ------------- break ------------ ");
        for (int i = 0; i < 15; i++) {

            for (int j = 0; j < 15; j++) {
                if (j == 3) {
                    System.out.println("ça break");
                    break;
                }
                System.out.println("j = " + j);
            }
            System.out.println("i = " + i);
        }

    }

}
