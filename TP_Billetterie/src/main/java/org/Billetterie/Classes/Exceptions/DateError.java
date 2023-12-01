package org.Billetterie.Classes.Exceptions;

public class DateError extends Exception {
    public DateError(String message) {
        super("\n\t !!! " +message);
    }
}
