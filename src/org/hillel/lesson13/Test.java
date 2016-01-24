package org.hillel.lesson13;

import java.util.HashSet;

/**
 * Created by yuriy on 14.01.16.
 */
public class Test {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Two");
        System.out.println(set);
    }
}
