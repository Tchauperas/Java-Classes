package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Products;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Products pd = new Products();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        pd.name = sc.nextLine();
        System.out.print("Price: ");
        pd.price = sc.nextDouble();
        System.out.print("Quantity on stock: ");
        pd.quantity = sc.nextInt();

        System.out.println("Product data: " + pd.toString());

        System.out.print("Enter the products added in stock: ");
        int add = sc.nextInt();
        pd.addProducts(add);

        System.out.println("Updated data: " + pd.toString());

        System.out.print("Enter the products removed in stock: ");
        int del = sc.nextInt();
        pd.removeProducts(del);

        System.out.println("Updated data: " + pd.toString());

        sc.close();
    }
}
