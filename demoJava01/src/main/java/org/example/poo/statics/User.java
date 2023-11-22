package org.example.poo.statics;

public class User {

    public static final String DEFAULT_USER_GROUP = "customers";

    private static int counter = 0;

    protected int id;

    protected String name;

    public User(String name) {
        this.id = ++counter;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
