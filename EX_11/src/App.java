import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        int numPar = 0;
        int qnt = 0;
        for(int i = 0; i < n; i++) {
            if(vect[i] % 2 == 0) {
                numPar += vect[i];
                qnt++;
            }
        }

        if(qnt == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double avg = numPar / qnt;
            System.out.println("MEDIA DOS PARES: " + avg);
        }

        sc.close();
    }
}
/*teste */