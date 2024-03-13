import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[3][2];
        int[][] matriz2 = new int[2][2];
        int[][] matriz3 = new int[3][2];
        int j = 0, n;

        System.out.println("Escolha os números da primeira matriz: ");
        for(int i = 0; i < 3; i++) {
            for(j = 0; j < 2; j++) {
                n = in.nextInt();
                matriz[i][j] = n;
            }
            System.out.println();
            j = 0;
        }

        System.out.println("Escolha os números da segunda matriz: ");
        for(int k = 0; k < 2; k++) {
            for(j = 0; j < 2; j++) {
                n = in.nextInt();
                matriz2[k][j] = n;
            }
            System.out.println();
            j = 0;
        }

        System.out.println("A matriz produto será: ");

        for (int h = 0; h < 3; h++) {
            for (j = 0; j < 2; j++) {
                matriz3[h][j] = matriz[h][0] * matriz2[0][j] + matriz[h][1] * matriz2[1][j];
                System.out.print(matriz3[h][j] + " ");
            }
            System.out.println();
            j = 0;
        }
    }
}