package org.hillel.lesson9;

/**
 * Created by yuriy on 22.12.15.
 */
public abstract class Shape {

    private String name;
    private Color color;

    public Shape(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double calcArea();

    public double calcPaintConsumption() {
        return calcArea() * getColor().getConsumption();
    }

    public double calcPaintCost() {
        return calcPaintConsumption() * getColor().getCost();
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
