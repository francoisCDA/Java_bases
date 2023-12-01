package org.Billetterie.JSQL;

import lombok.ToString;
import org.Billetterie.Classes.Client;
import org.Billetterie.Classes.Event;
import org.Billetterie.Classes.Lieu;
import org.Billetterie.JSQL.Exceptions.ErrorEvent;
import org.Billetterie.JSQL.Exceptions.ErrorLieu;
import org.Billetterie.JSQL.Exceptions.KnowMail;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

@ToString
public class DDBBilletterie {

    private static int cptSalle = 0;
    private static int cptEvent = 0;


    private HashMap<String, Lieu> mesSalles;
    private HashMap<String, Event> mesEvenements;
    private HashMap<String, Event> canceledEvent;
    private HashMap<String, Client> mesClients;

    public DDBBilletterie() {
      mesClients = new HashMap<>();
      mesEvenements = new HashMap<>();
      canceledEvent = new HashMap<>();
      mesSalles = new HashMap<>();
    }


    // ****************** salle ************************
    public void addSalle(String nom, String adresse, int capacite) {
        String key = "salle-" + ++cptSalle;
        Lieu newLieu = new Lieu(key,nom,adresse,capacite);
        mesSalles.put(key,newLieu);
    }

    public void rmSalle(String key) throws ErrorLieu, ErrorEvent {
        if (!mesSalles.containsKey(key)) throw new ErrorLieu("ID salle inconnue");
        for (Map.Entry<String, Event> ev: this.mesEvenements.entrySet()) {
            if (mesEvenements.get(ev).getSalle().equals(key)) {
                cancelEvent(String.valueOf(ev));
            }
        }
        mesSalles.remove(key);
    }

    public Lieu[] getSalles() {
        return mesSalles.values().toArray(new Lieu[0]);
    }


    //pour l'initialisation de la liste d'évènement
    public Lieu randLieu() {
        Random rand = new Random();
        String[] keys = mesSalles.keySet().toArray(new String[0]);
        String randKey = keys[rand.nextInt(keys.length-1)];
        return mesSalles.get(randKey);
    }


    // ****************** Evènements ************************

    public void addEvent(String nom, LocalDate date, LocalTime heure, Lieu salle, int prix) {
        String key = "event-" + nom + "-" + date + "-" + ++cptEvent;
        Event newEvent = new Event(key,nom,date,heure,salle,prix);
        mesEvenements.put(key,newEvent);
    }

    public void cancelEvent(String key) throws ErrorEvent {
        if (!mesEvenements.containsKey(key)) throw new ErrorEvent("Evènement inconnu");
        canceledEvent.put(key,mesEvenements.get(key));
        mesEvenements.remove(key);
    }

    public void rmEvent(String key) throws ErrorEvent {
        if (mesEvenements.containsKey(key)) throw new ErrorEvent("Evènement non annulé, suppression impossible");
        if (!canceledEvent.containsKey(key)) throw new ErrorEvent("Event inconnu, suppression impossible");
        if (canceledEvent.get(key).getBilletsVendus() > 0 && LocalDate.EPOCH.isBefore(canceledEvent.get(key).getDate().plusYears(1)) ) throw new ErrorEvent("période de remboursement active, suppression impossible");
        mesEvenements.remove(key);
    }

    public void changeNom (String key, String newNom) throws ErrorEvent {
        if (!mesEvenements.containsKey(key)) throw new ErrorEvent("Evènement inconnu");
        mesEvenements.get(key).setNom(newNom);  ;
    }

    public void changeDate(String key, LocalDate newDate ) throws ErrorEvent {
        if (!mesEvenements.containsKey(key)) throw new ErrorEvent("Evènement inconnu");
        mesEvenements.get(key).setDate(newDate);
    }

    public void changeHeure(String key, LocalTime heure ) throws ErrorEvent {
        if (!mesEvenements.containsKey(key)) throw new ErrorEvent("Evènement inconnu");
        mesEvenements.get(key).setHeure(heure);
    }

    public void changeSalle(String key, Lieu newSalle ) throws ErrorEvent {
        if (!mesEvenements.containsKey(key)) throw new ErrorEvent("Evènement inconnu");
        mesEvenements.get(key).setSalle(newSalle);  ;
    }

    public void changePrix(String key, int newPrix ) throws ErrorEvent {
        if (!mesEvenements.containsKey(key)) throw new ErrorEvent("Evènement inconnu");
        mesEvenements.get(key).setPrix(newPrix);
    }



    // ****************** Clients ************************

    public void addClient(String lastname, String firstname, String email) throws KnowMail {
        if (mesClients.containsKey(email)) {
            throw new KnowMail("address mail déjà connue");
        } else {
            Client newClient = new Client(lastname, firstname, email);
            mesClients.put(email,newClient);
        }
    }

    public void changeMail(String oldMail, String newMail) throws KnowMail {
        if (!mesClients.containsKey(newMail) && mesClients.containsKey(oldMail)) {
            Client clientTmp = mesClients.get(oldMail);
            clientTmp.setEmail(newMail);
            mesClients.put(newMail,clientTmp);
            mesClients.remove(oldMail);
        } else {
            throw new KnowMail("error addresse mail");
        }
    }

    public void changeLast(String mail, String newLast) throws KnowMail {
        if (!mesClients.containsKey(mail)) throw new KnowMail("Adresse mail inconnue");

        mesClients.get(mail).setLastname(newLast);
    }

    public void changeFirst(String mail, String newFirst) throws KnowMail {
        if (!mesClients.containsKey(mail)) throw new KnowMail("Adresse mail inconnue");

        mesClients.get(mail).setLastname(newFirst);
    }

    public void removeClient(String mail) throws KnowMail {
        if (mesClients.containsKey(mail)) {
            mesClients.remove(mail);
        } else {
            throw new KnowMail("Adresse inconnue");
        }
    }



}
