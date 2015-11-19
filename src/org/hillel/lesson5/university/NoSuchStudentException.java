package org.hillel.lesson5.university;

/**
 * Created by yuriy on 19.11.15.
 */
public class NoSuchStudentException extends Exception {
    public NoSuchStudentException(String s) {
        super(s);
    }
}
