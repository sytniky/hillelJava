package org.hillel.lesson10;

/**
 * Created by yuriy on 15.12.15.
 */
public class Test {
    public static void main(String[] args) {
        Temp f = Temp.getInstance();
        Temp s = Temp.getInstance();
        System.out.println(f.equals(s));
    }
}
