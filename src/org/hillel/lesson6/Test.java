package org.hillel.lesson6;

/**
 * Created by yuriy on 20.11.15.
 */
public class Test {

    public static void main(String[] args) {
        Student student = new Student(1, "Ivanov", new int[]{1,2});
        System.out.println(student.getSurname());
    }
}
