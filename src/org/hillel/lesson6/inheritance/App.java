package org.hillel.lesson6.inheritance;

/**
 * Created by yuriy on 24.11.15.
 */
public class App {

    public static void main(String[] args) {
        Cat murka = new Cat(1, 2, 3, "Grey", "Murka", true);
        Cat barsik = new Cat(2, 5, 3, "Ginger", "Barsik", true);
        Zoo zoo = new Zoo();
        zoo.addAnimal(murka);
        zoo.addAnimal(barsik);
        zoo.voiceAll();
    }
}