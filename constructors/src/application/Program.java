package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Products;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity on stock: ");
        int quantity = sc.nextInt();

        Products pd = new Products(name, price, quantity);

        System.out.println("Product data: " + pd.toString());

        System.out.print("Enter the products added in stock: ");
        int addRev = sc.nextInt();
        pd.addProducts(addRev);

        System.out.println("Updated data: " + pd.toString());

        System.out.print("Enter the products removed in stock: ");
        addRev = sc.nextInt();
        pd.removeProducts(addRev);

        System.out.println("Updated data: " + pd.toString());

        sc.close();
    }
}
