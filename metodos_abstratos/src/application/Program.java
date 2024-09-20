package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

import entities.enums.Color;
import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Shape> shp = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data");
            System.out.print("Rectangle or circle (r/c)? ");
            char shape = sc.next().charAt(0);

            if (shape == 'r') {
                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next());
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                shp.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Color (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next());
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                shp.add(new Circle(color, radius));
            }
        }

        System.out.println("SHAPE AREAS:");
        for (Shape sp : shp) {
            System.out.println(sp.area());
        }

        sc.close();
    }
}
