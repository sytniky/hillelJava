package org.hillel.lesson6.inheritance;

import org.hillel.lesson6.inheritance.animal.Fish;
import org.hillel.lesson6.inheritance.animal.domestic.Cat;
import org.hillel.lesson6.inheritance.animal.domestic.Dog;
import org.hillel.lesson6.inheritance.animal.domestic.dog.GuidDog;
import org.hillel.lesson6.inheritance.animal.wild.Giraffe;
import org.hillel.lesson6.inheritance.animal.wild.Hamster;
import org.hillel.lesson6.inheritance.animal.wild.predator.Alligator;
import org.hillel.lesson6.inheritance.animal.wild.predator.Lion;
import org.hillel.lesson6.inheritance.animal.wild.predator.Wolf;

/**
 * Created by yuriy on 24.11.15.
 */
public class App {

    public static void main(String[] args) {
        Cat murka = new Cat(1, 2, 3, "Grey", "Murka", true);
        Dog barsik = new Dog(2, 5, 3, "Ginger", "Barsik", true);
        Wolf wolf = new Wolf(3, 3, 30, "Silver");
        Lion lion = new Lion(4, 5, 50, "White");
        Giraffe giraffe = new Giraffe(5, 5, 400, "Yellow");
        Alligator alligator = new Alligator(6, 5, 500, "Green");
        Hamster hamster = new Hamster(7, 1, 0.2, "Brown");
        Fish fish = new Fish(8, 2, 0.05, "Gold");
        GuidDog guidDog = new GuidDog(9, 2, 15, "Grey", "Bob", true, true);

        Zoo zoo = new Zoo();

        zoo.addAnimal(murka);
        zoo.addAnimal(barsik);
        zoo.addAnimal(wolf);
        zoo.addAnimal(lion);
        zoo.addAnimal(giraffe);
        zoo.addAnimal(alligator);
        zoo.addAnimal(hamster);
        zoo.addAnimal(fish);
        zoo.addAnimal(guidDog);

        zoo.printAnimalVoices();

        guidDog.takeHome();
    }
}