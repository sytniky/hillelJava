package org.hillel.lesson2;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yuriy on 02.11.15.
 */
public class Test {
    public static void main(String[] args) {

        // TEST SEQUENCE
        int[] seq = new int[50];
        for (int i = 0, j = -15; i < seq.length; i++, j++) {
            seq[i] = j;
        }
        System.out.println(Arrays.toString(seq));

        for (int i : seq) {
            if (PrimeNumber.isPrime(i)) {
                System.out.print(i + " ");
            }
        }

//        System.out.print(Long.MAX_VALUE);


//        List<Integer> list = new LinkedList<Integer>();
//        List<Integer> ls = Arrays.asList(1, 2, 3);
//        System.out.println(ls);
//
//
//        Collections.addAll(list, 1, 2);
//        System.out.println(list);

//        int i = 0;
//        while (i <= 10) {
//            System.out.println(i);
//            i = i + 1;
//        }
//
//        int j = 0;
//        do {
//            System.out.println(j);
//            j = j + 1;
//        } while (j <= 10);
//
//        for (int k = 0; k <= 10; k++) {
//            System.out.println(k);
//        }

//        Double first = 2.3;
//        Double second = 23d;
//
//        String operation = "+";

//        if (operation == 0) {
//            System.out.println(first + second);
//        } else if (operation == 1) {
//            System.out.println(first - second);
//        } else if (operation == 2) {
//            System.out.println(first * second);
//        } else if (operation == 3) {
//            System.out.println(first / second);
//        } else {
//            System.out.println("Error");
//        }


//        switch (operation) {
//            case "+":
//                System.out.println(first + second);
//                break;
//            case "-":
//                System.out.println(first - second);
//                break;
//            case "*":
//                System.out.println(first * second);
//                break;
//            case "/":
//                System.out.println(first / second);
//                break;
//            default:
//                System.out.println("Error");
//                break;
//        }

//        String srting = "Hello " + "YURIY";
//        System.out.println(srting);
//
//        int i = 0;
//        if (i == 0)
////            System.out.print("i is 0");
//            System.out.print("Something " + i);
    }

}
