package org.example.exercice.TPHotel;

import java.util.Random;

public class Chambre {

    private static int cmptChambre = 1 ;

    private int numero ;
    private boolean isLibre;
    private int tarif;
    private int capacite;


    public Chambre() {

        Random rand = new Random();

        this.numero = ++cmptChambre;
        this.isLibre = true ;
        this.tarif = rand.nextInt(90) + 50; ;
        this.capacite = rand.nextInt(5) + 1 ;

    }

    public int getNumero() {
        return numero;
    }

    public boolean isLibre() {
        return isLibre;
    }

    public int getTarif() {
        return tarif;
    }

    public int getCapacite() {
        return capacite;
    }

    private void setLibre(boolean libre) {
        isLibre = libre;
    }

    public void setTarif(int tarif) {
        this.tarif = tarif;
    }


    public boolean reserver() {
        if (isLibre) {
            setLibre(false);
            return true;
        }
        System.out.printf("\n\t !!! La chambre %d n'est pas libre !!! ",numero);
        return false;
    }

    public void liberer() {
        setLibre(true);
    }



    @Override
    public String toString() {
        return "Chambre{" +
                "numero=" + numero +
                ", isLibre=" + isLibre +
                ", tarif=" + tarif +
                ", capacite=" + capacite +
                '}';
    }
}
