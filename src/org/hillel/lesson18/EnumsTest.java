package org.hillel.lesson18;

/**
 * Created by yuriy on 04.02.16.
 */
public class EnumsTest {
    int fruit = Fruit.APPLE_RED;
    int fruit2 = 3;

    Apple apple = Apple.RED;

    public static void main(String[] args) {
        Cat cat = new Cat("Mic", 4, Color.BLACK);
        switch (cat.getColor()) {
            case WHITE:
                System.out.println("WHITE");
                break;
            case BLACK:
                System.out.println(cat.getColor().getColorValue());
                break;
        }

        for (Color color : Color.values()) {
            System.out.println(color.getColorValue());
        }

        Numbers numbers = Numbers.THREE;
        System.out.println(numbers.printOrginal());
    }
}

class Fruit {
    public static final int APPLE_RED = 1;
    public static final int APPLE_YELLOW = 2;
}

enum Apple {
    RED,
    YELLOW;
}

enum Numbers {
    ONE(1),
    TWO(2),
    THREE(3);

    private int orgNumber;

    Numbers(int orgNumber) {
        this.orgNumber = orgNumber;
    }

    public int printOrginal() {
        return ordinal() + 1;
    }
}

enum Color {
    BLACK("Black cat"),
    WHITE("White cat"),
    BLUE("Blue cat");

    private String colorValue;

    Color(String colorValue) {
        this.colorValue = colorValue;
    }

    public String getColorValue() {
        return colorValue;
    }
}

class Cat {
    String name;
    int age;
    Color color;

    public Cat(String name, int age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
