package org.example.exercice;

import java.util.Scanner;

public class Exercice {

    static Scanner scanner = new Scanner(System.in);

    public static void exo2_3() {

        System.out.println("Quel est votre prénom ?");

        String prenom = scanner.next();

        System.out.println("Bonjour "+ prenom);

    }

    public static void exo2_4() {

        System.out.println("Quel est le prix HT de l'article ?");
        float prixHT = scanner.nextFloat();

        System.out.println("Quel est le nombre d'article ?");
        int nmbre = scanner.nextInt();

        System.out.println("Quel est le taux de TVA ?");
        float TVA = scanner.nextFloat();

        float total = prixHT * nmbre * (1 + TVA / 100);

        System.out.println("le total est de " + total + "€ TTC");
    }

    public static void exo3_1() {

        System.out.println("Saisissez un nombre entier");

        int nbre = scanner.nextInt();

        String retour = "positif";

        if (nbre < 0) {
            retour = "negatif";
        }

        System.out.println("Le nombre saisi est "+ retour);
    }

    public static void exo3_2() {

        System.out.println("Saisissez un premier nombre entier");
        int nbre1 = scanner.nextInt();

        System.out.println("Saisissez un second nombre entier");
        int nbre2 = scanner.nextInt();

        String retour = "positif";

        if ( (nbre1 < 0 && nbre2 > 0) || (nbre1 > 0 && nbre2 < 0)  ) {
            retour = "negatif";
        }

        System.out.println("Le produit des nombres saisis sera "+ retour);

    }

    public static void exo3_3() {

        System.out.println("Indiquer un premier nom ?");
        String nom1 = scanner.next().toLowerCase();

        System.out.println("Indiquer un deuxième nom ?");
        String nom2 = scanner.next().toLowerCase();

        System.out.println("Indiquer un troisième nom ?");
        String nom3 = scanner.next().toLowerCase();

        String resultat = "ne sont pas";

        if ( nom3.compareTo(nom2) >= 0 && nom2.compareTo(nom1) >= 0 ) {
            resultat= "sont";
        }

        System.out.println("Les noms " + resultat + " dans l'ordre alpahbétique");

    }

}
