package org.hillel.lesson4;

/**
 * Created by yuriy on 11.11.15.
 */
public class Test {
    public static void main(String[] args) {
//        System.out.println(sum1(3));
//        System.out.println(sum2(3));
//        System.out.println(calcFibonacciSlow(50));
        System.out.println(calcFibonacciFast(50));
    }

    public static long sum1(long peek) {
        if (peek == 1) {
            return 1;
        } else {
            return peek + sum1(peek - 1);
        }
    }

    public static long sum2(long peek) {
        long sum = 0;
        while (peek >= 0) {
            sum += peek;
            peek--;
        }
        return sum;
    }

    public static long calcFibonacciSlow(long num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return calcFibonacciSlow(num - 2) + calcFibonacciSlow(num - 1);
        }
    }

    public static long[] cache = new long[51];

    public static long calcFibonacciFast(long num) {
        if (cache[(int) num] != 0) {
            return cache[(int) num];
        } else if (num == 0 || num == 1) {
            cache[(int) num] = 1;
            return 1;
        } else {
            long res = calcFibonacciFast(num - 2) + calcFibonacciFast(num - 1);
            cache[(int) num] = res;
            return res;
        }
    }
}
