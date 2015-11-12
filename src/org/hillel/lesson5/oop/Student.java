package org.hillel.lesson5.oop;

/**
 * Created by yuriy on 12.11.15.
 */
public class Student {
    private String name;
    private String surname;
    private int[] marks;

    public Student() {
        this("n/a", "n/a");
        printInfo();
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.marks = new int[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("My name is " + new String(name) + ", surname " + surname);
    }
}
