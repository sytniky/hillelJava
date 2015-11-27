package org.hillel.lesson6.inheritance.animal;

import org.hillel.lesson6.inheritance.Animal;

/**
 * Created by yuriy on 24.11.15.
 */
public class Wild extends Animal {

    private boolean isPredator;

    public Wild(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }
}
