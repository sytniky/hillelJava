package org.hillel.lesson3;

import java.util.Scanner;

/**
 * Created by yuriy on 09.11.15.
 */
public class DigitsSum {
    public static void main(String[] args) {

        System.out.println("Please, input number:");
        Scanner scanner = new Scanner(System.in);
        int number;
        number = scanner.nextInt();
        System.out.println(digitsSum(number));
    }

    static int digitsSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }
}
