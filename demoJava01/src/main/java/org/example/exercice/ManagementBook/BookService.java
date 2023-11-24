package org.example.exercice.ManagementBook;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    public static Book[] filterBooksByAuthor(Auteur auteur,Book[] livres) {

        List<Book> retLivres = new ArrayList<>();

        for (Book l:livres) {
           for ( Auteur a:l.auteurs ) {
               if (a.equals(auteur)) {
                   retLivres.add(l);
                   continue;
               }
           }
        }
        return retLivres.toArray(new Book[0]);
    }


    public static Book[] filterBooksByPublisher(Editeur editeur, Book[] livres) {

        List<Book> retLivres = new ArrayList<>();

        for (Book l:livres) {
            if (l.editeur.equals(editeur)) {
                retLivres.add(l);
            }
        }

        return retLivres.toArray(new Book[0]);
    }

    public static Book[] filterBooksBySpecifiedYear(int annee, Book[] livres) {
        List<Book> retLivres = new ArrayList<>();

        for (Book l:livres) {
            if (l.publishingAnnee == annee ) {
                retLivres.add(l);
            }
        }

        return retLivres.toArray(new Book[0]);
    }




}
