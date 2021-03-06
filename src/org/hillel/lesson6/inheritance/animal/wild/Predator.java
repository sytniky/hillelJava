package org.hillel.lesson6.inheritance.animal.wild;

import org.hillel.lesson6.inheritance.animal.Wild;

/**
 * Created by yuriy on 27.11.15.
 */
public class Predator extends Wild {

    public Predator(int id, int age, double weight, String color) {
        super(id, age, weight, color, true);
    }

    @Override
    public String getVoice() {
        return super.getVoice() + " and I am angry";
    }
}
