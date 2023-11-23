package org.example.poo.dataStructure;

public class SuperCar implements Vehicule {
    @Override
    public void drive() {
        System.out.println("Je suis une supercar qui roule");
    }

    @Override
    public void startEngine() {
        System.out.printf("Je suis une supercar qui démarre");
    }
}
