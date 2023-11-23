package org.example.poo.dataStructure;

public abstract class Engine {   // abstract classe que l'on ne peut pas instancier, a des méthode abstraite

//    public abstract void test();  // methode abstraite = sans corp => devra obligatoirement être définie dans les enfants
//
//    public void test2() {  // méthode concrète
//        // fait des trucs
//    }


    protected static int count;

    {
        count++;
    }

    protected int id;

    protected int nbRoue;

    protected  String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbRoue() {
        return nbRoue;
    }

    public void setNbRoue(int nbRoue) {
        this.nbRoue = nbRoue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", nbRoue=" + nbRoue +
                ", color='" + color + '\'' +
                '}';
    }



}
