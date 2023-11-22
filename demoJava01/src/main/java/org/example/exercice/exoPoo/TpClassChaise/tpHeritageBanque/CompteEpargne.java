package org.example.exercice.exoPoo.TpClassChaise.tpHeritageBanque;

public class CompteEpargne extends Compte {

    private float tauxDInteret = .01f ;

    public float getTauxDInteret() {
        return tauxDInteret;
    }

    public void setTauxDInteret(float tauxDInteret) {
        this.tauxDInteret = tauxDInteret;
    }

    public void caculInteret() {
        solde += solde*tauxDInteret ;
    }

}
