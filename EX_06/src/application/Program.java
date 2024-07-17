package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Bank;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bk;
        
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there a inicial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter inicial deposit value: ");
            double inicialDeposit = sc.nextDouble();
            bk = new Bank(number, holder, inicialDeposit);
        } else {
            bk = new Bank(number, holder);
        }

        System.out.println();
        System.out.println(bk.toString());

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        bk.deposit(deposit);

        System.out.println(bk.toString());

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        bk.withdraw(withdraw);

        System.out.println(bk.toString());

        sc.close();
    }
}
