package org.Billetterie.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@Data
public class Client {

    private String lastname;

    private String firstname;

    private String email;

    private ArrayList<Billet> billets;

    public Client(String lastname, String firstname, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.billets = new ArrayList<>();
    }


}
