package application;

import java.util.ArrayList;
import java.util.Scanner;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<AbstractShape> shapes = new ArrayList<>();

        System.out.print("Figuras a inserir: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Formato (c / r): ");
            char f = sc.next().charAt(0);

            if (f == 'r') {
                System.out.print("Altura: ");
                double height = sc.nextDouble();
                System.out.print("Largura: ");
                double width = sc.nextDouble();
                shapes.add(new Rectangle(Color.BLACK, width, height));
            } else {
                System.out.print("Raio: ");
                double radius = sc.nextDouble();
                shapes.add(new Circle(Color.WHITE, radius));
            }
        }

        for (AbstractShape shape : shapes) {
            System.out.println(shape);
        }

        sc.close();
    }
}
