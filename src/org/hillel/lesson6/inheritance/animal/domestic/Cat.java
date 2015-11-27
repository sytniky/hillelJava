package org.hillel.lesson6.inheritance.animal.domestic;

import org.hillel.lesson6.inheritance.animal.Domestic;

/**
 * Created by yuriy on 24.11.15.
 */
public class Cat extends Domestic {

    public Cat(int id,
               int age,
               double weight,
               String color,
               String name,
               boolean isVactinated) {

        super(id, age, weight, color, name, isVactinated);
    }


    @Override
    public String getVoice() {
        return super.getVoice() +  ", Meow";
    }
}
