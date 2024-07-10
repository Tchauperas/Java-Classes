package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee rev = new Employee();

        System.out.print("Name: ");
        rev.name = sc.nextLine();
        System.out.print("Gross salary: ");
        rev.GrossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        rev.tax = sc.nextDouble();

        System.out.println("Employee: " + rev.name + ", $ " + rev.NetSalary());

        System.out.println("Which percentage to ingrease the salary? ");
        double ps = sc.nextDouble();
        rev.IncreaseSalary(ps);

        System.out.println(rev.toString());

        sc.close();
    }
}
