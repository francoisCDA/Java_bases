package org.example.exercice.exoPoo.TpClassChaise.tpHeritageHouse;

public class Apartment extends House {

    public Apartment() {
        super(50);
    }

    public void Display() {
        System.out.printf("\nJe suis une appartement, ma surface est de %dm²\n",this.surface);
        porte.Display();
    }
}
