package application;

import java.text.SimpleDateFormat;
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
					String cName = sc.nextLine();
					System.out.print("Price: ");
					double cPrice = sc.nextDouble();
					pd.add(new Product(cName, cPrice));
					break;
				
				case 'u':
					System.out.print("Name: ");
					sc.nextLine();
					String uName = sc.nextLine();
					System.out.print("Price: ");
					double uPrice = sc.nextDouble();
					System.out.print("Manufacture date (DD/MM/YYYY): ");
					String date = sc.nextLine();
					SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy"); 
					
			}
		}
		
		sc.close();
	}
}
