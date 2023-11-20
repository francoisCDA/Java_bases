package org.example.string;

import java.util.Arrays;

public class ChaineCharactere {

    public static void getStringFunction() {

        System.out.println(" --- Les chaînes de caractères --- ");

        String s = " hello ";

        System.out.println("s.length " + s.length());
        System.out.println("s.contains(\"he\") : " + s.contains("he") );
        System.out.println("s.isEmpty : "+ s.isEmpty() );
        System.out.println("s.toUpperCase : "+ s.toUpperCase() );
        System.out.println("s.startWith(\"h\") : "+ s.startsWith("h") );
        System.out.println("s.endWith(\" \") : " + s.endsWith(" ") );
        System.out.println("s.replace(\"ll\",\"LL\") : " + s.replace("ll","LL") );
        System.out.println("s.trim() : " + s.trim() );
        System.out.println("s.substring(0,3) : " + s.substring(0,3) );
        System.out.println("s.charAt(1) : " + s.charAt(1));
        System.out.println("Arrays.toString(s.split(\"e\") : " + Arrays.toString(s.split("e")) );
        System.out.println("Arrays.toString(s.split(\"\") : " + Arrays.toString(s.split("")) );


        System.out.println("test : " + s.trim().substring(0,1).toUpperCase() + s.trim().substring(1,s.trim().length()) );

    }

    public static void getComparaisonString() {

        System.out.println(" --- Les chaînes de caractères --- ");

        String s = " hello ";
        String s2 = " hello ";

        System.out.println("\n s == s2 : " + (s == s2) ); // true
        System.out.println(" s.equals(s2) : " + s.equals(s2) ); // true

        String s3 = new String(" hello ");
        System.out.println("\n s == s3 : " + (s == s3) ); // true
        System.out.println(" s.equals(s3) : " + s.equals(s3) ); // true

        String firstName = "Alain" ;
        String firstNAme1 = "alain" ;
        System.out.println(" firstName.equals(firstNAme1) : " + firstName.equals(firstNAme1) ); // false
        System.out.println(" firstName.equalsIgnoreCase(firstNAme1) : " + firstName.equalsIgnoreCase(firstNAme1) ); // true

    }

    public static void getFormatString() {

        String firstName = "Alain" ;

        String phrase = "Salut, cher %s !, Good %s !";
        String morning = "Morning" ;
        String evening = "Evening" ;
        String afternoon = "Afternoon" ;

        String nouvellePhrase = String.format(phrase,firstName,morning);
        System.out.println(nouvellePhrase);
        System.out.printf(phrase,firstName,afternoon);
        System.out.printf("\nVous aller gagner %d à l'euro-million dans %.0f jours",10000000, 10.5f);

        String nomProduit = "chocolat";
            double prix = 2.99 ;
            int quantite = 10 ;

        System.out.printf("\nTotal pour %d unités de %s : %.2f euros",quantite,nomProduit,prix*quantite);

    }

}
