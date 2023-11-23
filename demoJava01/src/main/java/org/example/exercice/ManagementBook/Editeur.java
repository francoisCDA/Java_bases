package org.example.exercice.ManagementBook;

public class Editeur {

    private static int  comptediteur = 0 ;

    int id ;

    String nomEditeur;

    public Editeur() {
        this.id = ++comptediteur;
    }

    public Editeur(String nomEditeur) {
        this.id = ++comptediteur;
        this.nomEditeur = nomEditeur;
    }

    @Override
    public String toString() {
        return "Editeur{" +
                "id=" + id +
                ", nomEditeur='" + nomEditeur + '\'' +
                '}';
    }
}
