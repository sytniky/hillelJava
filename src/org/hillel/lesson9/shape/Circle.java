package org.hillel.lesson9.shape;

import org.hillel.lesson9.Color;
import org.hillel.lesson9.Shape;

/**
 * Created by yuriy on 22.12.15.
 */
public class Circle extends Shape {

    private double radius;

    public Circle(Color color, double radius) {
        super("circle", color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color=" + getColor() +
                ", radius=" + radius +
                '}';
    }
}
