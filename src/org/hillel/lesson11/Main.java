package org.hillel.lesson11;

import org.hillel.lesson6.inheritance.animal.domestic.Cat;
import org.hillel.lesson6.inheritance.animal.domestic.Dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by yuriy on 21.12.15.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(0);
        System.out.println(list);
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        TreeSet treeSet = new TreeSet(new AnimalComparator());

        Cat cat = new Cat(1, 1, 0.3, "black", "Kuzya", true);
        Dog dog = new Dog(4, 5, 2.52, "grey", "Bob", true);

        treeSet.add(cat);
        treeSet.add(dog);

        System.out.println(treeSet);


    }
}
