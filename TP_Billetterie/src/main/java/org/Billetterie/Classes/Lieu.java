package org.Billetterie.Classes;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Lieu {

    private Integer id;

    private String nom;

    private String adresse;

    private int capacite;


    public String toString() {
        return nom + ", " + capacite + " places, " + adresse;
    }

}


