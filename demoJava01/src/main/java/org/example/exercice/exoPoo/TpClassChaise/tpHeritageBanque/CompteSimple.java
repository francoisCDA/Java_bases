package org.example.exercice.exoPoo.TpClassChaise.tpHeritageBanque;

public class CompteSimple extends Compte {

    private int decouvert = 0 ;

    public void setDecouvert(int decouvert) {
        this.decouvert = decouvert;
    }

    @Override
    public boolean debiter(float debit) {
        if (solde > decouvert ) {
            solde -= debit ;
            return true;
        } else {
            return false;
        }
    }

}
