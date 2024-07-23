import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros seram digitados? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for(int i = 0; i < n; i++) {
            System.out.print(vect[i] + " ");
        }
        System.out.println();

        double sum = 0;
        for(int i = 0; i < n; i++) {
            sum += vect[i];
        }
        double avg = sum / vect.length;

        System.out.println("SOMA = " + sum);
        System.out.println("MEDIA = " + avg);

        sc.close();
    }
}
