package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Students std;

        System.out.print("Quantos alunos seram registrados? ");
        int n = sc.nextInt();
        Students[] vect = new Students[n];

        for(int i = 0; i < n; i++) {
            System.out.println("Digite o nome e as notas do " + (i + 1) + "º aluno");
            sc.nextLine();
            String name = sc.nextLine();
            double gd1 = sc.nextDouble();
            double gd2 = sc.nextDouble();
            vect[i] = new Students(name, gd1, gd2);
        }

        double avg = 0;
        System.out.println("Alunos aprovados:");
        for(int i = 0; i < n; i++) {
            avg = (vect[i].getGd1() + vect[i].getGd2()) / 2; 
            if(avg >= 6) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}