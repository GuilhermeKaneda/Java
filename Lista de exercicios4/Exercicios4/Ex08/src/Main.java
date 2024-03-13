import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[6][6];
        int j = 0, n;

        for(int i = 1; i < 6; i++) {
            for(j = 1; j < 6; j++) {
                n = in.nextInt();
                matriz[i][j] = n;
            }
            System.out.println();
            j = 0;
        }

        for(int h = 1; h < 6; h++) {
            System.out.println(matriz[h][h] + " ");
        }
    }
}