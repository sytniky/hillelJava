package org.hillel.lesson6;

/**
 * Created by yuriy on 20.11.15.
 */
public class Person {
    private int id;
    private String surname;

    public Person(int id, String surname) {
        this.id = id;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
