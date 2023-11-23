package org.example.exercice.ManagementBook;

public class Demo {

    Auteur JonJohnson = new Auteur("Jon","Johnson");
    Auteur WillWilson = new Auteur("William","Wilson");
    Auteur WalterP = new Auteur("Walter","Peterson");
    Auteur CraigG = new Auteur("Craig","Gregroy");

    Book[] livres = new Book[] {
            new Book(
                    "Book_1",
                    new Auteur[] { JonJohnson },
                    new Editeur("Editeur_1"),
                    1990,
                    231,
                    24.99,
                    CoverType.BROCHE
            ),
            new Book(
                    "Book_2",
                    new Auteur[] { JonJohnson, WillWilson },
                    new Editeur("Editeur_2 "),
                    2000,
                    120,
                    14.99,
                    CoverType.BROCHE),
            new Book(
                    "Book_3",
                    new Auteur[] { WalterP },
                    new Editeur("Editeur_1"),
                    1997,
                    350,
                    34.99,
                    CoverType.RELIE),
            new Book(
                    "Book_4",
                    new Auteur[] { CraigG },
                    new Editeur ("Editeur_3"),
                    1992,
                    185,
                    19.99,
                    CoverType.BROCHE)
            } ;


}
