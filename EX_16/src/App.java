import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Linhas: ");
        int x = sc.nextInt();
        System.out.print("Colunas: ");
        int y = sc.nextInt();
        int[][] mat = new int[x][y];

        for(int l = 0; l < x; l++) {
            for(int c = 0; c < y; c++) {
                mat[l][c] = sc.nextInt();
            }
        }

        System.out.print("Position: ");
        int pL = sc.nextInt();
        int pC = sc.nextInt();
        System.out.println("Left: " + mat[pL][pC - 1]);
        System.out.println("Right: " + mat[pL][pC + 1]);
        System.out.println("Down: " + mat[pL + 1][pC]);

        sc.close();
    }
}
