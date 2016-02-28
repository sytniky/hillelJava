package org.hillel.algorithms;

import java.util.Arrays;

/**
 * Created by yuriy on 28.02.16.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{6, 4, 1, 7, 5, 9, 3, 2, 10, 8};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sort(array)));
    }

    static int[] sort(int[] array) {
        if (array.length <= 1) {
            return array;
        } else {
            int[] fArray = new int[array.length / 2];
            int[] sArray = new int[array.length / 2 + array.length % 2];

            for (int i = 0, j = 0, k = 0; i < array.length; i++) {
                if (i < fArray.length) {
                    fArray[j++] = array[i];
                } else {
                    sArray[k++] = array[i];
                }
            }

            fArray = sort(fArray);
            sArray = sort(sArray);
            return merge(fArray, sArray);
        }
    }

    static int[] merge(int[] fArray, int[] sArray) {

        int[] rArray = new int[fArray.length + sArray.length];
        int fIndex = 0, sIndex = 0, rIndex = 0;

        while (fIndex < fArray.length || sIndex < sArray.length) {
            if (fIndex < fArray.length && (sIndex == sArray.length || fArray[fIndex] < sArray[sIndex])) {
                rArray[rIndex] = fArray[fIndex];
                fIndex++;
            } else if (sIndex < sArray.length && (fIndex == fArray.length || sArray[sIndex] <= fArray[fIndex])) {
                rArray[rIndex] = sArray[sIndex];
                sIndex++;
            }
            rIndex++;
        }

        return rArray;
    }
}
