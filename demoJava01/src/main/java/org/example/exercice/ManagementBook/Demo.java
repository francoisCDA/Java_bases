package org.example.exercice.ManagementBook;

public class Demo {


    public static void main(String[] args) {

        Auteur JonJohnson = new Auteur("Jon","Johnson");
        Auteur WillWilson = new Auteur("William","Wilson");
        Auteur WalterP = new Auteur("Walter","Peterson");
        Auteur CraigG = new Auteur("Craig","Gregroy");

        Editeur editeur1 = new Editeur("Editeur_1");
        Editeur editeur2 = new Editeur("Editeur_2");
        Editeur editeur3 = new Editeur("Editeur_3");


        Book[] livres = new Book[] {
            new Book(
                    "Book_1",
                    new Auteur[] { JonJohnson },
                    editeur1,
                    1990,
                    231,
                    24.99,
                    CoverType.BROCHE
            ),
            new Book(
                    "Book_2",
                    new Auteur[] { JonJohnson, WillWilson },
                    editeur2,
                    2000,
                    120,
                    14.99,
                    CoverType.BROCHE),
            new Book(
                    "Book_3",
                    new Auteur[] { WalterP },
                    editeur1,
                    1997,
                    350,
                    34.99,
                    CoverType.RELIE),
            new Book(
                    "Book_4",
                    new Auteur[] { CraigG },
                    editeur3,
                    1992,
                    185,
                    19.99,
                    CoverType.BROCHE)
            } ;



            Book[] livreDeJon = BookService.filterBooksByAuthor(JonJohnson,livres);
            System.out.println("Les livres de Jon fils de John");
            for (Book l:livreDeJon) {
                System.out.println(l.toString());
            }


            Book[] livresEditeur1 = BookService.filterBooksByPublisher(editeur1,livres);
            System.out.println("\nLivres publiés par la maison Editeur_1");
            for (Book l:livresEditeur1) {
                System.out.println(l.toString());
            }


            Book[] livrede1992 = BookService.filterBooksBySpecifiedYear(1992,livres);
            System.out.println("\nLivres publiés en 1992");
            for (Book l:livrede1992) {
                System.out.println(l.toString());
            }


        }




}
