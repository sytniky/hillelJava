package org.hillel.lesson3;

import java.util.Arrays;

/**
 * Created by yuriy on 08.11.15.
 */
public class Test {
    public static void main(String[] args) {

        int[] results = new int[100];
        for (int i = 0; i < 100; i++) {
            System.out.print("i: " + i + " ");
            double rand = Math.random();
            System.out.print("rand: " + rand + " ");
            double bigRand = rand * i;
            System.out.print("bigRand: " + bigRand + " ");
            int intRand = (int) bigRand;
            System.out.print("intRand: " + intRand + "\n");
            results[i] = intRand;
        }

        System.out.println(Arrays.toString(results));
        Arrays.sort(results);
        System.out.println(Arrays.toString(results));

//        int i = 10;
//        int[] arr;
//        arr = new int[]{1, 2, 3, 4, 5, 6};
//        int[] test = new int[i];
//        arr[0] = 1;
//        System.out.println(arr);
//
//        for (int j = 0; j < arr.length; j++) {
//            System.out.println(arr[j]);
//            j++;
//        }
//
//        for (int j : arr) {
//            System.out.print(j);
//        }
//
//        int[][] arr2 = new int[10][10];
//        System.out.println(arr2[0][1]);
//
//        for (int[] a : arr2) {
//            for (int elem : a) {
//                System.out.print(elem);
//            }
//        }
//
//        int[][] arr3 = new int[2][];
//        int[] f = new int[5];
//        int[] s = new int[7];
//        arr3[0] = f;
//        arr3[1] = s;
//
//        System.out.println(arr3[0][1]);
//
//        for (int[] a : arr3) {
//            for (int elem : a) {
//                System.out.print(elem);
//            }
//        }
//
////        System.out.println("Hello world!");
////		double test = Double.POSITIVE_INFINITY;
////		System.out.println(test);
//		add(1,2);
//		add(2.3,2.3);
//		add(2,2.3);
//		add(2,2.3F);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (hasAsterisk(i, j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    private static boolean hasAsterisk(int i, int j) {
        return (i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0);
    }

    private static double add(double f, double s) {
        System.out.println("double");
        double result = f + s;
        return result;
    }

    private static double add(int f, float s) {
        System.out.println("int float");
        double result = f + s;
        return result;
    }

    private static double add(int f, int s) {
        System.out.println("int");
        double result = f + s;
        return result;
    }
}
