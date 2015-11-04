package org.hillel.lesson2;

import java.util.Scanner;

/**
 * Created by yuriy on 05.11.15.
 */
public class Rectangle {

    public void draw(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (isBorder(i, j, height, width)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private boolean isBorder(int i, int j, int height, int width) {
        return i == 0 || i == height - 1 || j == 0 || j == width - 1;
    }

    private static String getParamName(int param) {
        switch (param) {
            case 1:
                return "width";
            case 2:
                return "height";
            default:
                return "ERROR PARAM NAME";
        }
    }

    public static void main(String[] args) {

        Scanner sc;
        int[] dimensions = new int[2];

        for (int i = 0; i < dimensions.length; i++) {

            boolean dimensionsAccepted = false;
            String paramName = Rectangle.getParamName(i + 1);

            do {
                System.out.print("Please input " + paramName + ": ");

                sc = new Scanner(System.in);

                if (sc.hasNextInt()) {
                    int val = sc.nextInt();
                    dimensions[i] = val;
                    dimensionsAccepted = true;
                    System.out.println("Your input <"
                            + val + "> as a " + paramName);
                } else {
                    System.out.println("Invalid param value: " + sc.next());
                }
            } while (!dimensionsAccepted);
        }

        Rectangle rectangle = new Rectangle();
        rectangle.draw(dimensions[0], dimensions[1]);
    }
}
