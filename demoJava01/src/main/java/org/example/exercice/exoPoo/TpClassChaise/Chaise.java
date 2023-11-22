package org.example.exercice.exoPoo.TpClassChaise;

public class Chaise {
    private int nbPieds ;

    private String couleur ;

    private String materiaux ;

    public Chaise() {
    }

    public Chaise(int nbPieds, String materiaux, String couleur) {
        this.nbPieds = nbPieds;
        this.couleur = couleur;
        this.materiaux = materiaux;
    }

    public int getNbPieds() {
        return nbPieds;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getMateriaux() {
        return materiaux;
    }
}
