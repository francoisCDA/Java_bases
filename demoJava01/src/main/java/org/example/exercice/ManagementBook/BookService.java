package org.example.exercice.ManagementBook;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public static List<Book> filterBooksByAuthor(Auteur auteur,Book[] livres) {

        List retLivres = new ArrayList<Book>();

        for (Book l:livres) {
           for ( Auteur a:l.auteurs ) {
               if (a.equals(auteur)) {
                   retLivres.add(l);
                   continue;
               }
           }
        }
        return retLivres;
    }


    public static List<Book> filterBooksByPublisher(Editeur editeur, Book[] livres) {

        List retLivres = new ArrayList<Book>();

        for (Book l:livres) {
            if (l.editeur.equals(editeur)) {
                retLivres.add(l);
            }
        }

        return retLivres;
    }

    public static List<Book> filterBooksBySpecifiedYear(int annee, Book[] livres) {
        List retLivres = new ArrayList<Book>();

        for (Book l:livres) {
            if (l.publishingAnnee == annee ) {
                retLivres.add(l);
            }
        }

        return retLivres;
    }




}
