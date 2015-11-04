package org.hillel.lesson2;

import java.util.Scanner;

/**
 * Created by yuriy on 04.11.15.
 */
public class PrimeNumber {

    public static boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if ((number % i) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the integer: ");

        if (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            if (PrimeNumber.isPrime(number)) {
                System.out.printf("The number: %d is prime", number);
            } else {
                System.out.printf("The number: %d is not prime", number);
            }
        } else {
            System.out.printf("The entered value: %s is not an integer", scanner.next());
        }
    }
}
