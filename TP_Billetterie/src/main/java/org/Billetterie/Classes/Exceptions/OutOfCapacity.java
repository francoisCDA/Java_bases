package org.Billetterie.Classes.Exceptions;

public class OutOfCapacity extends Exception {
    public OutOfCapacity(String message) {
        super("\n\t !!! " +message);
    }
}
