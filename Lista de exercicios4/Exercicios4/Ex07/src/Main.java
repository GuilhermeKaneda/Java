import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[6][6];
        int j = 0, n, maiorC = 0, maiorL = 0, som = 0;

        for(int i = 1; i < 6; i++) {
            for(j = 1; j < 6; j++) {
                n = in.nextInt();
                matriz[i][j] = n;
            }
            System.out.println();
            j = 0;
        }

        for(int h = 1; h < 6; h++) {
            for(j = 1; j < 6; j++) {
                som += matriz[h][j];
            }
            if(som > maiorC) {
                maiorC = som;
            }
            som = 0;
            j = 0;
        }

        for(int k = 1;  k< 6; k++) {
            for(j = 1; j < 6; j++) {
                som += matriz[j][k];
            }
            if(som > maiorL) {
                maiorL = som;
            }
            som = 0;
            j = 0;
        }

        System.out.println("A maior soma das linhas é: " + maiorC);
        System.out.println("A menor soma das colunas é: " + maiorL);
    }
}