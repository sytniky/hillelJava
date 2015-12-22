package org.hillel.lesson9;

import org.hillel.lesson9.color.White;
import org.hillel.lesson9.shape.Circle;
import org.hillel.lesson9.shape.Square;

/**
 * Created by yuriy on 08.12.15.
 */
public class Test {
    public static void main(String[] args) {
        ShapeCollection shapeCollection = new ShapeCollection();
        shapeCollection.add(new Circle(new White(0.2, 300), 20));
        shapeCollection.add(new Square(new White(1, 100), 2));

        System.out.println(shapeCollection);
        System.out.println();

        System.out.println("Total area: " + shapeCollection.calcTotalArea());
        System.out.println("Total paint consumption: " + shapeCollection.calcTotalPaintConsumption());
        System.out.println("Total paint cost: " + shapeCollection.calcTotalPaintCost());
    }
}
