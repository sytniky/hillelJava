package org.hillel.algorithms;

import java.util.Arrays;

/**
 * Created by yuriy on 02.03.16.
 */
public class InsertionSort {

    public static void sort(Comparable[] a) {
        int size = a.length;
        for (int i = 1; i < size; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[]{23, 23, 4, 2, 5, 6, 45, 3, 43, 26, 567, 2, 1, 48, 9};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
