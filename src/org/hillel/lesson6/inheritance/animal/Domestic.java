package org.hillel.lesson6.inheritance.animal;

import org.hillel.lesson6.inheritance.Animal;

/**
 * Created by yuriy on 24.11.15.
 */
public abstract class Domestic extends Animal {

    private String name;
    private boolean isVactinated;

    public Domestic(int id,
                    int age,
                    double weight,
                    String color,
                    String name,
                    boolean isVactinated) {

        super(id, age, weight, color);
        this.name = name;
        this.isVactinated = isVactinated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVactinated() {
        return isVactinated;
    }

    public void setVactinated(boolean vactinated) {
        isVactinated = vactinated;
    }

    public String getVoice() {
        String result = super.getVoice();
        result += "my name is ";
        result += getName();
        return result;
    }
}
