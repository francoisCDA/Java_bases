package org.example.exercice.ManagementBook;

public class Auteur {

    private static int comptauteur = 0;

    int id;

    String firstName;

    String lastName;

    public Auteur() {
        id = ++comptauteur;
    }

    public Auteur(String firstName, String lastName) {
        id = ++comptauteur;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
