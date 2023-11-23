package org.example.poo.dataStructure;

public class PetrolCar extends Engine implements Vehicule {

    public PetrolCar() {
        id = count;
    }

    @Override
    public void drive() {
        System.out.println("Je suis un petrolcar qui pollu");
    }

    @Override
    public void startEngine() {
        System.out.println("Je suis un petrolcar qui démarre");
    }



}
