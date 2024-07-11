package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Grades;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Grades grd = new Grades();

        System.out.println("Submit the name and the three grades: ");
        grd.name = sc.nextLine();
        grd.nt1 = sc.nextDouble();
        grd.nt2 = sc.nextDouble();
        grd.nt3 = sc.nextDouble();
        grd.student(grd.nt1, grd.nt2, grd.nt3);
        
        System.out.println(grd.toString());

        sc.close();
    }
}
