package org.example.poo.dataStructure;

public class Demo {

    public static void main(String[] args) {

        ElectricCar eCar = new ElectricCar();
        eCar.setColor("bleu");
        eCar.setNbRoue(5);

        PetrolCar pCar = new PetrolCar();
        pCar.setColor("rouge");
        pCar.setNbRoue(4);

        MotorCycle mCar = new MotorCycle();
        mCar.setColor("vert");
        mCar.setNbRoue(2);

        SuperCar superCar = new SuperCar();

        Engine[] engines = {eCar,pCar,mCar} ;
        for (Engine engine:engines) {
            moveVehicule(engine);
        }

        Vehicule[] vehicules = {superCar,eCar,pCar,mCar};

    }

//    public static void move2(Engine[] engines) {
//        for ( Engine en:engines) {
//            en.drive();
//        }
//    }

    public static void moveVehicule(Engine eng) {

        if (eng instanceof ElectricCar ) {
            System.out.println("electrique");
            ((ElectricCar) eng ).drive();
        } else if ( eng instanceof MotorCycle ) {
            System.out.println("Motorcycle");
            ((MotorCycle) eng ).drive();
        } else if ( eng instanceof  PetrolCar ) {
            System.out.println("PetrolCar");
            ((PetrolCar) eng ).drive();
        }

    }


}
