package org.hillel.lesson11;

import org.hillel.lesson6.inheritance.Animal;

import java.util.Comparator;

/**
 * Created by yuriy on 28.12.15.
 */
public class AnimalComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return Integer.compare(((Animal) o1).getId(), ((Animal) o2).getId());
    }
}
