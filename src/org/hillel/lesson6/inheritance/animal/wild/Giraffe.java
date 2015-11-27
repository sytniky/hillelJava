package org.hillel.lesson6.inheritance.animal.wild;

import org.hillel.lesson6.inheritance.animal.Wild;

/**
 * Created by yuriy on 27.11.15.
 */
public class Giraffe extends Wild {
    public Giraffe(int id, int age, double weight, String color) {
        super(id, age, weight, color, false);
    }
}
