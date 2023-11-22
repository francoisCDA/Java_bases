package org.example.exercice.exoPoo.TpClassChaise.tpHeritageHouse;

public class Person {

    private String nom;

    private House maison;


    public Person(String nom) {
        this.nom = nom;

    }

    public void setMaison(House maison) {
        this.maison = maison;
    }

    public void PeindreSaPorte(String color) {
        maison.setDoorColor(color);
    }

    public void Presentation() {
        System.out.printf("Je m'appelle %s \n",nom);
        maison.Display();
    }

}
