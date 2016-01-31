package org.hillel.lesson16;

import java.util.Comparator;

/**
 * Created by yuriy on 28.01.16.
 */
public class ReverseAgeComparator<T> implements Comparator<T> {

    private Comparator<T> comparator;

    public ReverseAgeComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    @Override
    public int compare(T o1, T o2) {
        return comparator.compare(o2, o1);
    }
}
