package org.hillel.lesson6.inheritance.animal;

import org.hillel.lesson6.inheritance.Animal;

/**
 * Created by yuriy on 27.11.15.
 */
public class Fish extends Animal {
    public Fish(int id, int age, double weight, String color) {
        super(id, age, weight, color);
    }

    @Override
    public String getVoice() {
        return "....";
    }
}
