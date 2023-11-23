package org.example.poo.dataStructure;

public class MotorCycle extends Engine implements Vehicule {

    public MotorCycle() {
        id = Engine.count ;
    }

    @Override
    public void drive() {
        System.out.println("je suis motorcycle");
    }

    @Override
    public void startEngine() {
        System.out.println("je démarre motorcycle");
    }
}
