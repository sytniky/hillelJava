package org.hillel.lesson2;

import java.io.Console;
import java.util.*;


/**
 * Created by yuriy on 02.11.15.
 */
public class Test {

    public static void main(String[] args) {

//        Console cons = System.console();
//        String pas = cons.readLine("Password: ");
//        System.out.println(pas);


        System.out.println("Write, please, width: ");
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();

        System.out.println("Write, please, height: ");
        int heigth = scanner.nextInt();

        System.out.println("Thx, you've entered width: " + width + " and height: " +heigth);
        System.out.println("Result of task a: ");
        int i;
        int j;
//--------------------------------------------------------------
        for (i = 0; i<heigth; i++) {
            for (j = 0; j<width; j++) {
                if (i == 0 || i == heigth -1){
                    System.out.print("*");
                } else if (j == 0 || j == width -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        -----------------------------------------
        System.out.println("Result of task b: ");
        for (i = 0; i < heigth; i++) {
            for (j = 0; j < width; j++) {
                if(i==0 || j==0 || i==heigth-1 || j ==width-1){
                    System.out.print("*");
                }
                else
                if(Math.abs(i-j*(double)(heigth-1)/(width-1))<0.40 || Math.abs(j-i*(double)(width-1)/(heigth-1))<0.40) {
                    System.out.print("*");
                }
                else if (Math.abs(i-(width-1 - j)*(double)(heigth-1)/(width-1))<0.40 || Math.abs(j-(heigth-1 - i)*(double)(width-1)/(heigth-1))<0.40){
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
//        -------------------------------------
        System.out.println("Result of task c: ");
        for (i = 0; i < heigth; i++) {

            for (j = 0; j < width; j++) {

                if ((i+j) % 2 == 0 ) {
                    System.out.print("*");
                } else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}