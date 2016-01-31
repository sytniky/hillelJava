package org.hillel.lesson16;

import java.util.Comparator;

/**
 * Created by yuriy on 28.01.16.
 */
public class AgeComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return  Integer.compare(o1.getAge(), o2.getAge());
    }
}
