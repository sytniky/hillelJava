package org.hillel.lesson2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by yuriy on 01.11.15.
 */
public class Calculator {

    public static double calc(String operator, double x, double y) {
        double result;
        switch (operator) {
            case "+":
                result = sum(x, y);
                break;
            case "-":
                result = subtract(x, y);
                break;
            case "*":
                result = multiply(x, y);
                break;
            case "/":
                result = devide(x, y);
                break;
            default:
                result = 0.00;
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
        boolean operatorAccepted = false;
        String operator;
        Scanner sc;

        for (int i = 0; i < operands.length; i++) {
            boolean operandAccepted = false;
            do {
                System.out.print("Please input " + (i + 1) + " number: ");

                sc = new Scanner(System.in);
                sc.useLocale(Locale.US);

                if (sc.hasNextDouble()) {
                    double val = sc.nextDouble();
                    operands[i] = val;
                    operandAccepted = true;
                    System.out.println("Your input <"
                            + val + "> as a " + (i + 1) + " number");
                } else {
                    System.out.println("Invalid input value: " + sc.next());
                }
            } while (!operandAccepted);
        }

        do {
            System.out.print("Please input operator (+, -, *, /): ");

            sc = new Scanner(System.in);
            operator = sc.next();
            switch (operator) {
                case "+":
                case "-":
                case "*":
                case "/":
                    operatorAccepted = true;
                    System.out.println("Your input operator <"
                            + operator + ">");
                    break;
                default:
                    System.out.println("Invalid operator: " + operator);
            }
        } while (!operatorAccepted);

        System.out.println("-------------------------------");

        System.out.println("Result of operation '"
                + operator + "' is <"
                + Calculator.calc(operator, operands[0], operands[1]) + ">");

    }
}
