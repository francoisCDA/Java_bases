package org.example.poo.dataStructure;

public class ElectricCar extends Engine implements Vehicule {

    public ElectricCar() {
        id = count ;
    }

    @Override
    public void drive() {
        System.out.println("je suis ElectricCar");
    }

    @Override
    public void startEngine() {
        System.out.printf("je suis electicEngine");
    }
}
