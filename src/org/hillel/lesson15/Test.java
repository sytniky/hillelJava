package org.hillel.lesson15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by yuriy on 25.01.16.
 */
public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.readFile();

//        String[] array = new String[5];
//        test.getElement(array, 5);

//        test.devideByZero();
//        test.testCase('t');
//        test.testFloat();
    }

    public void readFile() {
        File file = new File("test.txt");
        FileReader fileReader = null;
        try {
            int k = 5;
            k = k / 0;
            fileReader = new FileReader(file);
        } catch (FileNotFoundException | ArithmeticException e) {
            StackTraceElement[] stackTraceElement = e.getStackTrace();
            System.out.println(stackTraceElement);
        } finally {
            try {
                fileReader.close();
            } catch (RuntimeException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getElement(String[] array, int index) {
        String value = array[index];
        return value;
    }

    public void devideByZero() {
        int k = 5;
        k = k / 0;
    }

    public void testCase(char t) {
        switch (t) {
            case 'a':
            case 'b':
                System.out.println("a-b");
                break;
            case 't':
                System.out.println("NONE");
            default:
                System.out.println("YES");
        }
    }

    public void testFloat() {
        float f = 3.8f;
        double d = 5.5;
        if (((int) (f + d)) == ((int) f + (int) d)) {
            System.out.println("FALSE");
        } else {
            System.out.println("TRUE");
        }
    }
}
