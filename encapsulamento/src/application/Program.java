package application;

import java.util.Scanner;
import java.util.Locale;
import util.Grades;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Grades gd = new Grades();

        System.out.print("Student name: ");
        String name = sc.nextLine();
        gd.setName(name);
        System.out.println("Student grades: ");
        double nt1 = sc.nextDouble();
        double nt2 = sc.nextDouble();
        gd.setGrades(nt1, nt2);

        System.out.print("Name and media: ");
        System.out.print(gd.getName() + gd.toString());

        sc.close();
    }
}
