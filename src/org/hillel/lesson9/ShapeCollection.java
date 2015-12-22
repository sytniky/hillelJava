package org.hillel.lesson9;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by yuriy on 22.12.15.
 */
public class ShapeCollection {
    private Collection<Shape> collection;

    public ShapeCollection(Collection<Shape> collection) {
        this.collection = collection;
    }

    public ShapeCollection() {
        this(new ArrayList<Shape>());
    }

    public void setCollection(Collection<Shape> collection) {
        this.collection = collection;
    }

    public boolean add(Shape shape) {
        return collection.add(shape);
    }

    public double calcTotalArea() {
        double totalArea = 0;
        for (Shape shape : collection) {
            totalArea += shape.calcArea();
        }
        return totalArea;
    }

    public double calcTotalPaintConsumption() {
        double totalPaintConsumption = 0;
        for (Shape shape : collection) {
            totalPaintConsumption += shape.calcPaintConsumption();
        }
        return totalPaintConsumption;
    }

    public double calcTotalPaintCost() {
        double totalPaintCost = 0;
        for (Shape shape : collection) {
            totalPaintCost += shape.calcPaintCost();
        }
        return totalPaintCost;
    }

    @Override
    public String toString() {
        return "ShapeCollection{" +
                "collection=" + collection +
                '}';
    }
}
