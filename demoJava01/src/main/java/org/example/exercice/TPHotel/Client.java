package org.example.exercice.TPHotel;

public class Client {

    private static int cmptClient = 0 ;

    private int id ;
    private String lastname ;
    private String firstname ;
    private int telephone ;

    public Client( String lastname, String firstname, int telephone) {
        this.id = ++cmptClient;
        this.lastname = lastname;
        this.firstname = firstname;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", telephone=" + telephone +
                '}';
    }
}
