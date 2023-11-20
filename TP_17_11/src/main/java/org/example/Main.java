package org.example;

import org.example.ExoTableauSerieA.SerieA;
import org.example.ExoTableauSerieB.SerieB;
import org.example.ExoTableauSerieC.SerieC;

import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        //SerieA.getExo5_bis();

        int[] tableau = {1,77,2,3,100,4,9,6,48,447,22,12,55,4,1,2,52,5,10,23,2};

        int[] tableauB = {1,1,2,3,4,9};

       // SerieB.getExo5_1(tableau,2);
       // SerieB.getExo5_2(tableau);
       // SerieB.getExo5_3(tableau);
       // SerieB.getExo5_4_bis(tableau);

        SerieC.getExo5_5(tableau.clone());
        SerieC.getExo5_6(tableau.clone());
        SerieC.getExo5_7(tableau.clone());
        SerieC.getExo5_7_bis(tableau.clone());
        SerieC.getExo5_8(tableau.clone(), tableau.clone());
        SerieC.getExo5_8(tableau.clone(), tableauB);

    }



}