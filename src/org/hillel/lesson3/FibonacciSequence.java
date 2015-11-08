package org.hillel.lesson3;

import java.util.Scanner;

/**
 * Created by yuriy on 08.11.15.
 */
public class FibonacciSequence {
    public static void main(String[] args) {

//        int[] testArr = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
//        for (int number : testArr) {
//            System.out.print(getValue(number) + " ");
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of fibonacci sequence: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.printf("Invalid number: %d of fibonacci sequence", number);
            } else {
                System.out.printf(
                        "The value of %d number of the fibonacci sequence is: %d",
                        number, getValue(number)
                );
            }
        } else {
            System.out.printf("Invalid number: %s of fibonacci sequence", scanner.next());
        }

    }

    public static int getValue(int n) {
        if (0 == n || 1 == n) {
            return n;
        } else {
            int val = 0;
            int[] seq = new int[n];
            seq[0] = 0;
            seq[1] = 1;
            for (int i = 2; i <= n; i++) {
                val = seq[i - 2] + seq[i - 1];
                if (i == n) {
                    break;
                } else {
                    seq[i] = val;
                }
            }
            return val;
        }
    }
}
