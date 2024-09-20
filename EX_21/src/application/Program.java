package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<TaxPayer> list = new ArrayList<>();
        
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ic = sc.next().charAt(0);

            if (ic == 'i') {
                System.out.print("Name: ");
                
            }
        }

        sc.close();
    }
}
