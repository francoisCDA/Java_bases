package org.example.exercice.exoPoo.TpClassChaise.tpHeritageHouse;

public class House {
    protected int surface ;

    protected Door porte ;

    public Door getPorte() {
        return porte;
    }

    public House(int surface) {
        this.surface = surface;
        porte = new Door();
    }

    public void setDoorColor(String color) {
        porte.setColor(color);
    }

    public void Display() {
        System.out.printf("\nJe suis une maison, ma surface est de %dm²\n",surface);
        porte.Display();
    }


}
