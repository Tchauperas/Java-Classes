package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employees> emp = new ArrayList<>();

        System.out.print("How many employees will be registred? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            emp.add(new Employees(id, name, salary));
        }

        System.out.println("List of employees: ");
        for (Employees Emp : emp) {
            System.out.println(Emp.getId() + ", " + Emp.getName() + ", " + Emp.getSalary());
        }

        sc.close();
    }
}
