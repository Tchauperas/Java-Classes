package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> emp = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y / n)? ");
			sc.nextLine();
			String out = sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			double vph = sc.nextDouble();
			if(out == "y") {
				System.out.println();
			}
		}
		
		
		sc.close();
	}
}
