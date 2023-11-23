package org.example.exercice.ManagementBook;

import java.util.Arrays;

public class Book {

    private static int compteBook = 0 ;

    int id ;
    String name ;
    Auteur[] auteurs;
    Editeur editeur ;
    int publishingAnnee ;
    int amountOfPages;
    double prix;
    CoverType coverType;


    public Book() {
        this.id = ++compteBook;
    }

    public Book(String name, Auteur[] auteurs, Editeur editeur, int publishingAnnee, int amountOfPages, double prix, CoverType coverType) {
        this.id = ++compteBook;
        this.name = name;
        this.auteurs = auteurs;
        this.editeur = editeur;
        this.publishingAnnee = publishingAnnee;
        this.amountOfPages = amountOfPages;
        this.prix = prix;
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auteurs=" + Arrays.toString(auteurs) +
                ", editeur=" + editeur +
                ", publishingAnnee=" + publishingAnnee +
                ", amountOfPages=" + amountOfPages +
                ", prix=" + prix +
                ", coverType=" + coverType +
                '}';
    }
}
