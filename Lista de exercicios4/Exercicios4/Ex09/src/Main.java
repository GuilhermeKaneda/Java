import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int j = 0, n;

        for(int i = 0; i < 5; i++) {
            for(j = 0; j < 5; j++) {
                n = in.nextInt();
                matriz[i][j] = n;
            }
            System.out.println();
            j = 0;
        }

        for(int h = 4; h >= 0; h--) {
            System.out.println(matriz[h][h] + " ");
        }
    }
}