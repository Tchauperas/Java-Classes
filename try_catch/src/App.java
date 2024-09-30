import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                String[] vect = sc.nextLine().split(" ");
                int position = sc.nextInt();
                System.out.println(vect[position]);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor inválido");
            } catch (ArrayIndexOutOfBoundsException f) {
                System.out.println("Não tem item com indice correspondente");
            }
        }

        System.out.println("End of the application");
        sc.close();
    }
}