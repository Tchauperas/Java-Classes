package application;

import java.util.Scanner;
import java.util.Locale;
import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter calc = new CurrencyConverter();

        System.out.print("What is the dollar price? ");
        double dolPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dolBought = sc.nextDouble();
        calc.calculation(dolPrice, dolBought);

        System.out.printf("Amount to be paid in reais: " + calc.real);

        sc.close();
    }
}
