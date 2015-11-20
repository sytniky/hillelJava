package org.hillel.lesson5.university;

import java.util.Arrays;

/**
 * Created by yuriy on 18.11.15.
 */
public class Student {

    private String name;
    private String surname;
    private Mark[] marks;
    private Visit[] visits;

    public Student(String name, String surname, Mark[] marks, Visit[] visits) {
        this.name = name;
        this.surname = surname;
        this.marks = marks;
        this.visits = visits;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Mark[] getMarks() {
        return marks;
    }

    public void setMarks(Mark[] marks) {
        this.marks = marks;
    }

    public Visit[] getVisits() {
        return visits;
    }

    public void setVisits(Visit[] visits) {
        this.visits = visits;
    }

    public int compareSurname(Student sStudent) {

        String fString = getSurname();
        String sString = sStudent.getSurname();

        return fString.compareTo(sString);
    }

    public static int compareSurname(Student fStudent, Student sStudent) {

        String fString = fStudent.getSurname();
        String sString = sStudent.getSurname();

        return fString.compareTo(sString);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", marks=" + Arrays.toString(marks) +
                ", visits=" + Arrays.toString(visits) +
                '}';
    }
}
