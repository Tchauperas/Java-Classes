package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> pd = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported  (c/u/i)? ");
			char pdType = sc.next().charAt(0);
			
			switch (pdType) {
				case 'c':
					System.out.print("Name: ");
					sc.nextLine();
			}
		}
		
		sc.close();
	}
}
