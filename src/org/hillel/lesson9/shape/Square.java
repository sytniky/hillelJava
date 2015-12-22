package org.hillel.lesson9.shape;

import org.hillel.lesson9.Color;
import org.hillel.lesson9.Shape;

/**
 * Created by yuriy on 22.12.15.
 */
public class Square extends Shape {

    private double sideLength;

    public Square(Color color, double sideLength) {
        super("square", color);
        this.sideLength = sideLength;
    }

    @Override
    public double calcArea() {
        return Math.pow(sideLength, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "color=" + getColor() + "," +
                "sideLength=" + sideLength +
                '}';
    }
}
