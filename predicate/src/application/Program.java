package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();
        
        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.5));
        list.add(new Product("HD Case", 80.90));

        //Predicate<Product> pred = p -> p.getPrice() >= 100.0;

        list.removeIf(p -> p.getPrice() >= 100.0);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
