package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Person;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Person ps;

        System.out.print("Quantas pessoas? ");
        int n = sc.nextInt();
        Person[] vect = new Person[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            vect[i] = new Person(name, age, height);
        }

        double sum = 0;
        for(int i = 0; i < n; i++) {
            sum += vect[i].getHeight();
        }

        double mid = sum / vect.length;

        System.out.printf("Altura media %.2f%n", mid);

        double agePct = 0;
        for(int i = 0; i < n; i++) {
            if(vect[i].getAge() < 16) {
                agePct += vect[i].getAge();
                agePct -= (agePct - 1);
            }
        }

        double percentage = (agePct / vect.length) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percentage);

        String ageName;
        for(int i = 0; i < n; i++) {
            if(vect[i].getAge() < 16) {
                ageName = vect[i].getName();
                System.out.println(ageName);
            }
        }

        sc.close();
    }
}