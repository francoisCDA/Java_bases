package org.Billetterie.Classes;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Lieu {

    private String id;

    private String nom;

    private String adresse;

    private int capacite;

}
