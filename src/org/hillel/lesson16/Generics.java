package org.hillel.lesson16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by yuriy on 28.01.16.
 */
public class Generics {
    public static void main(String[] args) {

        List<String> dogs = new ArrayList<>();
        dogs.add("Tim");
        dogs.add("Bob");
//
//        System.out.println(dogs);
//        Collections.sort(dogs);
//        System.out.println(dogs);

//        Dog dog1 = new Dog(2, "Bob");
//        Dog dog2 = new Dog(3, "Tim");
//
//        List<Dog> dogs = new ArrayList<>();
//        dogs.add(dog1);
//        dogs.add(dog2);
//        Collections.sort(dogs, new AgeComparator());
//        System.out.println(dogs);
//
//        Collections.sort(dogs, new ReverseAgeComparator<>(new Comparator<Dog>() {
//            @Override
//            public int compare(Dog o1, Dog o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        }));
//
////        String dog = dogs.get(2);

        dogs.forEach(System.out::print);

        for (String dog : dogs) {
            System.out.println(dog);
        }

//        Pair<String, Integer> pair = new Pair<>("Test", 12);
//        System.out.println(pair);
    }
}

class Pair<T,R> {
    T firstField;
    R secondField;

    Pair(T firstField, R secondField) {
        this.firstField = firstField;
        this.secondField = secondField;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstField=" + firstField +
                ", secondField=" + secondField +
                '}';
    }
}

class Dog {
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        return !(name != null ? !name.equals(dog.name) : dog.name != null);

    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
//       return 1;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}



