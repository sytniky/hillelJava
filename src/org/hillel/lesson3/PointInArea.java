package org.hillel.lesson3;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by yuriy on 08.11.15.
 */
public class PointInArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double[][] points = new double[3][2];

        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                boolean accepted = false;
                do {
                    System.out.printf(
                            "Enter coordinate %s%d of %s point: ",
                            coordName(j),
                            j,
                            pointName(i)
                    );
                    if (scanner.hasNextDouble()) {
                        points[i][j] = scanner.nextDouble();
                        accepted = true;
                    } else {
                        System.out.printf(
                                "Invalid value: %s of coordinate %s%d of %s point!!!\n",
                                scanner.next(),
                                coordName(j),
                                j,
                                pointName(i)
                        );
                    }
                } while (!accepted);
            }
        }

        if (isPointInArea(points[0], points[1], points[2])) {
            System.out.println("Test point id in area");
        } else {
            System.out.println("Test point is not in area");
        }
    }

    static String pointName(int n) {
        String name;
        switch (n) {
            case 0:
                name = "left top";
                break;
            case 1:
                name = "right bottom";
                break;
            default:
                name = "test";
                break;
        }
        return name;
    }

    static String coordName(int n) {
        String name;
        switch (n) {
            case 0:
                name = "X";
                break;
            case 1:
                name = "Y";
                break;
            default:
                name = "";
                break;
        }
        return name;
    }

    static boolean isPointInArea(
            double[] topLeftPoint,
            double[] bottomRightPoint,
            double[] testPoint
    ) {
        if ((topLeftPoint[0] <= testPoint[0]
                && testPoint[0] <= bottomRightPoint[0])
                && (topLeftPoint[1] <= testPoint[1]
                && testPoint[1] <= bottomRightPoint[1])
                ) {
            return true;
        } else {
            return false;
        }
    }
}
