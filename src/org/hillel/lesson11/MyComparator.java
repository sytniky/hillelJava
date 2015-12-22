package org.hillel.lesson11;

import java.util.Comparator;

/**
 * Created by yuriy on 21.12.15.
 */
public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else {
            return 0;
        }
    }
}
