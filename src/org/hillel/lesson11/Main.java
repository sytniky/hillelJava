package org.hillel.lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    }
}
