package org.hillel.lesson6.inheritance;

/**
 * Created by yuriy on 24.11.15.
 */
public abstract class Animal {
//public abstract class Animal implements Comparable {

    private int id;
    private int age;
    private double weight;
    private String color;

    public Animal(int id, int age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVoice() {
        return "Hello";
    }

    public void printVoice() {
        System.out.println(getVoice());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (id != animal.id) return false;
        if (age != animal.age) return false;
        if (Double.compare(animal.weight, weight) != 0) return false;
        return !(color != null ? !color.equals(animal.color) : animal.color != null);

    }

//    @Override
//    public int compareTo(Object o) {
//        return Integer.compare(this.getId(), ((Animal)o).getId());
//    }
}