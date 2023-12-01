package org.Billetterie.JSQL.Exceptions;

public class KnowMail extends Exception {

    public KnowMail(String message) {
        super("\n\t !!! " +message);
    }
}
