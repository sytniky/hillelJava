package org.hillel.lesson6;

/**
 * Created by yuriy on 20.11.15.
 */
public class Student extends Person {

    private int[] marks;

    public Student(int id, String surname, int[] marks) {
        super(id, surname);
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public String getSurname() {
        return "HELLO " + super.getSurname();
    }
}
