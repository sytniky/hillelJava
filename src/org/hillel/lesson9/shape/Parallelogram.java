package org.hillel.lesson9.shape;

import org.hillel.lesson9.Color;
import org.hillel.lesson9.Shape;

/**
 * Created by yuriy on 23.12.15.
 */
public class Parallelogram extends Shape {

    private double firstDiagonal;
    private  double secondDiagonal;

    public Parallelogram(Color color, double firstDiagonal, double secondDiagonal) {
        super("parallelogram", color);
        this.firstDiagonal = firstDiagonal;
        this.secondDiagonal = secondDiagonal;
    }

    @Override
    public double calcArea() {
        return 0.5 * firstDiagonal * secondDiagonal;
    }

    @Override
    public String toString() {
        return "Parallelogram{" +
                "color=" + getColor() +
                ", firstDiagonal=" + firstDiagonal +
                ", secondDiagonal=" + secondDiagonal +
                '}';
    }
}
