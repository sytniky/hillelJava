package org.hillel.lesson5.container;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Created by yuriy on 23.11.15.
 */
public class QuickSort {

    public final Random rand = new Random();

    private void swap(Object[] array, int i, int j) {
        Object tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private int partition(Object[] array, int begin, int end, Comparator cmp) {
        int index = begin + rand.nextInt(end - begin + 1);
        Object pivot = array[index];
        swap(array, index, end);
        for (int i = index = begin; i < end; ++i) {
            if (cmp.compare(array[i], pivot) <= 0) {
                swap(array, index++, i);
            }
        }
        swap(array, index, end);
        return (index);
    }

    private void qsort(Object[] array, int begin, int end, Comparator cmp) {
        if (end > begin) {
            int index = partition(array, begin, end, cmp);
            qsort(array, begin, index - 1, cmp);
            qsort(array, index + 1, end, cmp);
        }
    }

    public void sort(Object[] array, Comparator cmp) {
        qsort(array, 0, array.length - 1, cmp);
    }

    public static void main(String[] args) {

        Integer[] testArr = new Integer[]{2, 0, 1};

        System.out.println(Arrays.toString(testArr));

        QuickSort qs = new QuickSort();
        qs.sort(testArr, new Comparator<Integer>() {
            public int compare(Integer p1, Integer p2) {
                return p1.compareTo(p2);
            }
        });

        System.out.println(Arrays.toString(testArr));


//        Random rand = new Random();
//        System.out.println(rand.nextInt(5));

    }
}