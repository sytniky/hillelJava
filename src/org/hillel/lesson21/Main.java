package org.hillel.lesson21;

import java.lang.reflect.Field;

/**
 * Created by yuriy on 22.02.16.
 */
public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car(new GermanEngine());
        car.setMirror(new Mirror());

        Class cls = Car.class;
        Field field = cls.getDeclaredField("wheel");
        field.setAccessible(true);
        field.set(car, new Wheel());

        System.out.println(car.getEngine());
    }
}

class Car {
    private Engine engine;
    private Mirror mirror;
    private Wheel wheel;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setMirror(Mirror mirror) {
        this.mirror = mirror;
    }

    public Engine getEngine() {
        return engine;
    }
}

interface Engine {
}

class GermanEngine implements Engine {
    public String toString() {
        return "German engine init";
    }
}

class ChinaEngine implements Engine {
    public String toString() {
        return "China engine init";
    }
}

class Mirror {

}

class Wheel {

}
