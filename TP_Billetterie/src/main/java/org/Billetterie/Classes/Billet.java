package org.Billetterie.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
public class Billet {

    private final int id;

    private Event event;

    private Client client;

    public String toString() {
        return "numéro : " + id + ", " + event.toString();
    }

}
