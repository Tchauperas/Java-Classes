package application;

import java.util.ArrayList;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Program {
    public static void main(String[] args) {
        
        ArrayList<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3, 2));
        myShapes.add(new Circle(2));

        ArrayList<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2));
        myCircles.add(new Circle(3));

        System.out.println("Total area: " + totalArea(myCircles));
    }

    public static double totalArea(ArrayList<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}
