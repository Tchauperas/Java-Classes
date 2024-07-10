package application;

import java.util.Scanner;
import java.util.Locale;
import retangulo.Calculo;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculo ret = new Calculo();

        System.out.println("Enter rectangle width and height: ");
        ret.height = sc.nextDouble();
        ret.width = sc.nextDouble();

        System.out.println("AREA: " + ret.Area());
        System.out.println("PEIRMETER: " + ret.Perimeter());
        System.out.println("DIAGONAL: " + ret.Diagonal());


        sc.close();
    }
}
