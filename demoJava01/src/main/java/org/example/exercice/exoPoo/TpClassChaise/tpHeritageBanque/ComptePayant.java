package org.example.exercice.exoPoo.TpClassChaise.tpHeritageBanque;

public class ComptePayant extends Compte {

    float prelevement = 0.05f ;

    public void crediter(float credit) {
        solde += credit ;
        solde -= credit * prelevement;
    }

    public boolean debiter(float debit) {
        if (solde > debit ) {
            solde -= debit + debit * prelevement ;
            return true;
        } else {
            return false;
        }
    }

}
