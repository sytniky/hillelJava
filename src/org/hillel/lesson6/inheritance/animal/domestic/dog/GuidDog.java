package org.hillel.lesson6.inheritance.animal.domestic.dog;

import org.hillel.lesson6.inheritance.animal.domestic.Dog;

/**
 * Created by yuriy on 27.11.15.
 */
public class GuidDog extends Dog {

    private boolean isTrained;

    public GuidDog(int id,
                   int age,
                   double weight,
                   String color,
                   String name,
                   boolean isVactinated,
                   boolean isTrained) {

        super(id, age, weight, color, name, isVactinated);
        this.isTrained = isTrained;
    }

    @Override
    public String getVoice() {
        if (isTrained()) {
            return super.getVoice() + ". I can take you home.";
        }
        return super.getVoice();
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void takeHome() {
        System.out.println("I conduct home owner..........");
    }
}
