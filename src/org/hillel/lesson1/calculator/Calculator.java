package org.hillel.lesson1.calculator;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by yuriy on 01.11.15.
 */
public class Calculator {

    public static Double calc(Character operator, Double x, Double y) {
        Double result;
        switch (operator) {
            case '+': result = sum(x, y); break;
            case '-': result = subtract(x, y); break;
            case '*': result = multiply(x, y); break;
            case '/': result = devide(x, y); break;
            default: result = 0.00;
        }
        return result;
    }

    public static Double sum(Double x, Double y) {
        return x + y;
    }

    public static Double subtract(Double x, Double y) {
        return x - y;
    }

    public static Double multiply(Double x, Double y) {
        return x * y;
    }

    public static Double devide(Double x, Double y) {
        if (0 == y) throw new RuntimeException("Division by zero");
        return x / y;
    }

    public static void main(String[] args) {

        Double[] operands = new Double[2];
        Character[] operators = new Character[] {'+', '-', '*', '/'};
        Scanner sc;

        for (int i = 0; i < operands.length; i++) {
            boolean accepted = false;
            do {
                System.out.print("Please input " + (i + 1) + " number: ");

                sc = new Scanner(System.in);
                sc.useLocale(Locale.US);

                if (sc.hasNextDouble()) {
                    Double val = sc.nextDouble();
                    operands[i] = val;
                    accepted = true;
                    System.out.println("Your input <"
                            + val + "> as a " + (i + 1) + " number");
                } else {
                    System.out.println("Invalid input value: " + sc.next());
                }
            } while (!accepted);
        }

        for (Character operator : operators) {
            System.out.println("Result of operation '"
                    + operator + "' is <"
                    + Calculator.calc(operator, operands[0], operands[1]) + ">");
        }
    }
}
