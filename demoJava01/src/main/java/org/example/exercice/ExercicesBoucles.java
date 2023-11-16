package org.example.exercice;

import java.util.Scanner;

public class ExercicesBoucles {

    static Scanner scanner = new Scanner(System.in);


    public static void exo3_4() {
        int nbre = 0;
        String retour = "positif";

        System.out.println("Saisissez un nombre entier");

        nbre = scanner.nextInt();

        if (nbre < 0) {
            retour = "negatif";
        } else if (nbre == 0) {
            retour = "nul";
        }

        System.out.println("Le nombre saisi est "+ retour);

        scanner.close();
    }

    public static void exo3_5() {
        int age;
        String retour;

        System.out.println("Saisissez un nombre entier");

        age = scanner.nextInt();

        if (age >= 18) {
            retour = "trop vieux";
        } else if (age < 6 ) {
            retour = "trop petit";
        } else if (age < 8) {
            retour = "Poussin";
        } else if (age < 10) {
            retour = "Pupille";
        } else if (age < 12) {
            retour = "Minime";
        } else {
            retour = "Cadet";
        }

        System.out.println("votre gamin est dans la catégorie : "+ retour);

        scanner.close();
    }

    public static void exo3_6() {
        int nbre = 0;

        System.out.println("Saisissez un nombre entier");

        nbre = scanner.nextInt();

        if ( nbre%3 == 0) {
            System.out.println("nombre divisible par 3");
        } else {
            System.out.println("nombre non divisible par 3");
        }

        scanner.close();
    }

    public static void exo3_7() {

        int nbre = 0;
        float prix = 0f;

        System.out.println("Saisissez un nombre de photocopie");

        nbre = scanner.nextInt();

        if (nbre < 10) {
            prix = 0.15f * nbre;
        } else if (nbre <= 20) {
            prix = 0.1f * nbre;
        } else {
            prix = 0.05f * nbre;
        }

        System.out.println("La facture sera de : "+ prix + "€");

        scanner.close();
    }



}
