package org.hillel.lesson2;

import java.util.Scanner;

/**
 * Created by yuriy on 04.11.15.
 */
public class EvenNumber {

    public static boolean isEven(long number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer: ");

        if (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            if (EvenNumber.isEven(number)) {
                System.out.printf("The number: %d is even", number);
            } else {
                System.out.printf("The number: %d is odd", number);
            }
        } else {
            System.out.printf("The entered value: %s is not an integer", scanner.next());
        }
    }
}
