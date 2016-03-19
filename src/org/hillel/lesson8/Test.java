package org.hillel.lesson8;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Created by yuriy on 04.12.15.
 */
public class Test {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Bob");
        dog1.setAge(2);

        Dog dog2 = new Dog();
        dog2.setName("Tom");
        dog2.setAge(4);

        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
    }
}

class Dog {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        return name != null ? name.equals(dog.name) : dog.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }
}
