package org.example.exercice.exoEnum;

import org.example.poo.enums.Priority;

import java.util.Scanner;

public class exoEnum {

    static Scanner scan = new Scanner(System.in);

    static public Priority getPriority(String type) {

        switch (type) {
            case "A" :
                return Priority.HIGH;
            case "B" :
                return Priority.MEDIUM;
        }
        return Priority.LOW;
    }


    public static void main(String[] args) {

        String saisie = "F" ;
        Type lettre;

        while ( !(saisie.equals("A") || saisie.equals("B") || saisie.equals("C") || saisie.equals("D")) ) {
            System.out.println("Quel est le type de message (A/B/C/D) ?");
            saisie = scan.next().toUpperCase();
        }

        lettre = Type.valueOf(saisie);

        System.out.println("La lettre est de priorité " + getPriority(lettre.name()));

    }
}
