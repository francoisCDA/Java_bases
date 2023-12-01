package org.Billetterie.JSQL.Exceptions;

public class ErrorEvent extends Exception {

    public ErrorEvent(String information) {
        super("\n\t !!! " + information);
    }
}
