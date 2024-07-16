package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Bank;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Bank bk = new Bank(); 

        sc.close();
    }
}
