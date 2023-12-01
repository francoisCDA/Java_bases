package org.Billetterie.Classes;

import java.time.LocalDate;
import java.time.LocalTime;

public class Billet {

    private final int numero;
    private final String refEvent;
    public Billet(String refEvent,int numero) {
        this.numero = numero;
        this.refEvent = refEvent;
    }

}
