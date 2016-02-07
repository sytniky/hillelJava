package org.hillel.lesson18;

import java.util.Random;

/**
 * Created by yuriy on 04.02.16.
 */
public class SingletonTest {
    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.makeSomething();

        SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;
        singletonEnum2.makeSomething();
    }
}

class Singleton {
    private static Singleton INSTANCE = null;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}

enum SingletonEnum {
    INSTANCE;

    private int value;

    SingletonEnum() {
        Random random = new Random(47);
        value = random.nextInt(10);
        System.out.println(value);
    }

    public void makeSomething() {
        System.out.println("Something: " + value);
    }
}
