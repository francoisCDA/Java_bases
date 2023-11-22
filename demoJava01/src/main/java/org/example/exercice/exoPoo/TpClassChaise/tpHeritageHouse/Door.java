package org.example.exercice.exoPoo.TpClassChaise.tpHeritageHouse;

public class Door {

    String color ;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Display() {
        System.out.printf("\nJe suis une porte, ma couleur est %s\n",color);
    }
}
