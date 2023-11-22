package org.example.exercice.exoPoo.TpClassChaise.tpHeritageBanque;

public class Compte {

    static int compteur = 0 ;

    protected int code ;
    protected float solde ;

    public Compte() {
        this.code = ++compteur;
    }

    public Compte(int solde) {
        this.code = ++compteur;
        this.solde = solde;
    }

    public int getCode() {
        return code;
    }

    public float getSolde() {
        return solde;
    }

    public void crediter(float credit) {
        solde += credit ;
    }

    public boolean debiter(float debit) {
        if (solde > debit ) {
            solde -= debit ;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                '}';
    }

}
