package org.hillel.lesson12;

import org.hillel.lesson6.inheritance.Animal;
import org.hillel.lesson6.inheritance.animal.domestic.Cat;
import org.hillel.lesson6.inheritance.animal.domestic.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuriy on 11.01.16.
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        List list2 = new ArrayList(list);
        System.out.println(list2);

        Integer[] arr = new Integer[2];
        arr[0] = 5;
        arr[1] = 6;
        System.out.println(arr);
        list = Arrays.asList(arr);
        List<Integer> list3 = new LinkedList<>(list);
        System.out.println(list3);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat(1, 1, 0.3, "black", "Kuzya", true));
        animals.add(new Dog(4, 5, 2.52, "grey", "Bob", true));
        for (Animal animal : animals) {
            System.out.println(animal.getVoice());
        }

    }
}
