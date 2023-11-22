package org.example.poo;

public class Phone extends Product {
    int prix;

    public Phone(int prix) {
        this.prix = prix;
    }

    public Phone(int id, String name, int prix) {
        super(id, name);
        this.prix = prix;
    }
}
