package org.Billetterie.Classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;

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

    public String toString(){
        return lastname + " " + firstname + " " + email;
    }

    public void setLastname(String nom) {
        this.lastname = nom.toUpperCase() ;
    }

    public Billet[] getBillets(){
        return billets.toArray(new Billet[0]);
    }

    public void achetteBillet(Billet[] billets) {
        this.billets.addAll(Arrays.asList(billets));
    }


}
