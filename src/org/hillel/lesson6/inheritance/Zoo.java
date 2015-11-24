package org.hillel.lesson6.inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yuriy on 24.11.15.
 */
public class Zoo {

    private List<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void voiceAll() {
        for (Animal animal : animals) {
            System.out.println(animal.getVoice());
        }
    }
}
