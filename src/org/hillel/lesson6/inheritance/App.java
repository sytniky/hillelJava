package org.hillel.lesson6.inheritance;

import org.hillel.lesson6.inheritance.animal.domestic.Cat;
import org.hillel.lesson6.inheritance.animal.domestic.Dog;

/**
 * Created by yuriy on 24.11.15.
 */
public class App {

    public static void main(String[] args) {
        Animal murka = new Cat(1, 2, 3, "Grey", "Murka", true);
        Animal barsik = new Dog(2, 5, 3, "Ginger", "Barsik", true);
        Zoo zoo = new Zoo();
        zoo.addAnimal(murka);
        zoo.addAnimal(barsik);
        zoo.printAnimalVoices();
    }
}