package org.hillel.lesson10;

/**
 * Created by yuriy on 15.12.15.
 */
public class Temp {
    private static Temp instance = null;
    public static Temp getInstance() {
        if (instance == null) {
            instance = new Temp();
        }
        return instance;
    }
}
