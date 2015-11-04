package org.hillel.lesson2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by yuriy on 04.11.15.
 */
public class MultipleNumber {

    public static boolean isMultiple(long firstNum, long secondNum) {
        if (firstNum % secondNum == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String getSequence(long num) {

        String resSeq = " ";
        for (int i = 1; i <= Math.abs(num); i++) {
            if (isMultiple(num, i)) {
                resSeq += i + " ";
            }
        }

        return resSeq;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer: ");

        if (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            String seq = MultipleNumber.getSequence(number);
            System.out.printf("The number: %s is multiple to sequence: %s", number, seq);
        } else {
            System.out.printf("The entered value: %s is not an integer", scanner.next());
        }
    }
}
