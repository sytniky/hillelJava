package org.hillel.lesson2;

/**
 * Created by yuriy on 08.11.15.
 */
public class ChessBoard {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (hasAsterisk(i, j)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    private static boolean hasAsterisk(int i, int j) {
        return (i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0);
    }
}
