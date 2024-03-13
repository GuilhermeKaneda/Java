import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l1, c1, l2, c2;
        System.out.print("Qual o tamanho das linhas da primeira matriz? ");
        l1 = in.nextInt();
        System.out.print("Qual o tamanho das colunas da primeira matriz? ");
        c1 = in.nextInt();
        System.out.print("Qual o tamanho das linhas da segunda matriz? ");
        l2 = in.nextInt();
        System.out.print("Qual o tamanho das colunas da segunda matriz? ");
        c2 = in.nextInt();

        if (c1 == l2) {
            int[][] matriz = new int[l1][c1];
            int[][] matriz2 = new int[l2][c2];
            int[][] matriz3 = new int[l1][c2];
            int n, j, p, som = 0;

            System.out.println("Escolha os números da primeira matriz: ");
            for(int i = 0; i < l1; i++) {
                for(j = 0; j < c1; j++) {
                    n = in.nextInt();
                    matriz[i][j] = n;
                }
                System.out.println();
                j = 0;
            }

            System.out.println("Escolha os números da segunda matriz: ");
            for(int k = 0; k < l2; k++) {
                for(j = 0; j < c2; j++) {
                    n = in.nextInt();
                    matriz2[k][j] = n;
                }
                System.out.println();
                j = 0;
            }

            System.out.println("A matriz produto será: ");

            for (int h = 0; h < l1; h++) {
                for (p = 0; p < c2; p++) {
                    for (int m = 0; m < c1; m++) {
                        som += matriz[h][m] * matriz2[m][p];
                    }
                    matriz3[h][p] = som;
                    System.out.print(matriz3[h][p]);
                    som = 0;
                }
                System.out.println();
            }
        } else {
            System.out.println("O número de colunas da primeira matriz não é igual ao número de linhas da segunda matriz.");
        }
    }
}