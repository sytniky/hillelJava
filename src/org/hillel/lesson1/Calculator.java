package org.hillel.lesson1;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by yuriy on 01.11.15.
 */
public class Calculator {

    public static double calc(char operator, double x, double y) {
        double result;
        switch (operator) {
            case '+': result = sum(x, y); break;
            case '-': result = subtract(x, y); break;
            case '*': result = multiply(x, y); break;
            case '/': result = devide(x, y); break;
            default: result = 0.00;
        }
        return result;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double devide(double x, double y) {
        if (0 == y) throw new RuntimeException("Division by zero");
        return x / y;
    }

    public static void main(String[] args) {

        double[] operands = new double[2];
        char[] operators = new char[] {'+', '-', '*', '/'};
        Scanner sc;

        for (int i = 0; i < operands.length; i++) {
            boolean accepted = false;
            do {
                System.out.print("Please input " + (i + 1) + " number: ");

                sc = new Scanner(System.in);
                sc.useLocale(Locale.US);

                if (sc.hasNextDouble()) {
                    double val = sc.nextDouble();
                    operands[i] = val;
                    accepted = true;
                    System.out.println("Your input <"
                            + val + "> as a " + (i + 1) + " number");
                } else {
                    System.out.println("Invalid input value: " + sc.next());
                }
            } while (!accepted);
        }

        for (char operator : operators) {
            System.out.println("Result of operation '"
                    + operator + "' is <"
                    + Calculator.calc(operator, operands[0], operands[1]) + ">");
        }
    }
}
