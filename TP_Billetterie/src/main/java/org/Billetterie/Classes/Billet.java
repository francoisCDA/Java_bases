package org.Billetterie.Classes;

import java.time.LocalDate;
import java.time.LocalTime;

public class Billet {

    private final String numero;
    private Event event;
    public Billet(Event event,String numero) {
        this.numero = numero;
        this.event = event;
    }

    public String toString() {
        return "numéro : " + numero + ", " + event.toString();
    }

}
