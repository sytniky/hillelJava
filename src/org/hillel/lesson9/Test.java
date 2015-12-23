package org.hillel.lesson9;

import org.hillel.lesson9.color.Black;
import org.hillel.lesson9.color.White;
import org.hillel.lesson9.shape.Circle;
import org.hillel.lesson9.shape.Parallelogram;
import org.hillel.lesson9.shape.Square;
import org.hillel.lesson9.shape.Triangle;

/**
 * Created by yuriy on 08.12.15.
 */
public class Test {
    public static void main(String[] args) {

        ShapeCollection shapeCollection = new ShapeCollection();
        shapeCollection.add(new Circle(new White(0.2, 300), 20));
        shapeCollection.add(new Square(new Black(1, 100), 2));
        shapeCollection.add(new Triangle(new Black(2, 200), 2, 4));
        shapeCollection.add(new Parallelogram(new White(1, 350), 1, 2));

        System.out.println(shapeCollection);
        System.out.println();

        System.out.println("Total area: " + shapeCollection.calcTotalArea());
        System.out.println("Total paint consumption: " + shapeCollection.calcTotalPaintConsumption());
        System.out.println("Total paint cost: " + shapeCollection.calcTotalPaintCost());
    }
}
