package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Bank;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bk = new Bank(); 
        
        System.out.print("Enter account number: ");
        int acc = sc.nextInt();
        bk.setAcc(acc);

        System.out.print("Enter accout holder: ");
        String name = sc.nextLine();
        bk.setName(name);

        System.out.print("Is there a inicial deposit (y/n)? ");
        String response = sc.nextLine();

        if (response == "y") {
            System.out.print("Enter inicial deposit value: ");
            double value = sc.nextDouble();
            bk.deposito(value);
        } 

        System.out.println("Account data: ");
        System.out.println(bk.toString());

        sc.close();
    }
}
