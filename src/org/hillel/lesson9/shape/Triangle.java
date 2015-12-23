package org.hillel.lesson9.shape;

import org.hillel.lesson9.Color;
import org.hillel.lesson9.Shape;

/**
 * Created by yuriy on 23.12.15.
 */
public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(Color color, double base, double height) {
        super("triangle", color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color=" + getColor() +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}
