package org.Billetterie.Classes.Exceptions;

public class PasAssezDePlace extends Exception{

    public PasAssezDePlace(String missive) {
        super("\n\t !!! " + missive);
    }

}
